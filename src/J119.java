import java.io.BufferedReader;
import java.io.InputStreamReader;

import bit.api.MemberDAO;
import bit.api.MemberVO;
public class J119 {

	public static void main(String[] args) {
		// Ű����κ��� ���δ����� �����͸� �о���̴� ��Ʈ���� �����Ͻÿ�.
		//Stream�ǿ���
		//InputStream is=System.in;
		//InputStreamReader isr= new InputStreamReader(is)
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true){
			System.out.print("�Է�:I, ����:E=>");
			String menu=br.readLine();
			if(menu.toUpperCase().equals("E"))break;
			System.out.print("�̸�:");
			String mname=br.readLine();
			System.out.print("����:");
			int mage=Integer.parseInt(br.readLine());
			System.out.print("��ȭ��ȣ:");
			String mtel=br.readLine();
			System.out.print("�̸���:");
			String memail=br.readLine();
			
			MemberVO vo=new MemberVO(mname,mage,mtel,memail);
			MemberDAO dao=new MemberDAO();
			int cnt=dao.memInsert(vo);
			if(cnt>0){
				System.out.println("�Է¼���"); 
				
			}else{
				System.out.println("�Է½���");
			}
			}//while
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
