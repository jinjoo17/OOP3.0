import java.io.*;
import java.util.ArrayList;
import java.util.List;

import bit.api.BookVO ;
	

public class J126 {
	public static void main(String[] args) {
		List<BookVO>list=new ArrayList<BookVO>();
       BookVO vo=new BookVO("�ڹ�","ȫ�浿",12000,"�Ѻ��̵��");
       list.add(vo);
       list.add(vo);
       list.add(vo);
       
       //book.data vo��ä�� ���Ͽ� ����
       try {
		FileOutputStream fos=new FileOutputStream("book.data");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);//��ü�� ��Ʈ���� ����ϱ� ���ؼ��� ����ȭ(��ü�� �������ִ�
		//                    ��簪�� ����Ʈ���� �ٲ�°�)���� �ؾ��Ѵ�.!!!!!
		System.out.println("��ü���峡");
		
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



