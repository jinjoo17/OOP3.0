import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

public class J132 {

	public static void main(String[] args) {
		//특정 웹사이트에 접속해서 내가 원하는 부분만 가져오기(크롤링)
		//http://www.su.or.kr
		
		String url="http://www.su.or.kr/03bible/daily/qtView.do?qtType=QT1&year=2017&month=6&day=9";
		try {
			URL u=new URL(url);//url경로가 맞는지 확인함
			//jericho - API
			Source src = new Source(u);//u경로의 html의 정보를 보여줌
			List<Element> list = src.getAllElements(HTMLElementName.P);
			for(int i=0;i<list.size();i++){
				String ptag=list.get(i).toString();
				if(ptag.indexOf("subject")!=-1){
					//System.out.println(ptag);
					int start=ptag.indexOf(">");
					int end=ptag.lastIndexOf("<");
					String title=ptag.substring(start+1, end);
					System.out.println("제목:"+title);
					break;
				}
			}
			
			for(int i=0;i<list.size();i++){
				String ptag=list.get(i).toString();
				if(ptag.indexOf("[")!=-1){
					int start = ptag.indexOf("[");
					int end=ptag.indexOf("]");
					ptag.substring(start,end+1);
					System.out.println("본문:"+bible);
					
					int spos = ptag.indexOf(">");
					int epos=ptag.indexOf("&");
					String day = ptag.substring(spos+1,epos);
					System.out.println("본문:"+day.trim()+":"+bible);
					ptag.substring(start,end+1);
					
					
					
				//	System.out.println(ptag);
					break;
				}
			}
			
			List<Element> trlist=src.getAllElements(HTMLElementName.TR);
			//System.out.println(trlist);
			for(int i=0;i<trlist.size();i++){
				String tr = trlist.get(i).toString();
			    int ths = tr.indexOf("<th>");
			    int the = tr.indexOf("</th");
			    String num = tr.substring(ths+4, the);
			    int tds = tr.indexOf("<td>");
			    int tde = tr.indexOf("</td>");
			    String line=tr.substring(tds+4,tde);
			    System.out.println(num+":"+line);
			  
			
			}
			
			
			//System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
