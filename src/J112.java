import java.util.List;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J112 {

	public static void main(String[] args) {
		//--- �˻� (like)----
		//�̸��� "����"��� ���ڰ� ���Ե� ���ȸ���� ����Ͻÿ�.
		//"������","������",
		//�̸��� "��"���� ������ ���ȸ���� ����Ͻÿ�.
		//�̸��� "��"���� ���� ���ȸ���� ����Ͻÿ�.
		
		String key ="����";
		MemberDAO dao=new MemberDAO();
		List<MemberVO> list=dao.memLikeList(key);
		for(MemberVO vo : list){
			System.out.println(vo);
		}
		
	}

}
