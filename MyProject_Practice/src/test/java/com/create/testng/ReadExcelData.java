package com.create.testng;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
public static ArrayList<String> getInfo() throws Throwable {
	 String key = null, tab = null;
	FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Desktop\\testfile.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sht=wb.getSheetAt(0);
	int val=sht.getLastRowNum();
	HashMap< String, String > map=new HashMap<String, String>();
	ArrayList<String> arr1=new ArrayList<String>();
	ArrayList<String> arr2=new ArrayList<String>();
	for(int i=1;i<=val;i++){
		String value=sht.getRow(i).getCell(0).toString();
		//System.out.println(value);
		String status=sht.getRow(i).getCell(1).toString();
		//System.out.println(status);
		//map.put(value, status);
		if(status.equalsIgnoreCase("YES")){
			
			arr1.add(value);	
		}
		else{
			arr2.add(value);
		}
	}
//	System.out.println("YES");
	for(int i=0;i<arr1.size();i++){
	//	System.out.println(arr1.get(i));
		
	}
	//System.out.println("NO");
	for(int i=0;i<arr2.size();i++){
		//System.out.println(arr2.get(i));
	}
	return arr1;
	
//	for ( Map.Entry<String, String> entry : map.entrySet()) {
//	     key = entry.getKey();
//	    tab = entry.getValue();
//	    System.out.println("key "+key);
//	    System.out.println("value "+tab);
//	    // do something with key and/or tab
//	}
//	//System.out.println(map);
//	if(key.equalsIgnoreCase("TC01")&& tab.equalsIgnoreCase("yes")){
//		
//	}
}
	
	
}
