package bit.api;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//vo-->DAO--CRUD-->MySQL(DataBase)
public class MemberDAO {//Data Access Object(DAO) : 비지니스 로직 담당

	 private Connection conn;
	 private PreparedStatement ps;
	 private ResultSet rs;
	 
	 //Connection을 생성하는 기능
	 public Connection getConnect(){
		  String url="jdbc:mysql://127.0.0.1:3306/member";
		  String user="root";
		  String password="!BitCom0228";
		  try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return conn; 
	 }
	 
	 //Create : memInsert()Method
	 public int memInsert(MemberVO vo){
		 conn=getConnect();
		 String SQL="insert into mtbl values(?,?,?,?)";
		 int cnt=-1;
		 try {
		    ps=	conn.prepareStatement(SQL);
			ps.setString(1, vo.getMname());
			ps.setInt(2, vo.getMage());
			ps.setString(3, vo.getMtel());
			ps.setString(4, vo.getMemail());
			cnt=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return cnt;
		 
		 
		 
	 }
	 //Update: memUpdate() Method
	 public int memUpdate(MemberVO vo){//나이 전화 이메일
		conn=getConnect();
		String SQL="update mtbl set mage=?,mtel=?,memail=? where mname=?";
		int cnt=-1;
		try {
			ps=conn.prepareStatement(SQL);
			ps.setInt(1,vo.getMage());
			ps.setString(2, vo.getMtel());
			ps.setString(3,vo.getMemail());
			ps.setString(4, vo.getMname());
			cnt=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	 }
	 public int memDelete(String mname){
		 conn=getConnect();
		 String SQL="delete from mtbl where mname=?";
		 int cnt=-1;
		 try {
			ps=conn.prepareStatement(SQL);
			ps.setString(1,mname);
			cnt=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();		
			}
		    return cnt;
	 }
	 //READ : memList() Method<----List<MemberVO>
	 public List<MemberVO> memList(){
		 conn=getConnect();
		 String SQL="select*from mtbl";
		 List<MemberVO> list=new ArrayList<MemberVO>();
		 try {
			ps=conn.prepareStatement(SQL);
			rs=ps.executeQuery();
			while(rs.next()){
				String mname=rs.getString("mname");
			    int mage=rs.getInt("mage");
				String mtel=rs.getString("mtel");
				String memail=rs.getString("memail");
				MemberVO vo=new MemberVO(mname,mage,mtel,memail);
				list.add(vo);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return list;
	 }
	 public List<MemberVO> memLikeList(String key){//key="*변수*"
		 conn=getConnect();
		 String SQL="select*from mtbl where mname like ?";
		 List<MemberVO> list=new ArrayList<MemberVO>();
		 try {
			ps=conn.prepareStatement(SQL);
			ps.setString(1,"%"+key+"%");
			//ps.setString(1, key+"%"); 시작을key
			//ps.setString(1, "%"+key); 끝이 key
			rs=ps.executeQuery();
			while(rs.next()){
				String mname=rs.getString("mname");
			    int mage=rs.getInt("mage");
				String mtel=rs.getString("mtel");
				String memail=rs.getString("memail");
				MemberVO vo=new MemberVO(mname,mage,mtel,memail);
				list.add(vo);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return list;
	 }
	 public MemberVO memByName(String mname){
		 conn=getConnect();
		 String SQL="select*from mtbl where mname=?";
		 MemberVO vo=null;
		 try {
			ps=conn.prepareStatement(SQL);
			ps.setString(1,mname);
			rs=ps.executeQuery();
			if(rs.next()){
				mname=rs.getString("mname");
				int mage=rs.getInt("mage");
				String mtel=rs.getString("mtel");
				String memail=rs.getString("memail");
				vo=new MemberVO(mname,mage,mtel,memail);
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
	         return vo;
	 
	 
}
}
