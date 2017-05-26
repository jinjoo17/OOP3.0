import java.util.ArrayList;

import bit.api.A;

public class J92 {

	public static void main(String[] args) {
		// ArrayList에 A type만 넣을수있도록 객체를 생성하시오.
		ArrayList<A> list=new ArrayList<A>();
		list.add(new A());
		list.add(new A());
		list.add(new A());
		list.add(new A());
		
		for(int i=0;i<list.size();i++){
			//A a=list.get(i);
			//a.display();
			list.get(i).display();
		}
	}

}
