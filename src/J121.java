import java.io.*;

public class J121 {
   
  public static void main(String[] args){
	  
	  try {
		FileInputStream fis =new FileInputStream("pic.jpg");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		FileOutputStream fos =new FileOutputStream("pic1.jpg");//pic1이자동으로생성됨
		BufferedOutputStream bos=new BufferedOutputStream(fos);
				
		int data;
		int cnt=0;
		while((data=bis.read())!=-1){
			cnt++;
			System.out.println(cnt+":"+data);
			bos.write(data);
		}
		//bos.flush();   ===>버퍼 강제로비움
		bos.close();//flush메서드를 먼저 호출하고 close 메서드를 부름
		System.out.println("작업끝");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
	
	
	
	
	
}



/*
 [파일 데이터 처리방법]
 
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