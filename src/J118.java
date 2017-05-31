import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class J118 {

	public static void main(String[] args) {
		
		// Q)키보드로부터 한글 한자를 입력받아서 출력하시오.
					InputStream is=System.in;//노드스트림
					
					//Reader r=new Reader();추상클래스이기때문에 바로 못만듦
					//Reader계열 중 스트림하나를 선택해야함
					InputStreamReader isr=new InputStreamReader(is);//단독사용X,연쇄
					BufferedReader br=new BufferedReader(isr);
					System.out.print("한글 여러자를 입력:");
					try {
						while(true){
						String line=br.readLine();//라인단위로 읽어들인다.
						if(line==null)break;//Ctrl+Z
						System.out.println(line);
						System.out.print("한글여러자를 입력");
						}
					}catch (Exception e) {
						e.printStackTrace();
					}
	}

}
