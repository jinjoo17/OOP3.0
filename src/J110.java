import bit.api.MemberDAO;


public class J110 {

	public static void main(String[] args) {
		String mname="���̿�";
		
		MemberDAO dao=new MemberDAO();
		int cnt=dao.memDelete(mname);
		if(cnt>0){
			System.out.println("��������");
		}else{
			System.out.println("��������");
		}
	}

}
