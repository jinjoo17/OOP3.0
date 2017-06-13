import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class J133 {

	public static void main(String[] args) {
		//주소입력<--> : [네이버, 구글 다음]위도,경도 정보추출(지도위치)
		 String clientId = "EtSTmgvXieLl1D6e8rUS";//애플리케이션 클라이언트 아이디값";
	     String clientSecret = "t2HLWSPybW";//애플리케이션 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("주소를 입력하세요:");
			String addr=br.readLine();
			addr=URLEncoder.encode(addr, "UTF-8");
			//System.out.println(addr);
		    //네이버에서 제공하는 오픈API주소(경로)를 알야야한다.
			String apiURL = "https://openapi.naver.com/v1/map/geocode?query=" + addr; //json
            //String apiURL = "https://openapi.naver.com/v1/map/geocode.xml?query=" + addr; // xml
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            //BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
            //Gson,simple-json;
            JSONParser par=new JSONParser();
            JSONObject obj=(JSONObject)par.parse(response.toString());
            JSONObject result=(JSONObject)obj.get("result");
            JSONArray items = (JSONArray) result.get("items");
            JSONObject item=(JSONObject) items.get(0);
            System.out.println(item.get("address"));
            JSONObject point=(JSONObject)item.get("point");
            
            System.out.println("경도:"+point.get("x"));
            System.out.println("위도:"+point.get("y"));
            	
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
