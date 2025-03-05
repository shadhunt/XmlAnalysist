package com.pom.ptools.objectslist;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.pom.ptools.utils.content.FileGenerator;

public class Main {
	public static void main(String[] args)
	{		
		String elementType = "Game";
		String inputFilePath = "testFile/ObjectList/ElementListTargetFile.xml";
		String outputFileDirectory = "testFile/ObjectList/OutputFiles/";
		String outputFileName = prompInput("Input the name of the output file:");
		String outputFileAbsolutePath = outputFileDirectory+outputFileName+".txt";
		try {
			List<String> resultList = XmlElementListGenerator.generateElementsList(elementType, inputFilePath);
			FileGenerator.generateFile(outputFileAbsolutePath, resultList);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String prompInput(String prompMessage)
	{
		System.out.print(prompMessage);
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}
}
