import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import bit.api.MemberDAO;
import bit.api.MemberVO;

public class J120 {
    public static void menu(){
    	System.out.println("===회원관리프로그램(V.1.0)===");
    	System.out.println("메뉴 : 입력(I), 출력(P), 삭제(D), 검색(S), 수정(U), 종료(E)");
    	System.out.println("=============================");
    	System.out.print("메뉴를 입력하세요 :");
    	
   }
    public static void processing(){
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	String menu=null;
    	try {
			while(!(menu=br.readLine()).equals("E")){
				switch (menu.charAt(0)) {//"I"(String)-->'I'(char)
				case 'I':
					insertMethod();//입력루틴
					break;
				case 'P':
					selectMethod();//출력루틴
					break;
				case 'D':
					deleteMethod();//삭제루틴
					break;
				case 'S':
					searchMethod();//검색루틴
					break;
				case 'U':
					updateMethod();//수정루틴
					break;
				default:
					System.out.println("메뉴를 다시입력하세요");
					break;
				}
				menu();
			}//while
			System.out.println("종료");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
    }
	private static void updateMethod() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
		try{
			System.out.print("수정할 이름 :");
			String mname=br.readLine();
			System.out.print("수정할 나이:");
			int mage=Integer.parseInt(br.readLine());
			System.out.print("수정할 전화번호:");
			String mtel=br.readLine();
			System.out.print("수정할 이메일:");
			String memail=br.readLine();
			MemberVO vo=new MemberVO(mname,mage,mtel,memail);
			MemberDAO dao=new MemberDAO();
			int cnt=dao.memUpdate(vo);
			if(cnt>0){
				System.out.println("수정성공"); 
				
			}else{
				System.out.println("수정실패");
			}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
		
		
		
		
	}
	private static void searchMethod() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
    		System.out.print("검색할 이름 입력 :");
        	String mname=br.readLine();
        	MemberDAO dao=new MemberDAO();
        	MemberVO vo=dao.memByName(mname);
        	if(vo!=null){
        		System.out.println(vo);
        	}else{
        		System.out.println("검색실패");
        	}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    	
		
	}
	private static void deleteMethod() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
    		System.out.print("삭제할 이름 입력 :");
    		String mname=br.readLine();
    		MemberDAO dao= new MemberDAO();
    	   int cnt=dao.memDelete(mname);
    	   if(cnt>0){
    		   System.out.println("삭제성공");
    	   }else{
    		   System.out.println("삭제실패");
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
		System.out.print("이름:");
		String mname=br.readLine();
		System.out.print("나이:");
		int mage=Integer.parseInt(br.readLine());
		System.out.print("전화번호:");
		String mtel=br.readLine();
		System.out.print("이메일:");
		String memail=br.readLine();
		
		MemberVO vo=new MemberVO(mname,mage,mtel,memail);
		MemberDAO dao=new MemberDAO();
		int cnt=dao.memInsert(vo);
		if(cnt>0){
			System.out.println("입력성공"); 
			
		}else{
			System.out.println("입력실패");
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
