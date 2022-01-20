package selenium_activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity13_2a {

	public static void main(String[] args) throws IOException {

	String path="src/test/resources/example.xlsx";
	Activity13_2a obj=new Activity13_2a();
	obj.writeExcel(path);
	obj.readExcel(path);
		
	}
	
	public void writeExcel(String filepath) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		List<String[]> data = new ArrayList<String[]>();
		String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
		String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
		String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
		String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};
		data.add(heading);
		data.add(row1);
		data.add(row2);
		data.add(row3);
		int rownum=0;
		for(String[] rowdata:data)
		{
			Row row=sheet.createRow(rownum++);
			int cellnum=0;
			for(String celldata:rowdata)
			{
				Cell cell=row.createCell(cellnum++);
				cell.setCellValue(celldata);
			}
		}
		
		FileOutputStream out=new FileOutputStream(new File(filepath));
		workbook.write(out);
		out.close();
		workbook.close();

	}
	
	public void readExcel(String filepath)
	{
		try {
			
			FileInputStream fin=new FileInputStream(new File(filepath));
			XSSFWorkbook workbook;
			workbook = new XSSFWorkbook(fin);
			XSSFSheet sheet=workbook.getSheetAt(0);
			Iterator<Row> rowiterator=sheet.iterator();
			while(rowiterator.hasNext())
			{
				Row row=rowiterator.next();
				Iterator<Cell> celliterator=row.cellIterator();
				while(celliterator.hasNext())
				{
					Cell cell=celliterator.next();
					switch(cell.getCellType())
					{
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+"\t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue()+"\t");
						break;
					default:
						System.out.println("Invalid value");
						break;
					}
				}
				System.out.println(" ");
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
