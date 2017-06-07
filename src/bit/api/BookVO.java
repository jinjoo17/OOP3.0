package bit.api;
//책--> 제목(title),지은이(name),가격(price),출판사(company)
public class BookVO implements java.io.Serializable {//표시 ,마크인터페이스. 구현할게없음/J126직렬화
    private String title;
    private String name;
    private int price;
    private String company;
    
    
	public BookVO() {//디폴트 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(String title, String name, int price, String company) {
		super();//초기화
		this.title = title;
		this.name = name;
		this.price = price;
		this.company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", name=" + name + ", price=" + price + ", company=" + company + "]";
	}
    
    
	
}
