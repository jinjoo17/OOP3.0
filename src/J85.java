import bit.api.A;

public class J85 {

	public static void main(String[] args) {
		//A�� display�� ���۽��Ѻ���.
		//1. AŬ������ ���� �������.
		//��ü����(new)
	A a	=new A();
      a.display();
      //2.Object<--------------AŬ������ ���� ������ �ʾҴ�.
       Object b=new A();//���ɽ��áڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
        //display()x----������ ��(display())
       ((A)b).display();//�ٿ��ɽ���
	}

}
