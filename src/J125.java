import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J125 {

	public static void main(String[] args) {
		
		//������ ���°� �Ʒ��� ����.--->����(����,DB)/File(O),DB(X)--->����Ʈ������(DB-O)
		String user="ȫ�浿";
		int item=3;
		float jum=789.33f;
		char level='B';
		//game.data
		try {
			FileOutputStream fos=new FileOutputStream("game.data");//����Ʈ����������
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeUTF(user);
			dos.writeInt(item);
			dos.writeFloat(jum);
			dos.writeChar(level);
			System.out.println("�������峡~~");
			FileInputStream fis=new FileInputStream("game.data");
			DataInputStream dis=new DataInputStream(fis);
			String d1=dis.readUTF();
			int d2=dis.readInt();
			float d3=dis.readFloat();
			char d4=dis.readChar();
			System.out.println(d1+"\t"+d2+"\t"+d3+"\t"+d4);
			/*fos.write(user);
			fos.write(item);
			fos.write(jum);
			fos.write(level);*/
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*�⺻�ڷ����� �а� ����
  DateInputStream
  DateOutputStream
  ��ü�� ���Ͽ������ϰ� �������ڴ�
  ObjectInputStream
  ObjectOutputStream





*/