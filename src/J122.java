import java.io.BufferedReader;
import java.io.FileReader;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J122 {

	public static void main(String[] args) {
		MemberDAO dao=new MemberDAO();
		try {
			FileReader fr=new FileReader("member.txt");//한글이 포함된 txt파일을 읽도록 연결함
			BufferedReader br=new BufferedReader(fr);//Bufferd로 연쇄
			String data;
			int cnt=0;
			while((data=br.readLine())!=null){//readLine()은 Buffered에만 있는 메서드
				cnt++;
				System.out.println(cnt+":"+data);
				String[] sp=data.split("\t");//sp[0],sp[1],sp[2],sp[3]
				MemberVO vo=new MemberVO(sp[0],Integer.parseInt(sp[1]),sp[2],sp[3]);
				int v=dao.memInsert(vo);
				if(v>0){
					System.out.println("입력성공");
				}else{
					System.out.println("입력실패");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
