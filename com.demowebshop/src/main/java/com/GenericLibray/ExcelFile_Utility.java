package com.GenericLibray;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelFile_Utility extends WebDriver_Utility
{
	/**
	 * This method is used to 
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
  public static String Excel_Data(String sheet,int row,int column) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis=new FileInputStream(Iconstant.Excel_FilePath);
	  w=WorkbookFactory.create(fis);
	  Sheet s = w.getSheet(sheet);
	  Row r = s.getRow(row);
	  Cell c = r.getCell(column);
	  String result = c.getStringCellValue();
	 
	 return result;
  }
  
  /**
   * 
   * @param sheet
   * @return
   * @throws EncryptedDocumentException
   * @throws IOException
   */
  public static int rowSize(String sheet) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis=new FileInputStream(Iconstant.Excel_FilePath);
	  w=WorkbookFactory.create(fis);
	  Sheet s = w.getSheet(sheet);
	 return s.getPhysicalNumberOfRows();
  }
  
  /**
   * 
   * @param sheet
   * @return
   * @throws EncryptedDocumentException
   * @throws IOException
   */
  public static int columnSize(String sheet) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis=new FileInputStream(Iconstant.Excel_FilePath);
	  w=WorkbookFactory.create(fis);
	  Sheet s=w.getSheet(sheet);
	  Row r = s.getRow(0);
	 return r.getPhysicalNumberOfCells();
  }
  
  /**
   * 
   * @param sheet
   * @return
   * @throws EncryptedDocumentException
   * @throws IOException
   */
  public static Object[][] excelAllData(String sheet) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis=new FileInputStream(Iconstant.Excel_FilePath);
	  w= WorkbookFactory.create(fis);
	  Sheet s = w.getSheet(sheet);
	  Object[][] data=new Object[rowSize(sheet)][columnSize(sheet)];
	  for(int i=0; i<rowSize(sheet); i++)
	  {
		  for(int j=0; j<columnSize(sheet); j++)
		  {
			  data[i][j]=s.getRow(i).getCell(j).getStringCellValue();
		  }
	  }
	  
	  return data;
	  
  }
   
  
}


