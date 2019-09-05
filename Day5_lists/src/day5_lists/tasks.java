/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_lists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author darta
 */
public class tasks {
    //Uztaisit String Listu 
    // Cilvekam Ir 2 opcijas. Pievienot jaunuvertibu, vai iziet
    //Ja cilveks peivieno vertibu, vinsh peiliek listam stringu un izvada sarakstu
    //Ja cilveks izveleas iziet izejam sarakstu un izeja no programmmas whil & string list
    
//    private String a;
//    
//    public void skaitluVertibas(String skaitlis) {
//        a = skaitlis;
//    }
//    ArrayList<String> sample = new ArrayList<String>();
//    
//    public void pievienot(String a) {
//        sample.add(a);
//        for (int i = 0; i < sample.size(); i++) {
//            System.out.println(sample.get(i));
//        }
//    }
//    
    
    public static void listInput(){
       Scanner sc = new Scanner(System.in);
       String choice;
       ArrayList<String> listOfStrings = new ArrayList<String>();
       do{
           System.out.println("Ievadiet Vertibu");
           String input = sc.next();
           listOfStrings.add(input);

           for (int i = 0; i < listOfStrings.size(); i++) {
               System.out.println(listOfStrings.get(i));
           }

           System.out.println("Velaties Turpinat ja ne rakstat exit");
           choice = sc.next();
             
        }while(!choice.equals("exit"));
                      
    }
    
    public static void listRemove() {
        Scanner sc = new Scanner(System.in);
        String choice;
        ArrayList<String> listOfStrings = new ArrayList<String>();
        do {
            System.out.println("Ievadiet Vertibu");
            String input = sc.next();
            listOfStrings.add(input);
            System.out.println();

            outputList(listOfStrings);

            System.out.println("Velaties Turpinat ja ne rakstat exit ja "
                    + "velaties dzest elementu, rakstiet dzest");
            choice = sc.next();
            
            if(choice.equals("dzest")){
                removeElement(listOfStrings);
            }

        } while (!choice.equals("exit"));

       //Vai velaties izdzest elementu. Ja jā -cILVĒKS IEVADA KURU saraksta elementu dzēst
       //Vai nu viss veiksmīgi vai pasakam ka tāda elementa nav

       
    }
    private static void removeElement(ArrayList<String> parList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kuru Elementu velaties dzes");
        if(sc.hasNextInt()){
            int index = sc.nextInt();
            if(index>-1 && index <parList.size()){
                parList.remove(index);
            }
            else{
                System.out.println("Nekorekta ievade");
            }
        }else{
            System.out.println("Nekorekta ievade");
        }
        
        
    }
    
    private static void outputList(ArrayList<String> parList) {
        System.out.println("Saraksts ir: ");
        for (int i = 0; i < parList.size(); i++) {
            System.out.println(parList.get(i));
        }
    }
    
    
    // Statiska  - nav j'ataisa objekts soreiz, jo ari augseja ir statiska
   
    
    
    
  
  
    
    
}

