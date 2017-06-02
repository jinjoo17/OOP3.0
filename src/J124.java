import java.io.*;

public class J124 {
	public static void main(String[] args){
		//data.txt파일에있는 모든수를 더하여 총합을 구한후
		//result.txt파일에 결과를 저장하는 프로그램을 만드시오.
		try {
			FileReader fr=new FileReader("data.txt");
			BufferedReader br=new BufferedReader(fr);
			
			FileWriter fw=new FileWriter("result.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			String data;
			int cnt=0;
			int sum=0;
			while((data=br.readLine())!=null){
				String[] sp=data.split("\t");//sp[0],sp[1],sp[2],sp[3]
				for(int i=0;i<sp.length;i++){
					System.out.println(sp[i]);
					sum+=Integer.parseInt(sp[i]);
				}
			
			}
			bw.write(sum+"");//문자열로 다시 바꿔줘야함
			bw.close();
			System.out.println("계산끝");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
