package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	XSSFWorkbook workbook ;
	XSSFSheet sheet ;
	
	
	
	
	public  ExcelUtils(String projectPath,String sheetName)
	
	{
		try {
			workbook = new XSSFWorkbook(projectPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int getRowCount()
	{
		int rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;
		
	}
	
	public int getColCount()
	{
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		return colCount; 
	}
	
	public String getCellStringValue(int row ,int col)
	{
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public double getCellNumericValue(int row,int col)
	{
		double data = sheet.getRow(row).getCell(col).getNumericCellValue();
		return data;
	}
	
	
	
	public Object[][] readExceltData()
	{
		int rowCount = getRowCount();
		int colCount = getColCount();
		
         Object[][] data = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j= 0;j<colCount;j++)
			{
				
				String cellValue = getCellStringValue(i,j);
				data[i-1][j] = cellValue;
				
			}
				
		}
		return data;
		
		
	}
	
	
	
	
	

	
	
}
