package SeleniumExamples;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo
{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\selenium.xlsx");

        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("Mohan");
        Row row= sheet.getRow(0);
        Cell cell = row.getCell(0);
        String value1  = cell.getStringCellValue();
        System.out.println(value1);
        String value2  = sheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(value2);



    }
}
