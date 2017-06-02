import java.io.BufferedReader;
import java.io.FileReader;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J122 {

	public static void main(String[] args) {
		MemberDAO dao=new MemberDAO();
		try {
			FileReader fr=new FileReader("member.txt");//�ѱ��� ���Ե� txt������ �е��� ������
			BufferedReader br=new BufferedReader(fr);//Bufferd�� ����
			String data;
			int cnt=0;
			while((data=br.readLine())!=null){//readLine()�� Buffered���� �ִ� �޼���
				cnt++;
				System.out.println(cnt+":"+data);
				String[] sp=data.split("\t");//sp[0],sp[1],sp[2],sp[3]
				MemberVO vo=new MemberVO(sp[0],Integer.parseInt(sp[1]),sp[2],sp[3]);
				int v=dao.memInsert(vo);
				if(v>0){
					System.out.println("�Է¼���");
				}else{
					System.out.println("�Է½���");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
