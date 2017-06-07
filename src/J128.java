import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class J128 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 try {
			 System.out.print("이름:");
			 String name=br.readLine();
			 System.out.print("나이:");
			 String age=br.readLine();
			 System.out.print("전화번호:");
			 String tel=br.readLine();
			 System.out.print("이메일:");
			 String email=br.readLine();
			 
			FileInputStream fis=new FileInputStream("member.xls");
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sheet=wb.getSheetAt(0);
			int rowend=sheet.getLastRowNum();
			HSSFRow row=sheet.createRow(rowend+1);
			HSSFCell cell=row.createCell(0);
			cell.setCellValue(name);
			cell=row.createCell(1);
			cell.setCellValue(age);
			cell=row.createCell(2);
			cell.setCellValue(tel);
			cell=row.createCell(3);
			cell.setCellValue(email);
			
			FileOutputStream fos=new FileOutputStream("member.xls");
			wb.write(fos);
			fos.close();
			System.out.println("삽입완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	}


