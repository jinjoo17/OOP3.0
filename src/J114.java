import java.io.*;

public class J114 {
	public static void main(String[] args){
		//ǥ�������: Ű����� �Է¹ް� -->ȭ��(�����,�ܼ�)�� ���
		//Q)Ű����κ��� ���� 1�ڸ� �Է¹޾Ƽ� ȭ������ ����غ���
		//Ű������ġ : System.in
		InputStream is=System.in;
		try {
			System.out.print("�������ڸ� �Է��ϼ���:");
			int data=is.read();//a
			System.out.print((char)data); //97(int)--a(char)
 					     
		}	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
			/*data=is.read();
			System.out.print((char)data);//13(CR)
			data=is.read();
			System.out.print((char)data);//10(LF)
			
		} 
		
		
	}
    
}
/*
I/O Programming
+ ��� : ��Ʈ��(stream) - �������� �帧(����-���)
+ �ڹٿ����� ��Ʈ���� ��ü��(Ŭ������) ����� ���Ҵ�.(java.io��Ű��)
+ ��Ʈ���� ��� -- ���, �Է�(�а� ������)
+ Ư¡ : �ܹ��⽺Ʈ��(�Է½�Ʈ��������½�Ʈ���� �и��Ǿ�����)
       : ��Ʈ���� ��Ʈ���� ����(����)����->���ɰ���**********
       
+ ��Ʈ���� �з�
- ó���ϴ� �����Ϳ� ���� �з�
    *����Ʈ������(����,����,����...) :����Ʈ��Ʈ��
    *-����Ʈ �Է½�Ʈ�� : InputStream-read()
    *-����Ʈ ��½�Ʈ�� : OutputStream-write()
    *����(�񿵾��)������ (TXT-�ѱ��� ����0) :���ڽ�Ʈ��(���ڴ����� ������ϴ� ��Ʈ��)
     -���� �Է½�Ʈ�� : Reader -read()
     -���� ��½�Ʈ�� : Writer - write(),print()
- ó���ϴ� ����� ���� �з�
    *��彺Ʈ��:����µ����Ϳ� ������������Ǵ� ��Ʈ�� ex)InputStream
    *���ͽ�Ʈ�� :��彺Ʈ���� ����(����)�Ͽ� ����� ������ ������Ű�� ��Ʈ��
    *            (�ܵ����Ұ�),Buffered~~
    *�긴����Ʈ�� : ���ͽ�Ʈ���� �������� Ư���� ��쿡 ����ϴ� ��Ʈ��
    *             (�ܵ����Ұ�) - 2��
    *             ������ ���� �迭�� �����ϴ°� �⺻�ε� �긴����Ʈ���� ���δٸ� �迭����
    *             �����Ҽ� �ִ�
    *             InputStreamReader,OutputStreamWriter

*/