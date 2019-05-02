package question1files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileGeneration {
public static void main(String[] args) {
		
		//String location="Users/rwhit/Desktop/WW/wwDictionary.txt";
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream(new File("/Users/rwhit/Desktop/WW/dictionary.txt"));
			System.out.println("File exists and it opened");
			
			int i;
			while ((i =fis.read())!=-1) {
				System.out.print((char)i);	
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}

