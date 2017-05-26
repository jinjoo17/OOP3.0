package bit.api;

public class MemberVO {

   private String mname ;
   private int mage;
   private String mtel;
   private String memail;
   
public MemberVO() {
	super();
	// TODO Auto-generated constructor stub
}
public MemberVO(String mname, int mage, String mtel, String memail) {
	super();
	this.mname = mname;
	this.mage = mage;
	this.mtel = mtel;
	this.memail = memail;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public int getMage() {
	return mage;
}
public void setMage(int mage) {
	this.mage = mage;
}
public String getMtel() {
	return mtel;
}
public void setMtel(String mtel) {
	this.mtel = mtel;
}
public String getMemail() {
	return memail;
}
public void setMemail(String memail) {
	this.memail = memail;
}
@Override
public String toString() {
	return "MemberVO [mname=" + mname + ", mage=" + mage + ", mtel=" + mtel + ", memail=" + memail + "]";
}
 
} 
