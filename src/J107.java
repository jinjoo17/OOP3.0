import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bit.api.MemberVO;
public class J107 {

	public static void main(String[] args) {
	  String mname="대통미";
	  String SQL="select *from mtbl where mname=?";
	  String url="jdbc:mysql://127.0.0.1:3306/member";
	  String user="root";
	  String password="!BitCom0228";
	  
	  try {
		Class.forName("org.gjt.mm.mysql.Driver");
		Connection conn=DriverManager.getConnection(url, user, password);
		PreparedStatement ps=conn.prepareStatement(SQL);
		ps.setString(1,mname);
		MemberVO vo=null;
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			mname=rs.getString("mname");
			int mage=rs.getInt("mage");
			String mtel=rs.getString("mtel");
			String memail=rs.getString("memail");
			vo=new MemberVO(mname,mage,mtel,memail);
			
		}
		if(vo!=null){
			System.out.println(vo);
		}else{
			System.out.println("검색실패");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}

}
