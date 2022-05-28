package dataDrivenExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class dataDriven {

    public ArrayList<String> getData(String testcaseName) throws IOException {
        ArrayList<String> a = new ArrayList<String>();
        FileInputStream fis = new FileInputStream("C:\\Users\\JGuitron\\Desktop\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                //Identify Test Cases column by scanning the entire 1st row
                Iterator<Row> rows = sheet.iterator(); //sheet is collection rows
                Row firstRow = rows.next();
                Iterator<Cell> ce = firstRow.cellIterator(); //row is collection of cells
                ce.next();
                int k = 0;
                int column = 0;
                while (ce.hasNext()) {
                    Cell Value = ce.next();
                    if (Value.getStringCellValue().equalsIgnoreCase("TestCases")) {
                        //desired column
                        column = k;
                    }
                    k++;
                }
                System.out.println(column);
                //once column is identified then scan entire test case column to identify purchase test case row
                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
                        //after you grab purchase test case row = pull all the data of that row and feed into test
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
//                            if (c.getCellTypeEnum()== CellType.STRING){
//                                a.add(cv.next().getStringCellValue());
//                            }
//                           else {
//                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
//                            }

                        }
                    }
                }
            }
        }
                    return a;
                }
        public static void main (String[]args) throws IOException {
            //fileInputStream argument
        }
    }

