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
			String SQL="insert into mtbl values('�߰���',30,'010-222-1365','dji@empas.com')";
			Connection conn=DriverManager.getConnection(url,user,password);
			Statement st=conn.createStatement();
			st.executeUpdate(SQL);
			System.out.println("���Լ���");
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	
		
		
		
		//-- ip �ּ�,port��ȣ,database�̸�
		//-- user : �����
		//-- password 
		
		
		//����ó������ - ���ؾߵȴ�(Ȯ�ο���) or ���ص� �ȴ�.(��Ȯ�ο���)
		  try{
			 //���ܰ� �߻��������ڵ�
			 //if���ܰ� �߻��ϸ�==> JVM����--->�������ܰ� (?)����Ȯ��
			 //(����Ŭ������ ã�´�)
			 //-->  ClassNotFoundException-->���ܰ�ü�� �����Ѵ�.
			 //-->  new ClassNotFoundException("���ܸ޼���");
			 //-->IOException-->new IOException("���ܸ޼���");
		  }catch(Exception e){//���� ������
			                            //e=>����
			  e.printStackTrace();//���ܸ޼��� ���
			  //���ܰ��߻��ϸ� ó���ϴ� �ڵ�(���}9
		  }
			  
		  }
	}



/*
  -API-(�������߸������)
  ����- ����Ʈ �������� ����: �����(����)�Ҽ��ִ� ������ ����=>[����]
        �ϵ�������ο��� : ġ����
   [���ܹ߻�]-->ó��
  <����/(����)ó�����> try~ catch~
  
     JAVA
 * JDBC-DataBase Programming     :SQL(DB���)
 
 * IO  -Input/output Programming : ��������
 * NETWORK  -  PC<-- Networking-->PC : ä��(1:1,N:n) (��Ʈ��ũ������, ��, �ȵ���̵�,����� ������ ����Ʈ���� ����� ������)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








