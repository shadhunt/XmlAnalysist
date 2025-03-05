package com.pom.ptools.contentcompare;

import java.io.IOException;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Assert;
import org.xml.sax.SAXException;



public class XmlContentComparator {
	public static void assertXmlEquals(String expectedXml, String actualXml) {
		XMLUnit.setIgnoreWhitespace(true);
		XMLUnit.setIgnoreAttributeOrder(true);
		
		try {
			DetailedDiff diff = new DetailedDiff(XMLUnit.compareXML(expectedXml, actualXml));
			List<?> allDifferences = diff.getAllDifferences();
			Assert.assertEquals("Differences found:"+diff.toString(),0,  allDifferences.size());
			System.out.println("Same Xml");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
