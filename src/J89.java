import bit.api.IntList;

public class J89 {

	public static void main(String[] args) {
		//ArrayList API�� �䳻����....
		//[�迭�� ����]--> ũ�Ⱑ ����
		//           --> ������ �ڷḸ ���尡��
		//  Q)���� 5���� �����ϰ� ����غ���
		//-�迭������ �˰� �־���Ѵ�.
		//-�迭�� �𸣰� ����Ҽ��ִ� ���?(API�� ����������)
		
		int[] a=new int[5];//��迭�� �����ϴ� ����(������)
		a[0]=10;//��迭�� �����͸� �ִ� ����(�߰�--add)
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//��Ư����ġ�� �ִ� �����͸� ��� ����(���--->get)
		//��迭�� ����� ������ ���� �˾ƺ��� ���(������ ��---size)
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		IntList list = new IntList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
		
		
}
}
}
