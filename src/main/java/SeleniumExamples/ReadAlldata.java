package SeleniumExamples;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadAlldata
{
    public static void main(String[] args) throws IOException, IOException {
    FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\selenium.xlsx");

    Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);

        int rowcount = sheet.getPhysicalNumberOfRows();
        for (int i = 1; i <= rowcount; i++)
        {
            for (int j=0;j<sheet.getRow(i).getLastCellNum();j++)
            {
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+"\t" );

            }
            System.out.println();

        }




    }
}