import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class J127 {
	public static void main(String[] args) {
		//EXCEL -API(POI) 
		//
		
		String mname="������";
		int mage=31;
		String mtel="010-1111-1111";
		String memail="bit@naver.com";
		
		try {
			//�޸𸮿� ������ ����(WorkBook)�� �����.
			HSSFWorkbook wb=new HSSFWorkbook();
			//Sheet�� ������.
			HSSFSheet sheet=wb.createSheet("member");
			HSSFRow row=sheet.createRow(0);
			HSSFCell cell;
			cell=row.createCell(0);
			cell.setCellValue("�̸�");
			cell=row.createCell(1);
			cell.setCellValue("����");
			cell=row.createCell(2);
			cell.setCellValue("��ȭ��ȣ");
			cell=row.createCell(3);
			cell.setCellValue("�̸���");
			
						
			
			int rowidx=sheet.getLastRowNum();
			row=sheet.createRow(rowidx+1);
		    cell=row.createCell(0);
		    cell.setCellValue(mname);
		    cell=row.createCell(1);
		    cell.setCellValue(mage);
		    cell=row.createCell(2);
		    cell.setCellValue(mtel);
		    cell=row.createCell(3);
		    cell.setCellValue(memail);
		    
		    FileOutputStream fos=new FileOutputStream("member.xls");
			
		    wb.write(fos);
		    fos.close();
		    System.out.println("���������Ϸ�");
			
			} catch( Exception e) {
			e.printStackTrace();
		}
  }
}