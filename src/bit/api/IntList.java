package bit.api;
//Q)���� �������� �����ϰ� ����غ���

public class IntList {
      private int[] arr;
      private int addCnt;//0-add-1->add->2->add->[3]
      public IntList(){//new IntList();
    	  this(10);
      }
      public IntList(int cnt){//new IntList(5);
    	  arr=new int[cnt];
      }
      public void add(int data){
    	  arr[addCnt++]=data;//arr[0]
    	 
      }
      public int get(int index){
    	  return arr[index];
      }
      public int size(){
    	  return addCnt;
      }
}
