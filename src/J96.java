//JDBC API import

import java.sql.*;
public class J96 {

	public static void main(String[] args) {
		//DB���� url,user,password
		String url="jdbc:mysql://127.0.0.1:3306/member";
		String user="root";//������ ó�� ������� ����
		String password="!BitCom0228";
		try {
			//MySQL Driver loading
			Class.forName("org.gjt.mm.mysql.Driver");
			//Connection ��ü����
			Connection conn=DriverManager.getConnection(url, user, password);
			//Q)ȸ���̸��� �߰��� ȸ���� �����Ͻÿ�.
			String SQL="delete from mtbl where mname='�߰���'";
			//Statement ��ü����
		Statement st=conn.createStatement();
		int cnt=st.executeUpdate(SQL);
		if(cnt>0){
			System.out.println("��������");
		}else{
			System.out.println("��������");
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
