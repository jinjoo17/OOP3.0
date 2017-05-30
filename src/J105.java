import java.sql.*;

public class J105 {

	public static void main(String[] args) {
		// CRUD- Delete : delete SQL
		String mname="스프링";
		String url="jdbc:mysql://127.0.0.1:3306/master";
		String user="root";
		String password="!BitCom0228";
		//
		String SQL="delete from mtbl where mname=?";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, mname);
			int cnt=ps.executeUpdate();
			if(cnt>0){
				System.out.println("성공");
			}else{
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
