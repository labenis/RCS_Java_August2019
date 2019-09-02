/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulators;

import java.util.Scanner;

/**
 *
 * @author darta
 */
public class Kalkulators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet Pirmo SKAITLI");
        double a = sc.nextInt();
        
        System.out.println("Ievadiet otro SKAITLI");
        double b = sc.nextInt();
        
        Darbibas tsk = new Darbibas();
        tsk.skaitluVertibas(a,b); 
        
        System.out.println("IZVĒLIETIES DARBĪBU:");
        System.out.println("1 Saskaitišana");
        System.out.println("2 Atņemšana");
        System.out.println("3 Reizināšana");
        System.out.println("4 Dalīšana");
        int c = sc.nextInt();
        
        switch (c){
            case 1:
                tsk.summa();
                System.out.println("Summa ir " + tsk.summa());
            case 2:
                tsk.atnemsana();
                System.out.println("Atlikums ir " + tsk.atnemsana());
            case 3:
                tsk.reizinajums();
                System.out.println("Reizinajums ir " + tsk.reizinajums());
            case 4:
                tsk.dalisana();
                System.out.println("Dalijums ir " + tsk.dalisana());   
        
        }
        
    }
    
}
