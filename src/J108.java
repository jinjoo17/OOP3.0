import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J108 {

	public static void main(String[] args) {
		String mname="디에이오";
		int mage=41;
		String mtel="010-4455-1234";
		String memail="abc@naver.com";
		MemberVO vo=new MemberVO(mname,mage,mtel,memail);
		MemberDAO dao=new MemberDAO();
		int cnt=dao.memInsert(vo);
		if(cnt>0){
			System.out.println("입력성공");
		}else{
			System.out.println("입력실패");
		}
		
	}

}
