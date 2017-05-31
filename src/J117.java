import java.io.InputStream;
import java.io.InputStreamReader;

public class J117 {

	public static void main(String[] args) {
		
			// Q)키보드로부터 한글 한자를 입력받아서 출력하시오.
			InputStream is=System.in;//노드스트림
			System.out.print("한글 여러자를 입력:");
			//Reader r=new Reader();추상클래스이기때문에 바로 못만듦
			//Reader계열 중 스트림하나를 선택해야함
			InputStreamReader isr=new InputStreamReader(is);//단독사용X,연쇄
			try {
				while(true){
				int data=isr.read();//Ctrl+Z
				if(data==-1)break;
				System.out.print((char)data);
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

}
