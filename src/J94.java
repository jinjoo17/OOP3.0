import java.util.ArrayList;

import bit.api.BookVO;

public class J94 {

	public static void main(String[] args) {
		// å �������� ArrayList�� �����Ͻÿ�.
		ArrayList<BookVO>list=new ArrayList<BookVO>();
		list.add(new BookVO("�ڹ�","���ڹ�",15000,"�Ѻ�"));
		list.add(new BookVO("����Ŭ","�����",10000,"�븲"));
		list.add(new BookVO("������","������",18000,"����"));
	//å�� ������ �������� ������������ �����Ͻÿ�.
		BookVO tmp;
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i).getTitle().compareTo(list.get(j).getTitle())>0){
					  tmp=list.get(i);
        		     list.set(i,list.get(j));
        		     list.set(j, tmp);
        	}
				}
			}
		
		
		
		
		
		
		for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		}	
			//����Ŭ�̶�� å�� [���ݰ� ���ǻ�]�� ����Ͻÿ�.(�˻�;�����˻�)
			String key="����Ŭ";
			int low=0;
			int high=list.size()-1;
			int middle;
			int index=-1;
			
			while (low<=high) {
				middle=(low+high)/2;
				if(key.equals(list.get(middle).getTitle())){
				index=middle;
				break;
				}else if(key.compareTo(list.get(middle).getTitle())>0){
					low=middle+1;
				}else{
					high=middle-1;
					
				}
				
			}
			if(index!=-1){
				BookVO b=list.get(index);
				System.out.println(b.getPrice()+":"+b.getCompany());
			}else{
				System.out.println("�˻�����");
			}
			
		}
		
		
	}


