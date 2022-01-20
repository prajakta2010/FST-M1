package selenium_activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13_2b {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		String path="src/test/resources/example.xlsx";
		Activity13_2b obj=new Activity13_2b();
		List<List<String>> data =obj.readExcel(path);
		List<String> row;
		driver.get("https://www.training-support.net/selenium/simple-form");	
		row=data.get(3);
		System.out.println("ROW  "+row);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(row.get(1));
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(row.get(2));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(row.get(3));
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(row.get(4));
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Alert message=driver.switchTo().alert();
		System.out.println("Alert message: " + message.getText());
		message.accept();
		driver.close();



	}

	public List<List<String>> readExcel(String filepath)
	{
		List<List<String>> data = new ArrayList<List<String>>();
		try {

			FileInputStream fin=new FileInputStream(new File(filepath));
			XSSFWorkbook workbook;
			workbook = new XSSFWorkbook(fin);
			XSSFSheet sheet=workbook.getSheetAt(0);
			Iterator<Row> rowiterator=sheet.iterator();
			while(rowiterator.hasNext())
			{
				List<String> rowData = new ArrayList<String>();
				Row row=rowiterator.next();
				Iterator<Cell> celliterator=row.cellIterator();
				while(celliterator.hasNext())
				{
					Cell cell=celliterator.next();
					rowData.add(cell.getStringCellValue());
				}
				System.out.println(" ");
				data.add(rowData);
			}

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
