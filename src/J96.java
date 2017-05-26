//JDBC API import

import java.sql.*;
public class J96 {

	public static void main(String[] args) {
		//DB접속 url,user,password
		String url="jdbc:mysql://127.0.0.1:3306/member";
		String user="root";//관리자 처음 만들어진 계정
		String password="!BitCom0228";
		try {
			//MySQL Driver loading
			Class.forName("org.gjt.mm.mysql.Driver");
			//Connection 객체생성
			Connection conn=DriverManager.getConnection(url, user, password);
			//Q)회원이름이 추가된 회원을 삭제하시오.
			String SQL="delete from mtbl where mname='추가됨'";
			//Statement 객체생성
		Statement st=conn.createStatement();
		int cnt=st.executeUpdate(SQL);
		if(cnt>0){
			System.out.println("삭제성공");
		}else{
			System.out.println("삭제실패");
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
