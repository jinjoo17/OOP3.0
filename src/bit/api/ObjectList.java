package bit.api;

public class ObjectList {
//[[��簴ü]]�� �����ҹ迭�ʿ��ϴ�.
	
	private Object[] obj;
	private int addCnt;//0���� �������
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
