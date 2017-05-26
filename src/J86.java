import bit.api.A;

public class J86 {

	public static void main(String[] args) {
		//Object 의 활용 : toString() --->객체의 번지를 문자열로 출력하는기능
		//      ↑                   ↑ override
		A a=new A();
		System.out.println(a.toString());//번지--> "홍길동"
		//---------------------------------------------------------------------
		//            Object(toString())
		
		//               ↑
		String s=new String("APPLE");// toString()재정의 되어있음
		System.out.println(s.toString());//번지 or APPLRE
		
	}

}
