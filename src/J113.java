import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J113 {

	public static void main(String[] args) {
		
		String mname="�����";
		
		MemberDAO dao=new MemberDAO();
		MemberVO vo=dao.memByName(mname);
		if(vo!=null){
			System.out.println(vo);
		}else{
			System.out.println("�˻�����");
		}

	}

}
