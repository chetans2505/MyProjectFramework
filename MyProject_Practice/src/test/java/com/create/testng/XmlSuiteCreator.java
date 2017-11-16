package com.create.testng;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import readexcel.ExcelValues;

public class XmlSuiteCreator {
	
	@Test
	public void test11() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String key = null;
		String tab = null;
		
		String execType=ExcelValues.readData("C:\\Users\\Administrator\\Desktop\\testfile.xlsx", "Sheet2", 0,1);
		System.out.println(execType);
		
		if(execType.equalsIgnoreCase("parallel")){
		
		
		}
		HashMap<String, String> browType=new HashMap<String, String >();
		browType.put("browser", "firefox");
		
		
		
		System.out.println("xmlsuite");
		XmlSuite suite=new XmlSuite();
		suite.setName("TestSuite");
		for ( Map.Entry<String, String> entry : browType.entrySet()) {
		     key = entry.getKey();
		    tab = entry.getValue();
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		System.out.println(key);
		System.out.println(tab);
		suite.setParameters(browType);
		
		XmlTest test1=new XmlTest();
		test1.setName("ExTest");
		List<XmlClass> classes=new ArrayList<XmlClass>();
		ArrayList< String > arr3=new ArrayList<String>();
		try {
			arr3.addAll(ReadExcelData.getInfo());
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
//		classes.add(new XmlClass("test.chet.TC01"));
//		classes.add(new XmlClass("test.chet.TC02"));
		System.out.println("length "+arr3.size());
		for(int i=0;i<arr3.size();i++){
			//System.out.println(arr3.get(i));
			classes.add(new XmlClass("test.chet."+arr3.get(i)));
		}
		test1.setXmlClasses(classes);
		
		List<XmlSuite> suite1=new ArrayList<XmlSuite>();
		//suite1.add(suite);
		suite.addTest(test1);
		suite1.add(suite);
		try {
			FileWriter writer=new FileWriter("testng.xml");
			writer.write(suite.toXml());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		TestNG testng=new TestNG();
		//testng.setXmlSuites(suite1);
		testng.run();
		
		/*String workingDirectory = System.getProperty("user.dir");
		 List<String> testFilesList = new ArrayList<String>();
		 System.out.println("-----------------------------------------------");
		 System.out.println(workingDirectory+"\\testng.xml");
	        testFilesList.add(workingDirectory+"\\testng.xml"); //test suite resides in the working directory's root folder
	       // **testng.setTestSuites(testFilesList);** //you can addd multiple suites either here by adding multiple files or include all suites needed in the testng.xml file 
	         testng.setUseDefaultListeners(false);
	       // testng.addListener(htmlRep); 
	        testng.run();*/
	
	}
	

}
