import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J100 {

	public static void main(String[] args) {
		//������ȸ���� ���̿� �̸����� �Ʒ�ó�� �����Ͻÿ�.
		String mname="������";
		int mage=50;
		String memail="bitbit@naver.com";
		
		 String url="jdbc:mysql://127.0.0.1:3306/member";
		 String user="root";
		 String password="!BitCom0228";
		 
		 
		 try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			//"+����+"
			String SQL="update mtbl set mage="+mage+",memail='"+memail+"'where mname='"+mname+"' ";
			Statement st = conn.createStatement();
			int cnt=st.executeUpdate(SQL);
			if(cnt>0){
				System.out.println("����");
				
			}else{
				System.out.println("����");
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		 
		
		 
	 }

}
		
		
	

