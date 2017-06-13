
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class J130 {

	public static void main(String[] args) {
		//http://www.mvnrepository.com
		//EXCEL-POI,PDF-iText
		
		try{
			FileOutputStream fos = new FileOutputStream("member.pdf");
						
			//1. ��Ʈ����
			String font="H2GTRM.TTF";
			//BaseFont==> static
			BaseFont bf=BaseFont.createFont(font,BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
			Font tf=new Font(bf,16);
			Font df=new Font(bf,12);
			//2. �޸𸮿� PDF������ ������.
			Document doc=new Document();
			PdfWriter.getInstance(doc,fos);
			doc.open();
			Paragraph title=new Paragraph("--ȸ�����--",tf);
			title.setAlignment("center");
			doc.add(title);
			PdfPTable tbl=new PdfPTable(5);
			tbl.addCell(new Paragraph("�̸�",tf));
			tbl.addCell(new Paragraph("����",tf));
			tbl.addCell(new Paragraph("��ȭ��ȣ",tf));
			tbl.addCell(new Paragraph("�̸���",tf));
			tbl.addCell(new Paragraph("����",tf));
			for(int i=0;i<5;i++){
				tbl.addCell(new Paragraph("ȫ�浿",df));
				tbl.addCell(new Paragraph("27",df));
				tbl.addCell(new Paragraph("010-1111-1111",df));
				tbl.addCell(new Paragraph("bit@empas.com",df));
				Image img;
				
				img = Image.getInstance("http://imgnews.naver.net/image/001/2017/06/09/AKR20170609088100005_03_i_20170609121703506.jpg?type=w540");
				tbl.addCell(img);
			}
			
			doc.add(tbl);
			doc.close();
			System.out.println("PDF�����Ϸ��");
		}catch(Exception e){
			e.printStackTrace();
		}
				
				
	
		}
		}


