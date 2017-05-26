import bit.api.A;
import bit.api.B;

public class J87 {

	public static void main(String[] args) {
		// Object[]
		// ↑ ↑
		// A,B클래스를 저장하기위한 배열을 생성?
		//타입이 서로 다름
		//1.다형성배열
		Object[] obj=new Object[2];//모든 클래스를 담을수 있다==>동일한 클래스 타입이 아니여도 담을수 있다.
		obj[0]=new A();
		obj[1]=new B();
        //----------------------
		
		//((A)obj[0]).display();
		//((B)obj[1]).display();
		
		for(int i=0;i<obj.length;i++){
			if(obj[i] instanceof A){
			((A)obj[i]).display();//instanceof연산자
		}else{
			((B)obj[i]).display();
		}
		
	}

}
}
