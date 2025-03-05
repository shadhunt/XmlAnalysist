package com.pom.ptools.contentcompare;

import java.io.IOException;

import com.pom.ptools.utils.content.ContentLoader;

/**
 *  This is a tool to compare the xml content between 2 files with ignoring white spaces and orders  
 */
public class Main {
	public static void main(String[] args) throws IOException
	{
		String path1 = "testFile/targetFile1.xml";
		String path2 = "testFile/targetFile2.xml";
		String target1 = ContentLoader.loadContent(path1);
		String target2 = ContentLoader.loadContent(path2);
		XmlContentComparator.assertXmlEquals(target1, target2);
	}
}
