
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import bit.api.MemberVO;
public class J102 {

	public static void main(String[] args) {
		
		//CRUD-Read -> select SQL (★)
		//전체회원을 나이를 기준으로 내림차순 정렬하여 출력하시오.
		String url="jdbc:mysql://127.0.0.1:3306/member";
		String user="root";
		String password="!BitCom0228";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			String SQL="select * from mtbl order by mage desc";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(SQL);
			List<MemberVO> list =new ArrayList<MemberVO>();
			while(rs.next()){
				String mname=rs.getString("mname");
				int mage=rs.getInt("mage");
				String mtel=rs.getString("mtel");
				String memail=rs.getString("memail");
				//vo-->ArrayList
				MemberVO vo =new MemberVO(mname, mage, mtel,memail);
				list.add(vo);
				System.out.println(mname+"\t"+mage+"\t"+mtel+"\t"+memail);
			}
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
