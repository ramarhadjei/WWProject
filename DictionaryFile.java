//Rebecca Amarh-Adjei
//WW Question 1
//a.	Create a method called doesFileExist(String path) which takes the path of the file
//and tells the user if the file exists at that path or not. 
//Assume all paths are relative to your project structure. If the file does not exist, 
//catch the requisite exception

//b.	Read each word and its possible meanings and print them out. 
//Your output should look like this:
//Word1
//Meaning 1
//Meaning 2
//Word2
//Meaning1
//Meaning2

package question1files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DictionaryFile {

    public static boolean doesFileExist(String path){
    	

        File f = new File(relativepathToAbsolute(path));
        if(f.exists() && !f.isDirectory()){
            return true;
        }
        return false;
    }


    public static void printDictionary(String dictionaryPath){
        if(!doesFileExist(dictionaryPath)){
            System.err.println("File does not exist.");
        }
        String currentLine;
        try{
            String absolutePath = relativepathToAbsolute(dictionaryPath);
            BufferedReader dictReader = new BufferedReader(new FileReader(absolutePath));


            while ((currentLine = dictReader.readLine()) != null) {
                String[] splitLine = currentLine.split("-");
                String[] meanings = splitLine[1].split(",");
                System.out.println("Word:" + splitLine[0].trim());
                for(String s: meanings){
                    System.out.println("Meaning:"+ s.trim());
                }
                System.out.println("");
            }
            dictReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    private static String relativepathToAbsolute(String relPath){
        File file1 = new File(".");
        File file2 = new File(file1, relPath);
        return file2.getAbsolutePath();
    }


    public static void main(String[] args) {
       if(args.length<1){
         System.err.println("Arguments not adequate. Please provide path to dictionary file. Thank you.");
         return;
     }


        String path = args[0];


        if(doesFileExist(path)){
            System.out.println("The file exists.\n");
        }else{
            System.out.println("The file doesn't exist");
            return;
        }


        printDictionary(path);
    }
}

	

