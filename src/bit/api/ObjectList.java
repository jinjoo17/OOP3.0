package bit.api;

public class ObjectList {
//[[모든객체]]를 저장할배열필요하다.
	
	private Object[] obj;
	private int addCnt;//0값이 들어있음
	public ObjectList(){
		this(10);
	}
	public ObjectList(int cnt){
		obj=new Object[cnt];
	}
	public void add(Object data){
		obj[addCnt++]=data;
		
	}
	public Object get(int index){
		return obj[index];
	}
	public int size(){
		return addCnt;
	}
}
