/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7_exceptions;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author darta
 */
public class Day7_Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //examples();
        uzdevums();
    }
    public static void examples(){
        
        int[] arr = new int [5];
        
        try{
           for(int i= 0; i<6; i++){
             arr[i]=i+1;
             System.out.println(arr[1]);
         }  
        }catch(Exception ex){
            System.out.println("Nokeram");
            System.out.println(ex.toString());
        }
        
         System.out.println("Pec Kludas");

         //1.uztaisit Metodi, kur Cilveksievada Masiva garumu 
         //2.Ar ciklu aizpilda masiva vertibas
         //3. tad cilveks ievada, kuru elementu mes mainam  
         //tad izvadam Masivu
         
    }
    public static void uzdevums(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masiva Garumu");
        int input=0;
        String []arr = new String [input];
        
        try{
            input = sc.nextInt();
            arr = new String [input];
        }catch(Exception ex){
           System.out.println("LOHS TU ESI!!!!"); 
        }

        
        System.out.println("Ievadiet Masiva Elementus");
        for (int i = 0; i < input; i++) {
            System.out.println("Ievadiet Masiva"+(i+1) +"." + " Elementu");
            arr[i] = sc.next();
        }
        
        try {
            System.out.println("Ievadiet Elementa kartas skaiti, kuru velaties redigjet");
            int holder = sc.nextInt();
            int edit = holder-1;
            System.out.println("Ko velaties ievadit?");
            String whatEdit = sc.next();
            arr[edit] = whatEdit;

        } catch (Exception ex) {
            System.out.println("Nokeram");
            System.out.println(ex.toString());
        }
        
        System.out.println("Saraksts ir: ");
        for (int i = 0; i < input; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println(Arrays.toString(arr));
        
        
    }
        
        


}
