import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class J118 {

	public static void main(String[] args) {
		
		// Q)Ű����κ��� �ѱ� ���ڸ� �Է¹޾Ƽ� ����Ͻÿ�.
					InputStream is=System.in;//��彺Ʈ��
					
					//Reader r=new Reader();�߻�Ŭ�����̱⶧���� �ٷ� ������
					//Reader�迭 �� ��Ʈ���ϳ��� �����ؾ���
					InputStreamReader isr=new InputStreamReader(is);//�ܵ����X,����
					BufferedReader br=new BufferedReader(isr);
					System.out.print("�ѱ� �����ڸ� �Է�:");
					try {
						while(true){
						String line=br.readLine();//���δ����� �о���δ�.
						if(line==null)break;//Ctrl+Z
						System.out.println(line);
						System.out.print("�ѱۿ����ڸ� �Է�");
						}
					}catch (Exception e) {
						e.printStackTrace();
					}
	}

}
