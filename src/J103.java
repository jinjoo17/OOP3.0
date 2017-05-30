import java.sql.*;


public class J103 {

	public static void main(String[] args) {
		//CRUD -3 : Create ->insert SQL
		String mname="스프링";
		int mage=57;
		String mtel="010-777-9999";
		String memail="cocom@naver.com";
		//                                  ?(파라메터)
		//                                  1 2 3 4 
		String SQL="insert into mtbl values(?,?,?,?)";
		//미완성SQL->미리컴파일 시켜서_>컴파일된 SQL을 리턴받는다.
		//1.-->mname2-->mage  ,,:설정--->//완성SQL-->실행
      String url="jdbc:mysql://127.0.0.1:3306/member";
      String user="root";
      String password="!BitCom0228";
      
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		    Connection conn=DriverManager.getConnection(url, user, password);
		    //SQL문장을 전송하는 객체 만들어야한다.
			PreparedStatement ps=conn.prepareStatement(SQL);//->DB전송(미리컴파일)
			ps.setString(1, mname);
			ps.setInt(2, mage);
			ps.setString(3, mtel);
			ps.setString(4, memail);
			int cnt=ps.executeUpdate();//실행--->컴파일은 하지 않는다.(처리속도가 빠르다)
			if(cnt>0){
				System.out.println("입력성공");
			}else{
				System.out.println("입력실패");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	

	}

}
