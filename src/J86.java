import bit.api.A;

public class J86 {

	public static void main(String[] args) {
		//Object �� Ȱ�� : toString() --->��ü�� ������ ���ڿ��� ����ϴ±��
		//      ��                   �� override
		A a=new A();
		System.out.println(a.toString());//����--> "ȫ�浿"
		//---------------------------------------------------------------------
		//            Object(toString())
		
		//               ��
		String s=new String("APPLE");// toString()������ �Ǿ�����
		System.out.println(s.toString());//���� or APPLRE
		
	}

}
