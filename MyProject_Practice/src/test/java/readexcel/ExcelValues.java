package readexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelValues {
	
	public static String readData(String filePath, String Sheet, int row, int col) throws InvalidFormatException, IOException{
		
		
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(Sheet);
		Row rowNo=sh.getRow(row);
		Cell celVal = rowNo.getCell(col);		
		return celVal.toString();
		
		
	}

	
}
