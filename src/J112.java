import java.util.List;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J112 {

	public static void main(String[] args) {
		//--- 검색 (like)----
		//이름에 "변수"라는 문자가 포함된 모든회원을 출력하시요.
		//"나변수","변수나",
		//이름이 "문"으로 시작한 모든회원을 출력하시요.
		//이름이 "중"으로 끝난 모든회원을 출력하시요.
		
		String key ="변수";
		MemberDAO dao=new MemberDAO();
		List<MemberVO> list=dao.memLikeList(key);
		for(MemberVO vo : list){
			System.out.println(vo);
		}
		
	}

}
