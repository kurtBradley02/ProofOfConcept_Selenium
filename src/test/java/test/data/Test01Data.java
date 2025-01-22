package test.data;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test01Data {

    static String filePath = "C:/Users/kurtb/eclipse-workspace/ProofOfConcept_Selenium/src/test/resources/TestData.xlsx";

    static Workbook workbook;
    static Sheet sheet;

    // Load the Excel file and sheet
    static void loadTestData() {
        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            workbook = new XSSFWorkbook(fis); // Open the Excel file
            sheet = workbook.getSheetAt(0);  // Get the first sheet
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Retrieve data from the sheet
    public static String getSearchData() {
        if (sheet == null) loadTestData();  // Load the sheet if not already loaded

        // Access the first cell (A1) in the sheet and return its value
        return sheet != null ? sheet.getRow(0).getCell(0).getStringCellValue() : null;
    }
}
