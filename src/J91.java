import java.util.ArrayList;

import bit.api.A;
import bit.api.B;

public class J91 {

	public static void main(String[] args) {
		// A,B클래스 여러개를 배열에 저장하고 A,B클래스의
		//display()메서드를 출력하는 API를 설계
		//ArrayList-->크기의 제한을 받지않기때문,object 배열을 가지고있음
		ArrayList list=new ArrayList(4);//제네리(일반적으로)A타입만 넣겠다
		list.add(new A());
		list.add(new B());
		list.add(new A());
		list.add(new B());
		list.add(new A());
		list.add(new B());
		list.add(new A());
		list.add(new B());
		
		
		//Object o=list.get(0);//A
		//((A)o).display();
		
		//A a=(A)list.get(0);//A타입으로 다운케스팅해야함
		
		
		for(int i=0;i<list.size();i++){
			if(list.get(i)instanceof A){
				A a=(A)list.get(i);
				a.display();
				
			}else{
				B a=(B)list.get(i);
				a.display();
			}
		}
	}

}
