import bit.api.A;
import bit.api.B;

public class J88 {

	public static void main(String[] args) {
		
		A a=new A();
		ptr(a);
		B b= new B();
		ptr(b);
	}
     //매개변수로 A,B type을 받아서 각각의 display()실행
	
	private static void ptr(Object obj){//다형성인자(파라메터)
		if(obj instanceof A){
			((A)obj).display();
		}else{
			((B)obj).display();
		}
	}
	
}
