package com.pom.ptools.objectslist;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlElementListGenerator {
	public static List<String> generateElementsList(String elementType, String filePath) throws ParserConfigurationException, SAXException, IOException 
	{
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		List<String> resultList = new ArrayList<String>();
		NodeList objectList = doc.getElementsByTagName("Object");
		resultList.add("===Objects Element List===");
		System.out.println("===Objects Element List===");
		for(int n=0;n<objectList.getLength();n++)
		{	
			Element objectElement = (Element)objectList.item(n); 
			String objectName = objectElement.getAttribute("name");
			resultList.add(objectName);
			System.out.println(objectName);
		}
		System.out.println();
		resultList.add("\n");
		resultList.add("===Games Element List===");
		System.out.println("===Games Element List===");
		NodeList gameList = doc.getElementsByTagName("Game");
		for(int n=0;n<gameList.getLength();n++)
		{	
			Element gameElement = (Element)gameList.item(n); 
			String gameName = gameElement.getAttribute("name");
			resultList.add(gameName);
			System.out.println(gameName);
		}
		return resultList;
	}	
}

