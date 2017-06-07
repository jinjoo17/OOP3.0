import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J125 {

	public static void main(String[] args) {
		
		//게임의 상태가 아래와 같다.--->저장(파일,DB)/File(O),DB(X)--->스마트폰게임(DB-O)
		String user="홍길동";
		int item=3;
		float jum=789.33f;
		char level='B';
		//game.data
		try {
			FileOutputStream fos=new FileOutputStream("game.data");//바이트단위로저장
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeUTF(user);
			dos.writeInt(item);
			dos.writeFloat(jum);
			dos.writeChar(level);
			System.out.println("게임저장끝~~");
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
/*기본자료형을 읽고 쓰기
  DateInputStream
  DateOutputStream
  객체를 파일에저장하고 꺼내오겠다
  ObjectInputStream
  ObjectOutputStream





*/