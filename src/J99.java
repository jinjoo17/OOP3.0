import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import bit.api.MemberVO;
public class J99 {
 public static void  main (String[] args){
	 
	 
	 
	 String mname="������1";
	 int mage=41;
	 String mtel="010-1111-6666";
	 String memail="bit@empas.com";
	 MemberVO vo=new MemberVO(mname,mage,mtel,memail);
	 int cnt=memInsert(vo);
	if(cnt>0){
		System.out.println("���Լ���");
		
	}else{
		System.out.println("���Խ���");
	}
	 
	 
 }
 
 public  static int memInsert(MemberVO vo){
	 String url="jdbc:mysql://127.0.0.1:3306/member";
	 String user="root";
	 String password="!BitCom0228";
	 int cnt=-1;
	 try{
	 Class.forName("org.gjt.mm.mysql.Driver");
	 Connection conn= DriverManager.getConnection(url, user, password);
	 
	 //�����Ͱ� ��������=>"+����+"
	 String SQL="insert into mtbl values('"+vo.getMname()+"',"+vo.getMage()+",'"+vo.getMtel()+"','"+vo.getMemail()+"')";
	 Statement st=conn.createStatement();
	 cnt=st.executeUpdate(SQL);
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 return cnt ;//1 or -1
 }


	
}