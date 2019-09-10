/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingground;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author darta
 */
public class TrainingGround {
  
   
    
    
    
//    /**
//     * @param args the command line arguments
//     */
public static void main(String[] args) {
    
     Buffer.newTest();
    
   //  Buffer.bufferWriter();
//        // TODO code application logic here
//        //biggestnumber();
//        power();
//    }
//    
//    public static void biggestnumber() {
//        Scanner sc = new Scanner(System.in);
//        
//        int biggest = Integer.MIN_VALUE ;
//        
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ievadiet skialti");
//            int number = sc.nextInt();
//            
//            if (number>biggest) {
//                biggest=number;
//            }
//            
//        }
//        
//        System.out.println("leilakais skaitlis" + biggest);
//
//                
//    }
//    public static void power() {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ievadiet skialti");
//        int base = sc.nextInt();
//        
//        System.out.println("pakapi davaj!!!");
//        int pow = sc.nextInt();
//        int result=1;
//        
//        for (int i = 0; i < pow; i++) {
//           result = result * base;               
//        }
//        
//        System.out.println("pakape" + result);
//
//                
//    }
//    
//    
}
}

// public static void listRemove() {
//        Scanner sc = new Scanner(System.in);
//        String choice;
//        ArrayList<String> listOfStrings = new ArrayList<String>();
//        do {
//            System.out.println("Ievadiet Vertibu");
//            String input = sc.next();
//            listOfStrings.add(input);
//            System.out.println();
//
//            for (int i = 0; i < listOfStrings.size(); i++) {
//                System.out.println(listOfStrings.get(i));
//            }
//
//            System.out.println("Vai Velaties dzest elementu? yes or no? ");
//            String yesorno = sc.next();
//
//            if (yesorno.equals("yes")) {
//                System.out.println("Ievadiet Elemetu kuru dzest");
//                int delete = sc.nextInt();
//                if (delete < listOfStrings.size()-1) {
//                    listOfStrings.remove(delete);
//                    for (int i = 0; i < listOfStrings.size(); i++) {
//                        System.out.println(listOfStrings.get(i));
//                    }
//                } else {
//                    System.out.println("Tads elements neeksistē");
//                }
//
//            } else if (yesorno.equals("no")) {
//                System.out.println("Ok Nedzēšam!");
//            } else {
//                System.out.println("Tāds Choice neeksistē ");
//            }
//            System.out.println("Velaties Turpinat ja ne rakstat exit");
//            choice = sc.next();
//
//        } while (!choice.equals("exit"));
//
//       //Vai velaties izdzest elementu. Ja jā -cILVĒKS IEVADA KURU saraksta elementu dzēst
//       //Vai nu viss veiksmīgi vai pasakam ka tāda elementa nav
//
//       
