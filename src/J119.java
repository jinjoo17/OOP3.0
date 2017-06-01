import java.io.BufferedReader;
import java.io.InputStreamReader;

import bit.api.MemberDAO;
import bit.api.MemberVO;
public class J119 {

	public static void main(String[] args) {
		// 키보드로부터 라인단위로 데이터를 읽어들이는 스트림을 연결하시오.
		//Stream의연쇄
		//InputStream is=System.in;
		//InputStreamReader isr= new InputStreamReader(is)
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true){
			System.out.print("입력:I, 종료:E=>");
			String menu=br.readLine();
			if(menu.toUpperCase().equals("E"))break;
			System.out.print("이름:");
			String mname=br.readLine();
			System.out.print("나이:");
			int mage=Integer.parseInt(br.readLine());
			System.out.print("전화번호:");
			String mtel=br.readLine();
			System.out.print("이메일:");
			String memail=br.readLine();
			
			MemberVO vo=new MemberVO(mname,mage,mtel,memail);
			MemberDAO dao=new MemberDAO();
			int cnt=dao.memInsert(vo);
			if(cnt>0){
				System.out.println("입력성공"); 
				
			}else{
				System.out.println("입력실패");
			}
			}//while
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
