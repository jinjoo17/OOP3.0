import java.sql.*;
public class J97 {

	public static void main(String[] args) {
		//Q) �����ȸ���� ��ȭ��ȣ�� �̸��� �ּҸ� �����Ͻÿ�.
		//010-1111-0191, 1004@empas.com
		String url="jdbc:mysql://127.0.0.1:3306/member";
		String user="root";
		String password="!BitCom0228";
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			String SQL="update mtbl set mtel='010-111-0191',memail='1004@empas.com' where mname='�����'";
			Statement st=conn.createStatement();
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

//update mtbl set mname='���ڱ�'where mname='�̹���';
//delete mtbl 
