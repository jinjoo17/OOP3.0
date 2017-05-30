
import java.util.List;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J111 {

	public static void main(String[] args) {
		
		MemberDAO dao=new MemberDAO();
		List<MemberVO> list=dao.memList();
		for(MemberVO vo : list){
			System.out.println(vo);
		}
		
	}

}
