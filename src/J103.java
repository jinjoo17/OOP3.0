import java.sql.*;


public class J103 {

	public static void main(String[] args) {
		//CRUD -3 : Create ->insert SQL
		String mname="������";
		int mage=57;
		String mtel="010-777-9999";
		String memail="cocom@naver.com";
		//                                  ?(�Ķ����)
		//                                  1 2 3 4 
		String SQL="insert into mtbl values(?,?,?,?)";
		//�̿ϼ�SQL->�̸������� ���Ѽ�_>�����ϵ� SQL�� ���Ϲ޴´�.
		//1.-->mname2-->mage  ,,:����--->//�ϼ�SQL-->����
      String url="jdbc:mysql://127.0.0.1:3306/member";
      String user="root";
      String password="!BitCom0228";
      
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		    Connection conn=DriverManager.getConnection(url, user, password);
		    //SQL������ �����ϴ� ��ü �������Ѵ�.
			PreparedStatement ps=conn.prepareStatement(SQL);//->DB����(�̸�������)
			ps.setString(1, mname);
			ps.setInt(2, mage);
			ps.setString(3, mtel);
			ps.setString(4, memail);
			int cnt=ps.executeUpdate();//����--->�������� ���� �ʴ´�.(ó���ӵ��� ������)
			if(cnt>0){
				System.out.println("�Է¼���");
			}else{
				System.out.println("�Է½���");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	

	}

}
