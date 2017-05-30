import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J113 {

	public static void main(String[] args) {
		
		String mname="대통미";
		
		MemberDAO dao=new MemberDAO();
		MemberVO vo=dao.memByName(mname);
		if(vo!=null){
			System.out.println(vo);
		}else{
			System.out.println("검색실패");
		}

	}

}
