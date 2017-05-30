import bit.api.MemberDAO;


public class J110 {

	public static void main(String[] args) {
		String mname="디에이오";
		
		MemberDAO dao=new MemberDAO();
		int cnt=dao.memDelete(mname);
		if(cnt>0){
			System.out.println("삭제성공");
		}else{
			System.out.println("삭제실패");
		}
	}

}
