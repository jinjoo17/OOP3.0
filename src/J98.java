import java.sql.*;


public class J98 {
	 public static void main (String[] atgs){
		 //회원전체목록을 가지고와서 출력하시오.
		 String url="jdbc:mysql://127.0.0.1:3306/member";
		 String user="root";
		 String password="!BitCom0228";
		 
		 
		 try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			String SQL="select*from mtbl";
			Statement st=conn.createStatement();
			ResultSet rs= st.executeQuery(SQL);
			while(rs.next()){
			String mname=rs.getString("mname");
			int mage=rs.getInt("mage");
			String mtel=rs.getString("mtel");
			String memail=rs.getString("memail");
			System.out.println(mname+"\t"+mage+"\t"+mtel+"\t"+memail);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }

}
