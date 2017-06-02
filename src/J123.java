import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J123 {

	public static void main(String[] args) {
		//DB에서 data를 가져와서 파일에 쓰기
		
		try {
			
			MemberDAO dao=new MemberDAO();
			List<MemberVO>list=dao.memList();
			FileWriter fw= new FileWriter("memberList.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			for(MemberVO vo: list){
				bw.write(vo.getMname()+"\t"+vo.getMage()+"\t"+vo.getMtel()+"\t"+vo.getMemail());
				bw.newLine();//줄바꿈
			}
			bw.close();
			System.out.println("작업끝~~");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
