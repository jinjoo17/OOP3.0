import bit.api.A;
import bit.api.B;

public class J87 {

	public static void main(String[] args) {
		// Object[]
		// �� ��
		// A,BŬ������ �����ϱ����� �迭�� ����?
		//Ÿ���� ���� �ٸ�
		//1.�������迭
		Object[] obj=new Object[2];//��� Ŭ������ ������ �ִ�==>������ Ŭ���� Ÿ���� �ƴϿ��� ������ �ִ�.
		obj[0]=new A();
		obj[1]=new B();
        //----------------------
		
		//((A)obj[0]).display();
		//((B)obj[1]).display();
		
		for(int i=0;i<obj.length;i++){
			if(obj[i] instanceof A){
			((A)obj[i]).display();//instanceof������
		}else{
			((B)obj[i]).display();
		}
		
	}

}
}
