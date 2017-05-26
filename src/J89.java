import bit.api.IntList;

public class J89 {

	public static void main(String[] args) {
		//ArrayList API를 흉내내기....
		//[배열의 단점]--> 크기가 고정
		//           --> 동일한 자료만 저장가능
		//  Q)정수 5개를 저장하고 출력해보자
		//-배열사용법을 알고 있어야한다.
		//-배열을 모르고도 사용할수있는 방법?(API를 직접만들어보자)
		
		int[] a=new int[5];//①배열을 생성하는 동작(생성자)
		a[0]=10;//②배열에 데이터를 넣는 동작(추가--add)
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//③특정위치에 있는 데이터를 얻는 동작(얻다--->get)
		//④배열에 저장된 데이터 수를 알아보는 기능(원소의 수---size)
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
