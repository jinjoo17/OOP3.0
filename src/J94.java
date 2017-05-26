import java.util.ArrayList;

import bit.api.BookVO;

public class J94 {

	public static void main(String[] args) {
		// 책 여러권을 ArrayList에 저장하시오.
		ArrayList<BookVO>list=new ArrayList<BookVO>();
		list.add(new BookVO("자바","박자바",15000,"한빛"));
		list.add(new BookVO("오라클","나디비",10000,"대림"));
		list.add(new BookVO("스프링","이프링",18000,"영진"));
	//책의 제목을 기준으로 오름차순으로 정렬하시오.
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
			//오라클이라는 책의 [가격과 출판사]를 출력하시오.(검색;이진검색)
			String key="오라클";
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
				System.out.println("검색실패");
			}
			
		}
		
		
	}


