import bit.api.A;

public class J85 {

	public static void main(String[] args) {
		//A의 display를 동작시켜보자.
		//1. A클래스를 내가 만들었다.
		//객체생성(new)
	A a	=new A();
      a.display();
      //2.Object<--------------A클래스를 내가 만들지 않았다.
       Object b=new A();//업케스팅★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
        //display()x----재정의 ↑(display())
       ((A)b).display();//다운케스팅
	}

}
