import bit.api.A;
import bit.api.B;

public class J88 {

	public static void main(String[] args) {
		
		A a=new A();
		ptr(a);
		B b= new B();
		ptr(b);
	}
     //�Ű������� A,B type�� �޾Ƽ� ������ display()����
	
	private static void ptr(Object obj){//����������(�Ķ����)
		if(obj instanceof A){
			((A)obj).display();
		}else{
			((B)obj).display();
		}
	}
	
}
