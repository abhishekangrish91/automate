package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class dataexcel {
	public WebDriver driver;
	
	public dataexcel(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public ArrayList getdata(String testcasename) throws IOException{
		ArrayList<String> arraycell= new ArrayList<String>();
		FileInputStream fis= new FileInputStream("D:\\Gitrepo\\E2Eproject\\signup.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
	int sheets= workbook.getNumberOfSheets();
//	System.out.println(workbook.getActiveSheetIndex());
//	System.out.println(sheets);
	for(int i=0;i<sheets;i++)
	{
		if(workbook.getSheetName(i).equalsIgnoreCase("signup")){
		XSSFSheet sh= workbook.getSheetAt(i);
		//identify the test case column by scanning the rows
	Iterator<Row> rows=	sh.iterator();// sheet is collection of rows
	Row firstrow= rows.next();
	Iterator<Cell> cells=firstrow.cellIterator();
	int k=0;
	int column= 0;
	while(cells.hasNext())
	{
		Cell value=cells.next();
		
		if(value.getStringCellValue().equalsIgnoreCase("testcase"))
		{
		//	k=value.getStringCellValue();
		column=k;
		
			// desired column
		}
	k++;
	
	}
	System.out.println(column);
	while(rows.hasNext())
	{
		Row r=rows.next();
		if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
		{
	Iterator<Cell> cellvalue=r.cellIterator();
	while(cellvalue.hasNext()) {
	//System.out.println(cellvalue.next().getStringCellValue());
		Cell actualdata= cellvalue.next();
		if(actualdata.getCellType()==CellType.STRING) {
	arraycell.add(actualdata.getStringCellValue());
		}
		else {
		arraycell.add(	NumberToTextConverter.toText(actualdata.getNumericCellValue()));
		//	arraycell.add(actualdata.getNumericCellValue());
		//now it will be able to read numerics from sheet as well also
		}
	}
		}
	}
	
	
	
	
	}
		
	}
	return arraycell;
	}

	
	
}


