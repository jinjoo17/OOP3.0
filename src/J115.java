import java.io.*;
public class J115 {

	public static void main(String[] args) {
		// Ű����κ��� ���������ڸ��Է¹޾Ƽ� ����Ͻÿ�?
		InputStream is=System.in;
		System.out.print("���������ڸ� �Է��ϼ���:");//abcd~~
		try {
			while(true){
		    int data=is.read();//-1(Ctrl+Z) ������ ���ױ�
		    if(data==-1)break;
		    System.out.print((char)data);
		} 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
