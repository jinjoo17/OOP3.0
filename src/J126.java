import java.io.*;
import java.util.ArrayList;
import java.util.List;

import bit.api.BookVO ;
	

public class J126 {
	public static void main(String[] args) {
		List<BookVO>list=new ArrayList<BookVO>();
       BookVO vo=new BookVO("자바","홍길동",12000,"한빛미디어");
       list.add(vo);
       list.add(vo);
       list.add(vo);
       
       //book.data vo통채로 파일에 저장
       try {
		FileOutputStream fos=new FileOutputStream("book.data");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);//객체가 스트림을 통과하기 위해서는 직렬화(객체가 가지고있는
		//                    모든값이 바이트열로 바뀌는것)가능 해야한다.!!!!!
		System.out.println("객체저장끝");
		
		FileInputStream fis=new FileInputStream("book.data");
		ObjectInputStream ois=new ObjectInputStream(fis);
		//BookVO b=(BookVO) ois.readObject();
		List<BookVO>blist=(List<BookVO>)ois.readObject();
		for(BookVO b:blist)
		System.out.println(b);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}

}
/*-VO(DTO)
 * ObjectInputStream
 * ObjectOutputStream
 */



