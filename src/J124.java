import java.io.*;

public class J124 {
	public static void main(String[] args){
		//data.txt���Ͽ��ִ� ������ ���Ͽ� ������ ������
		//result.txt���Ͽ� ����� �����ϴ� ���α׷��� ����ÿ�.
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
			bw.write(sum+"");//���ڿ��� �ٽ� �ٲ������
			bw.close();
			System.out.println("��곡");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
