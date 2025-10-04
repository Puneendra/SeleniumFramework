package SeleniumExamples;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteONexcell
{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\seleniumWrite.xlsx");

        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);
        Row row  = sheet.createRow(0);
        Cell cell = row.createCell(0);
                cell.setCellValue("TITTLE");

                sheet.createRow(0).createCell(1).setCellValue("JAI SRI RAM");

                FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\seleniumWrite.xlsx");
                workbook.write(fos);

    }
}
