package com.pom.ptools.utils.content;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileGenerator {
	public static void generateFile(String filename, List<String> contentList) throws IOException
	{		
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		for(String line: contentList)
		{
			writer.write(line);
			writer.write("\n");
		}
		writer.flush();
		System.out.println("File Generating Complete");
	}
}
