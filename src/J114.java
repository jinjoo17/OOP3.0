import java.io.*;

public class J114 {
	public static void main(String[] args){
		//표준입출력: 키보드로 입력받고 -->화면(모니터,콘솔)로 출력
		//Q)키보드로부터 영문 1자를 입력받아서 화면으로 출력해보자
		//키보드장치 : System.in
		InputStream is=System.in;
		try {
			System.out.print("영문한자를 입력하세요:");
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
+ 용어 : 스트림(stream) - 데이터의 흐름(빨대-통로)
+ 자바에서는 스트림을 객체로(클래스로) 만들어 놓았다.(java.io패키지)
+ 스트림의 기능 -- 출력, 입력(읽고 쓰기기능)
+ 특징 : 단방향스트림(입력스트림과과출력스트림이 분리되어있음)
       : 스트림과 스트림은 연결(연쇄)가능->성능개선**********
       
+ 스트림의 분류
- 처리하는 데이터에 따라서 분류
    *바이트데이터(사진,음악,영상...) :바이트스트림
    *-바이트 입력스트림 : InputStream-read()
    *-바이트 출력스트림 : OutputStream-write()
    *문자(비영어권)데이터 (TXT-한글이 포함0) :문자스트림(문자단위로 입출력하는 스트림)
     -문자 입력스트림 : Reader -read()
     -문자 출력스트림 : Writer - write(),print()
- 처리하는 방법에 따라서 분류
    *노드스트림:입출력데이터에 가정먼저연결되는 스트림 ex)InputStream
    *필터스트림 :노드스트림과 연결(연쇄)하여 입출력 성능을 개선시키는 스트림
    *            (단독사용불가),Buffered~~
    *브릿지스트림 : 필터스트림의 일종으로 특별한 경우에 사용하는 스트림
    *             (단독사용불가) - 2개
    *             연결은 같은 계열로 연결하는게 기본인데 브릿지스트림은 서로다른 계열끼리
    *             연결할수 있다
    *             InputStreamReader,OutputStreamWriter

*/