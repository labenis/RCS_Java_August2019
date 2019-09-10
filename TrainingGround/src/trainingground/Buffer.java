/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingground;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author darta
 */



public class Buffer {
    
  
    
 public static void newTest(){
      
     boolean boovar = false;
     boolean hoovar = true;
     boolean doovar = false;
     boolean[] four = {boovar,hoovar ,doovar};
     
//    int blueInt = (boovar) ? 1 : 0;
//   int redInt = (hoovar) ? 1 : 0;

     int result = 0;
     for (boolean bit : four) {
         result <<= 1;
         if (bit) {
             result += 1;
         }
     }

     System.out.println(result);
   
 }
   
    
    
    public static void bufferWriter(){
       BufferedWriter bw = null;
      try {
	 String mycontent = "Aiziet Jurinja fails";
         //Specify the file name and path here
	 File file = new File("C:\\Users\\darta\\OneDrive\\Desktop\\Riga Coding School\\myfile.txt");

	 /* This logic will make sure that the file 
	  * gets created if it is not present at the
	  * specified location*/
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
	  bw.write(mycontent);
          System.out.println("File written Successfully");

      } catch (IOException ioe) {
	   ioe.printStackTrace();
	}
	finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	} 
        
    }

    private static int booleanToInt(boolean stateBlue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
