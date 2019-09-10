/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9_fileioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author darta
 */
public class Day9_FileIOExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
   
    }

    public static void fileWrite() {
        String[] content = {"aaa","aaaa","CCCC"};
        try (FileWriter writer = new FileWriter("C:\\Users\\darta\\OneDrive\\Desktop\\Riga Coding School\\test.txt", true);
                BufferedWriter bw = new BufferedWriter(writer)) {

            for (int i = 0; i < content.length; i++) {
                bw.write(content[i]);
                bw.newLine();
                //KASN LAI IZPRINTETU
            }
//                bw.write(content);

        } catch (IOException ex) {
            System.out.println("Nevar izveidot fail");
        }

    }
    public static void fileRead() {
      
        try (FileReader fr = new FileReader("C:\\Users\\darta\\OneDrive\\Desktop\\Riga Coding School\\test.txt");
                BufferedReader br = new BufferedReader(fr)){
           while(true){
               String line = br.readLine();
               if(line==null){
                   break;
               }
               System.out.println(line);
           }
            
        }catch (IOException ex) {
            System.out.println("Nav tada faila");
        }
        
        
    }
}
    

