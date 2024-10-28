package SeleniumPractice;

import java.io.IOException;

import com.GenericLibray.Property_File_Utility;

public class Program4Test {
	public static void main(String[] args) throws IOException {
		System.out.println(Property_File_Utility.propertyData("url"));
		System.out.println(Property_File_Utility.Excel_Data("Sheet1",0,0));

		
	}

}
