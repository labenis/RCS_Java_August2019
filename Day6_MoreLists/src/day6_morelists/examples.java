/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_morelists;

import java.util.ArrayList;

/**
 *
 * @author darta
 */
public class examples {
    //public static int a = 5;
    public static void referenceSample(){
        ArrayList<String> sampleList = new ArrayList<String>();
        
        sampleList.add("viens");
        sampleList.add("viens");
        sampleList.add("viens");
        sampleList.add("viens");
        
        outputList(sampleList);
        changeList(sampleList);
        outputList(sampleList);
        
        int sampleInt =5;
        changeInt(sampleInt,5);
        //sampleInt = changeInt(sampleInt); Ja ieliekam zemak RETURN
        System.out.println("Arpus metodes - " + sampleInt);
             

    }
    
    private static void changeInt(int number, int a){
        number = number +6;
        System.out.println("Ieksa met"+ number);
        //return number;  ja buutu mainja vertibai
    }
    
    private static void changeList(ArrayList<String> passList){
        passList.remove(0);
        //passList.set(0,"trispadsmit");
    }
    
    private static void outputList(ArrayList<String> parList) {
        System.out.println("Saraksts ir: ");
        for (int i = 0; i < parList.size(); i++) {
            System.out.println(parList.get(i));
        }
    }
    
    
}
