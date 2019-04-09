package fileCopy;

import java.io.*;
import java.util.*;
public class FileCopy {

   private static void copyFileUsingStream(File source, File dest) throws IOException{
      InputStream is = null;
      OutputStream os = null;
   	
      try {
         is = new FileInputStream(source);
         os = new FileOutputStream(dest);
         byte[] buffer = new byte[1024];
         int length;
         while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
         }
      }
      catch(IOException e){
         System.out.println(e);
      }
      finally {
         is.close();
         os.close();
      }
   }
	
   private static void validateIO(String input, String output) {
      Scanner sc = new Scanner(System.in);
   	// checks to see if the input file exists
      if(!(new File(input).isFile())) {
         System.out.println("The input file does not exist. (1) to try another file or (2) to exit the program.");
         String newInput = null;
         int userInput = 0;
         userInput = sc.nextInt();
         sc.nextLine();
         if(userInput==1) {
            do{
               System.out.print("Input file? ");
               newInput = sc.nextLine();
            }
            while(!(new File(newInput).isFile()));
            try {
               File source = new File(newInput);
               File dest = new File(output);
               copyFileUsingStream(source, dest);
            }
            catch(IOException e){
               System.out.print(e);
            }
         
         }
         else if(userInput == 2) {
            System.out.println("Exiting...");
            System.exit(0);
         }
      }
      // checks to see if output file exists
      else if(new File(output).isFile()) {
         System.out.println("The output file exists. (1) to try another file or (2) to change the file name.");
         int userInput = 0; 
         sc.nextLine();
         userInput = sc.nextInt();
         // 
         if(userInput==1) {
            System.out.println("Overwriting file...");
            try {
               File source = new File(input);
               File dest = new File(output);
               copyFileUsingStream(source, dest);
            }
            catch(IOException e){
               System.out.print(e);
            }
         }
         else if(userInput == 2) {
            System.out.print("Output file? ");
            String newOutput = sc.nextLine();
            validateIO(input, newOutput);
         }
      }
      else {
         try {
            File source = new File(input);
            File dest = new File(output);
            copyFileUsingStream(source, dest);
         }
         catch(IOException e){
            System.out.print(e);
         }
      }
      sc.close();
      System.out.printf("Original File: %s\nCopied File: %s",input,output);
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input file? ");
      String input = sc.nextLine();
      System.out.println();
      System.out.print("Output file? ");
      String output = sc.nextLine();
      //sc.close();
      validateIO(input, output);
   }
}