package bit.api;
//å--> ����(title),������(name),����(price),���ǻ�(company)
public class BookVO implements java.io.Serializable {//ǥ�� ,��ũ�������̽�. �����ҰԾ���/J126����ȭ
    private String title;
    private String name;
    private int price;
    private String company;
    
    
	public BookVO() {//����Ʈ ������
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(String title, String name, int price, String company) {
		super();//�ʱ�ȭ
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
