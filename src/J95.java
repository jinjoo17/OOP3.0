import java.sql.*;
public class J95 {

	public static void main(String[] args) {
		//MySQL---> Oracle
		// 1.
		
		
		String url="jdbc:mysql://127.0.0.1:3306/member";
		String user="root";
		String password="!BitCom0228";
		                                 
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			String SQL="insert into mtbl values('추가됨',30,'010-222-1365','dji@empas.com')";
			Connection conn=DriverManager.getConnection(url,user,password);
			Statement st=conn.createStatement();
			st.executeUpdate(SQL);
			System.out.println("삽입성공");
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	
		
		
		
		//-- ip 주소,port번호,database이름
		//-- user : 사용자
		//-- password 
		
		
		//예외처리구문 - 꼭해야된다(확인예외) or 안해도 된다.(미확인예외)
		  try{
			 //예외가 발생가능한코드
			 //if예외가 발생하면==> JVM감지--->무슨예외가 (?)인지확인
			 //(예외클래스를 찾는다)
			 //-->  ClassNotFoundException-->예외객체를 생성한다.
			 //-->  new ClassNotFoundException("예외메세지");
			 //-->IOException-->new IOException("예외메세지");
		  }catch(Exception e){//예외 다형성
			                            //e=>번지
			  e.printStackTrace();//예외메세지 출력
			  //예외가발생하면 처리하는 코드(잡다}9
		  }
			  
		  }
	}



/*
  -API-(도구가잘만들어짐)
  에러- 소프트 웨어적인 에러: 디버깅(수정)할수있는 가벼운 에러=>[예외]
        하드웨어적인에러 : 치명적
   [예외발생]-->처리
  <예외/(에러)처리기법> try~ catch~
  
     JAVA
 * JDBC-DataBase Programming     :SQL(DB언어)
 
 * IO  -Input/output Programming : 파일조작
 * NETWORK  -  PC<-- Networking-->PC : 채팅(1:1,N:n) (네트워크지향언어, 웹, 안드로이드,모바일 업무용 소프트웨이 만들기 용이함)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








