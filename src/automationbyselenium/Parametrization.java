package automationbyselenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String getStringCellValue(String Sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Mr. Sunil\\OneDrive\\Documents\\Book1.xlsx");
		String value=WorkbookFactory.create(file).getSheet(Sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return value;
	}
	
	
}
