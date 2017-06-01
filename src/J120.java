import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J120 {
    public static void menu(){
    	System.out.println("===ȸ���������α׷�(V.1.0)===");
    	System.out.println("�޴� : �Է�(I), ���(P), ����(D), �˻�(S), ����(U), ����(E)");
    	System.out.println("=============================");
    	System.out.print("�޴��� �Է��ϼ��� :");
    	
   }
    public static void processing(){
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	String menu=null;
    	try {
			while(!(menu=br.readLine()).equals("E")){
				switch (menu.charAt(0)) {//"I"(String)-->'I'(char)
				case 'I':
					insertMethod();//�Է·�ƾ
					break;
				case 'P':
					selectMethod();//��·�ƾ
					break;
				case 'D':
					deleteMethod();//������ƾ
					break;
				case 'S':
					searchMethod();//�˻���ƾ
					break;
				case 'U':
					updateMethod();//������ƾ
					break;
				default:
					System.out.println("�޴��� �ٽ��Է��ϼ���");
					break;
				}
				menu();
			}//while
			System.out.println("����");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
    }
	private static void updateMethod() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
		try{
			System.out.print("������ �̸� :");
			String mname=br.readLine();
			System.out.print("������ ����:");
			int mage=Integer.parseInt(br.readLine());
			System.out.print("������ ��ȭ��ȣ:");
			String mtel=br.readLine();
			System.out.print("������ �̸���:");
			String memail=br.readLine();
			MemberVO vo=new MemberVO(mname,mage,mtel,memail);
			MemberDAO dao=new MemberDAO();
			int cnt=dao.memUpdate(vo);
			if(cnt>0){
				System.out.println("��������"); 
				
			}else{
				System.out.println("��������");
			}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
		
		
		
		
	}
	private static void searchMethod() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
    		System.out.print("�˻��� �̸� �Է� :");
        	String mname=br.readLine();
        	MemberDAO dao=new MemberDAO();
        	MemberVO vo=dao.memByName(mname);
        	if(vo!=null){
        		System.out.println(vo);
        	}else{
        		System.out.println("�˻�����");
        	}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    	
		
	}
	private static void deleteMethod() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
    		System.out.print("������ �̸� �Է� :");
    		String mname=br.readLine();
    		MemberDAO dao= new MemberDAO();
    	   int cnt=dao.memDelete(mname);
    	   if(cnt>0){
    		   System.out.println("��������");
    	   }else{
    		   System.out.println("��������");
    	   }
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
	}
	private static void selectMethod() {
		MemberDAO dao=new MemberDAO();
		List<MemberVO>list=dao.memList();
		for(MemberVO vo :list){
			System.out.println(vo);
		}
	}
	private static void insertMethod() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	try{
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
    	}catch(Exception e){
    		e.printStackTrace();
    	}
	}
	public static void main(String[] args) {
		menu();
		processing();
	}

}
