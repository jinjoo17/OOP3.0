import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import bit.api.MemberVO;

public class J131 {

	public static void main(String[] args) {
		//JSon(JavaScript Object Notation)-API(Gson):json.org
		MemberVO vo=new MemberVO("È«±æµ¿",23,"010-1111-1111","bit@empas.com");
		System.out.println(vo);
		List<MemberVO> list=new ArrayList<MemberVO>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		Gson g=new Gson();//±¸±¼¿¡¼­ API¸¸µë
		String json=g.toJson(list);
		System.out.println(json);
		
	}
	
	}
/*
   JSON (JavaScript Object Notation) is a lightweight data-interchange format

pc<-----------------------------------------------> pc
È¸¿ø(°´Ã¼)
1.text
È«±æµ¿#23#010-1111-111111#bit@empas.com$È«±æµ¿#23#010-1111-111111#bit@empas.com--------------> ?(#±¸ºÐ)
2. XML(µ¥ÀÌÅÍ±¸Á¶)¼Ó¼ºÀ» ¾µ¼öÀÖÀ½---------------------------> XML-->API
<members>
   <member>
     <name>È«±æµ¿</name>
     <age>12</age>
     <tel>010-1111-1111</tel>
     <email>bit@empas.com</email>
   </member>                   
      <member>
      <name>È«±æµ¿</name>
      <age>12</age>
      <tel part="company">010-1111-1111</tel>
      <email>bit@empas.com</email>
   </member>
</members>
3.JSON Ç¥±â¹ý
¤Ó----------------------È¸¿ø 1¸í----------------------------------------¤Ó
{"name":"È«±æµ¿","age":12,"tel":"010-1111-1111","email":"bit@empas.com"}

                      ------------------------>JSON API


*/