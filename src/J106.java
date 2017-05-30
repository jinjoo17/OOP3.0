import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bit.api.MemberVO;

public class J106 {

	public static void main(String[] args) {
		// CRUD-3--->READ: select SQL(**)
		//1.전체를 가지고 오기(VO묶어서 -->ArrayList담는다
		//2.특정데이터 한개만 가지고 오기(조건을 만족하면)
		//3.전체를 가지고 오는데 (조건을 만족하는경우)
		
		String SQl="select *from mtbl order by mname asc";//?(X)
		List<MemberVO>list=new ArrayList<MemberVO>();
		String url="jdbc:mysql://127.0.0.1:3306/member";
		String user="root";
		String password="!BitCom0228";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			PreparedStatement ps=conn.prepareStatement(SQl);
			//        rs-->커서(이동)
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
			String mname=rs.getString("mname");
			int mage=rs.getInt("mage");
			String mtel=rs.getString("mtel");
			String memail=rs.getString("memail");
			MemberVO vo=new MemberVO(mname,mage,mtel,memail);
			list.add(vo);
			
			}//
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
