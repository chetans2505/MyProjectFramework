package com.create.testng;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class GenerateXML {
	@Test
	public  void test() throws IOException {
		XmlSuite suite = new XmlSuite();
		   suite.setName("Amazon");
		   XmlTest test1 = new XmlTest(suite);
		   test1.setName("TCase1");
		   List<XmlClass> classes = new ArrayList<XmlClass>();
		   classes.add(new XmlClass("test.chet.TC01"));
		   test1.setXmlClasses(classes);
		   List<XmlSuite> suite_a = new ArrayList<XmlSuite>();
		   suite_a.add(suite);
		   
		   
		   FileWriter writer=new FileWriter("testng.xml");
		   writer.write(suite.toXml());
		   writer.flush();
		   writer.close();
		   TestNG tng = new TestNG();
		   tng.setXmlSuites(suite_a);
		   tng.run();
		  
		   
		 /*  XmlTest test = new XmlTest(suite1);
		   test.setName("Case1");
		   List<XmlClass> classes1 = new ArrayList<XmlClass>();
		   classes1.add(new XmlClass("test.chet.TC02"));
		   test.setXmlClasses(classes1) ;
		   List<XmlSuite> suites = new ArrayList<XmlSuite>();
		   suites.add(suite1);
		   TestNG tng1 = new TestNG();
		   tng1.setXmlSuites(suites);
		   System.out.println("suite created");
		   tng1.run();*/
	}

}
