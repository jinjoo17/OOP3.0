import java.io.*;

public class J121 {
   
  public static void main(String[] args){
	  
	  try {
		FileInputStream fis =new FileInputStream("pic.jpg");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		FileOutputStream fos =new FileOutputStream("pic1.jpg");//pic1���ڵ����λ�����
		BufferedOutputStream bos=new BufferedOutputStream(fos);
				
		int data;
		int cnt=0;
		while((data=bis.read())!=-1){
			cnt++;
			System.out.println(cnt+":"+data);
			bos.write(data);
		}
		//bos.flush();   ===>���� �����κ��
		bos.close();//flush�޼��带 ���� ȣ���ϰ� close �޼��带 �θ�
		System.out.println("�۾���");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
	
	
	
	
	
}



/*
 [���� ������ ó�����]
 
 -FileInputStream
 + BufferedInputStream
 -FileOutputStream
 +BufferedOutputStream
 //----------------------
 -FileReader
 +BufferedReader
 -FileWriter
 +BufferedWriter


*/