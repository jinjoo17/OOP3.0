import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J109 {
   public static void main(String[] args){
	   String mname="���̿�";
	   ////////////////////////////////
		int mage=41;
		String mtel="010-4455-1234";
		String memail="abc@naver.com";
		MemberVO vo=new MemberVO(mname,mage,mtel,memail);
		MemberDAO dao=new MemberDAO();
		int cnt=dao.memUpdate(vo);
		if(cnt>0){
			System.out.println("��������");
		}else{
			System.out.println("��������");
		}
   }
}
/*









*/