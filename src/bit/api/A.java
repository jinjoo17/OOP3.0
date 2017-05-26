package bit.api;

public class A extends Object {//① 최상위 클래스를 상속 생략되어있는코드
	//②디폴트 생성자
	public A(){
		super();
	}
    public void display(){
    	System.out.println("나는 A이다.");
    }
    //toString()
    public String toString(){
    	System.out.println(super.toString());
    	return "홍길동";
    }
}
