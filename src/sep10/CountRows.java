package sep10;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountRows {

	public static void main(String[] args) {
		// read path of excel
		FileInputStream fi=new FileInputStream();
				//get workbook from file
				XSSFWorkbook wb=new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws=wb.getSheet("Login");
				//get first row from sheet
				XSSFRow row=ws.getRow(0);
				//count no of rows in a sheet
				int rc=ws.getLastRowNum();
				//count no of cells in a first row
				int cc=row.getLastCellNum();
				System.out.println("No of rows are::"+rc+"        "+"No cells are::"+cc);
		fi.close();
		wb.close();

	}

}

