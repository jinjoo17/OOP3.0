import java.sql.*;
public class J104 {

	public static void main(String[] args) {
		// CRUD -3 :Update -> update SQL
		String mname="������";
		//�Ʒ��� �����ͷ� ���� �Ͻÿ�.
		int mage=57;
		String mtel="010-777-9999";
		String memail="cocom@naver.com";
		
		String url="jdbc:mysql://127.0.0.1:3306/member";
	    String user="root";
	    String password="!BitCom0228";
	    //                               1      2        3            4 
		String SQL="update mtbl set mage=?,mtel=?,memail=?where mname=?";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			PreparedStatement ps=conn.prepareStatement(SQL);
			
			ps.setInt(1,mage);			
			ps.setString(2, mtel);
			ps.setString(3, memail);
			ps.setString(4, mname);
			int cnt=ps.executeUpdate();
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
