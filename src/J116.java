import java.io.*;
public class J116 {

	public static void main(String[] args) {
		// Q)Ű����κ��� �ѱ� ���ڸ� �Է¹޾Ƽ� ����Ͻÿ�.
		InputStream is=System.in;//��彺Ʈ��
		System.out.print("�ѱ����ڸ� �Է�:");
		//Reader r=new Reader();�߻�Ŭ�����̱⶧���� �ٷ� ������
		//Reader�迭 �� ��Ʈ���ϳ��� �����ؾ���
		InputStreamReader isr=new InputStreamReader(is);//�ܵ����X,����
		try {
			int data=isr.read();
			System.out.println((char)data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
