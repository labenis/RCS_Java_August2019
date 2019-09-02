/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author darta
 */
public class Example {

    //privete, public. Inkapsulācija, vius maksimali paslēpjam
    //static  - nav svarīgs objekts
    // ! = Kamēr nav vienāds
    //Kostruktors
    private int maluSkaits;

    public Example() {
        maluSkaits = 0;
    }
    //Konstruktors

    public static void staticExample() {
    }

    public void nonStaticExample() {

    }
    
    public void whileExample(){
       Scanner sc = new Scanner(System.in);
       String exit = "";
       while(!exit.equals("yes")){
           System.out.println("Izvade");
           exit = sc.nextLine();
           exit = exit.toLowerCase();
           // Mainam nosacījumu ieksh cikla kamēr tas izpildās
       }
       
        
    }
    
    
    //Uztaisit Kalkulatoru
    //Matematiskas darbibas jauna klase
    //Vertibas mes padodam ieksa ar parametriem
    //Un rezultatu atgriezam ar return
    //Main Metode Day 3 klasē Izmantojam While  lai uztaisitu Menu 
    
    // Uztaisam klasi ar nosaukumu tasks 
    //Statisku metodi, kas izvada ** piramidu uz augšu un Leju
    //Uztaisat lauku (int) ar nosaukumu a, lai konstruktorā iedodat vertibu 0
    //Metodi ar parametru kas maina vērtību mainigjam A
    

}
