import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import bit.api.MemberVO;

public class J131 {

	public static void main(String[] args) {
		//JSon(JavaScript Object Notation)-API(Gson):json.org
		MemberVO vo=new MemberVO("ȫ�浿",23,"010-1111-1111","bit@empas.com");
		System.out.println(vo);
		List<MemberVO> list=new ArrayList<MemberVO>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		Gson g=new Gson();//�������� API����
		String json=g.toJson(list);
		System.out.println(json);
		
	}
	
	}
/*
   JSON (JavaScript Object Notation) is a lightweight data-interchange format

pc<-----------------------------------------------> pc
ȸ��(��ü)
1.text
ȫ�浿#23#010-1111-111111#bit@empas.com$ȫ�浿#23#010-1111-111111#bit@empas.com--------------> ?(#����)
2. XML(�����ͱ���)�Ӽ��� ��������---------------------------> XML-->API
<members>
   <member>
     <name>ȫ�浿</name>
     <age>12</age>
     <tel>010-1111-1111</tel>
     <email>bit@empas.com</email>
   </member>                   
      <member>
      <name>ȫ�浿</name>
      <age>12</age>
      <tel part="company">010-1111-1111</tel>
      <email>bit@empas.com</email>
   </member>
</members>
3.JSON ǥ���
��----------------------ȸ�� 1��----------------------------------------��
{"name":"ȫ�浿","age":12,"tel":"010-1111-1111","email":"bit@empas.com"}

                      ------------------------>JSON API


*/