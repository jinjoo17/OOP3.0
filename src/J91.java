import java.util.ArrayList;

import bit.api.A;
import bit.api.B;

public class J91 {

	public static void main(String[] args) {
		// A,BŬ���� �������� �迭�� �����ϰ� A,BŬ������
		//display()�޼��带 ����ϴ� API�� ����
		//ArrayList-->ũ���� ������ �����ʱ⶧��,object �迭�� ����������
		ArrayList list=new ArrayList(4);//���׸�(�Ϲ�������)AŸ�Ը� �ְڴ�
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
		
		//A a=(A)list.get(0);//AŸ������ �ٿ��ɽ����ؾ���
		
		
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
