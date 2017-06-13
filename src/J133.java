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
		//�ּ��Է�<--> : [���̹�, ���� ����]����,�浵 ��������(������ġ)
		 String clientId = "EtSTmgvXieLl1D6e8rUS";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
	     String clientSecret = "t2HLWSPybW";//���ø����̼� 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("�ּҸ� �Է��ϼ���:");
			String addr=br.readLine();
			addr=URLEncoder.encode(addr, "UTF-8");
			//System.out.println(addr);
		    //���̹����� �����ϴ� ����API�ּ�(���)�� �˾߾��Ѵ�.
			String apiURL = "https://openapi.naver.com/v1/map/geocode?query=" + addr; //json
            //String apiURL = "https://openapi.naver.com/v1/map/geocode.xml?query=" + addr; // xml
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            //BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
            } else {  // ���� �߻�
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
            
            System.out.println("�浵:"+point.get("x"));
            System.out.println("����:"+point.get("y"));
            	
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
