import java.util.ArrayList;

import bit.api.A;

public class J92 {

	public static void main(String[] args) {
		// ArrayList�� A type�� �������ֵ��� ��ü�� �����Ͻÿ�.
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
