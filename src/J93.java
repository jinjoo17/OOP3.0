import java.util.ArrayList;

public class J93 {

	public static void main(String[] args) {
		// 과일 (String)5개를 ArrayList에 저장하고 출력
		ArrayList<String> list=new ArrayList<String>();
        list.add("사과");//list.add(new String("사과");index 0
        list.add(new String("바나나"));//index 1
        list.add(new String("오렌지"));//2
        list.add(new String("포도"));//3
        list.add(new String("귤"));//4
        
        //list.clear();
        //list.remove(2);
        //System.out.println(list.indexOf("포도"));//3 indexof:검색
        //list.set(1,"망고");//set:바꾸기
        //System.out.println(list.contains("사과"));//contains : 있냐없냐?-->true
        //교환-->set으로한다
        /*String tmp;
        tmp=list.get(3);
        list.set(3, list.get(4));
        list.set(4, tmp);
        for(int i=0;i<list.size();i++){
        	System.out.println(list.get(i));*/
        
        
        for(int i=0;i<list.size()-1;i++){
        	for(int j=i+1;j<list.size();j++){
        		if(list.get(i).compareTo(list.get(j))>0){
        			String tmp1;
        		    tmp1=list.get(i);
        		     list.set(i,list.get(j));
        		     list.set(j, tmp1);
        	}
        }
        
	}
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}

}
}
