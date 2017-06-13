import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

public class J132 {

	public static void main(String[] args) {
		//Ư�� ������Ʈ�� �����ؼ� ���� ���ϴ� �κи� ��������(ũ�Ѹ�)
		//http://www.su.or.kr
		
		String url="http://www.su.or.kr/03bible/daily/qtView.do?qtType=QT1&year=2017&month=6&day=9";
		try {
			URL u=new URL(url);//url��ΰ� �´��� Ȯ����
			//jericho - API
			Source src = new Source(u);//u����� html�� ������ ������
			List<Element> list = src.getAllElements(HTMLElementName.P);
			for(int i=0;i<list.size();i++){
				String ptag=list.get(i).toString();
				if(ptag.indexOf("subject")!=-1){
					//System.out.println(ptag);
					int start=ptag.indexOf(">");
					int end=ptag.lastIndexOf("<");
					String title=ptag.substring(start+1, end);
					System.out.println("����:"+title);
					break;
				}
			}
			
			for(int i=0;i<list.size();i++){
				String ptag=list.get(i).toString();
				if(ptag.indexOf("[")!=-1){
					int start = ptag.indexOf("[");
					int end=ptag.indexOf("]");
					ptag.substring(start,end+1);
					System.out.println("����:"+bible);
					
					int spos = ptag.indexOf(">");
					int epos=ptag.indexOf("&");
					String day = ptag.substring(spos+1,epos);
					System.out.println("����:"+day.trim()+":"+bible);
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
