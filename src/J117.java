import java.io.InputStream;
import java.io.InputStreamReader;

public class J117 {

	public static void main(String[] args) {
		
			// Q)Ű����κ��� �ѱ� ���ڸ� �Է¹޾Ƽ� ����Ͻÿ�.
			InputStream is=System.in;//��彺Ʈ��
			System.out.print("�ѱ� �����ڸ� �Է�:");
			//Reader r=new Reader();�߻�Ŭ�����̱⶧���� �ٷ� ������
			//Reader�迭 �� ��Ʈ���ϳ��� �����ؾ���
			InputStreamReader isr=new InputStreamReader(is);//�ܵ����X,����
			try {
				while(true){
				int data=isr.read();//Ctrl+Z
				if(data==-1)break;
				System.out.print((char)data);
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

}
