import java.io.*;
public class J115 {

	public static void main(String[] args) {
		// 키보드로부터 영문여러자를입력받아서 출력하시오?
		InputStream is=System.in;
		System.out.print("영문여러자를 입력하세요:");//abcd~~
		try {
			while(true){
		    int data=is.read();//-1(Ctrl+Z) 강제로 끝네기
		    if(data==-1)break;
		    System.out.print((char)data);
		} 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
