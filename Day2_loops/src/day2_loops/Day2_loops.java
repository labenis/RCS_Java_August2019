/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_loops;

import java.util.Scanner;

/**
 *
 * @author darta
 */
public class Day2_loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //loops();
        //stars();
        //sumOfNumbers();
        //factorial();
        //biggest();
        power();
// for, while, do...while, for-each, 

    }

    
    
    public static void loops() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    
    
    
    public static void stars() {
        String output = "";
        for (int i = 0; i < 4; i++) {
            output = output + "*";
            System.out.println(output);
        }

    }

    
    
    
    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
//Ievada 3 Skaittlus un sasakita
// Jauztaisa, kur glabat Summu
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ievadiet " + i + "." + " SKAITLI");
            int skaitlis = sc.nextInt();
            sum = sum + skaitlis;
        }

        System.out.println(sum);
    }
    
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet SKAITLI");
        int number = sc.nextInt();
        int fact =1;

        for (int i = 1; i <= number; i++) {

            fact = fact*i;
        }
        System.out.println(fact);
    }

   //    1. Cilveks ievada 5us skaitlus - atrodam Lielako (For) 
    
    public static void biggest() {
        Scanner sc = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= 5;  i++) {
            System.out.println("Ievadiet" + i + "." + "SKAITLI");
            int number = sc.nextInt();
            if (number > largest) {
                largest = number;
            } 
            if (number < smallest) {
                smallest = number;
            } 
        }

        System.out.println();
        System.out.println("Largest = " + largest);
        System.out.println("Smallest4 = " + smallest);
    }
    

    
    // 2. Cilveks ievada Skaitli, kuru kapinat, cilveks ievada pakapi un ar FOr kapinam 
    public static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet SKAITLI");
        double number = sc.nextInt();

        System.out.println("Ievadiet PAKAPI");
        double power = sc.nextInt();
        double holder=1;
        

          for (int i = 1; i <= power; i++) {
            holder = holder * number;
        }  
          
        if (power >0) {
        System.out.println();
        System.out.println("Power outcome is " + holder ); 
        }
        else if (power <0) {
        System.out.println();
        double holder2=1/holder;
        System.out.println("Power outcome is " + holder2 );  
        }
        else{
        System.out.println();
        System.out.println("Power outcome is " + "1");   
        }


    }

}
    
    

    


