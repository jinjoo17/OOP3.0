import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import bit.api.MemberVO;

public class J129 {

	public static void main(String[] args) {
		List<MemberVO> list=new ArrayList<MemberVO>();//o
		try {
			FileInputStream fis=new FileInputStream("member.xls");
			Workbook wb=new HSSFWorkbook(fis);
			if(wb!=null){
				Sheet sheet=wb.getSheetAt(0);//0번째 시트를 Workbook가상메모리에서 가져옴.
				//행(row)의 시작, 끝
			int rows=sheet.getFirstRowNum();//0
			int rowe=sheet.getLastRowNum();//2
			System.out.println(rows+":"+rowe);
			
			//열(col)의 시작, 끝
			Row row=sheet.getRow(0);
			int cels=row.getFirstCellNum();//0
			int cele=row.getLastCellNum()-1;//3===>4=개수(index는3)
			System.out.println(cels+":"+cele);
			Row curRow;
			String[] tmp=new String[4];//0,1,2,3
			for (int i = rows+1; i <=rowe; i++) {
				curRow=sheet.getRow(i);
				for (int j = cels; j <=cele ; j++) {
					Cell cell=curRow.getCell(j);
					int type=cell.getCellType();
					if(type==1){
						tmp[j]=cell.getStringCellValue();
						
					}else if(type==0){
						tmp[j]=(int)cell.getNumericCellValue()+"";
					}
					}
					//vo묶어-->List담고
					MemberVO vo=new MemberVO(tmp[0],Integer.parseInt(tmp[1]),tmp[2],tmp[3]);
                    list.add(vo);
					
			}//for_i
				for(MemberVO v:list){
					System.out.println(v);
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
