package com.pom.ptools.utils.content;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ContentLoader {
	public static String loadContent(String filepath) throws IOException
	{
		File file = new File(filepath);		
		String fielContent = FileUtils.readFileToString(file, "UTF-8");
		return fielContent;
	}
}
