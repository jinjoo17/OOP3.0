import java.util.ArrayList;

public class J93 {

	public static void main(String[] args) {
		// ���� (String)5���� ArrayList�� �����ϰ� ���
		ArrayList<String> list=new ArrayList<String>();
        list.add("���");//list.add(new String("���");index 0
        list.add(new String("�ٳ���"));//index 1
        list.add(new String("������"));//2
        list.add(new String("����"));//3
        list.add(new String("��"));//4
        
        //list.clear();
        //list.remove(2);
        //System.out.println(list.indexOf("����"));//3 indexof:�˻�
        //list.set(1,"����");//set:�ٲٱ�
        //System.out.println(list.contains("���"));//contains : �ֳľ���?-->true
        //��ȯ-->set�����Ѵ�
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
