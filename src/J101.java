import java.sql.*;
public class J101 {

	public static void main(String[] args) {
		// CRUD =delete : delete SQL
		
		String mname="������";//����
		
		String url="jdbc:mysql://127.0.0.1:3306/member";
		String user="root";
		String password="!BitCom0228";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			String SQL="delete from mtbl where mname='"+mname+"'";
			Statement st=conn.createStatement();
			int cnt=st.executeUpdate(SQL);
			if(cnt>0){
				System.out.println("��������");
			}else{
				System.out.println("��������");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
