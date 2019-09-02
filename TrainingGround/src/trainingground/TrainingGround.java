/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingground;

import java.util.Scanner;

/**
 *
 * @author darta
 */
public class TrainingGround {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //biggestnumber();
        power();
    }
    
    public static void biggestnumber() {
        Scanner sc = new Scanner(System.in);
        
        int biggest = Integer.MIN_VALUE ;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadiet skialti");
            int number = sc.nextInt();
            
            if (number>biggest) {
                biggest=number;
            }
            
        }
        
        System.out.println("leilakais skaitlis" + biggest);

                
    }
    public static void power() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadiet skialti");
        int base = sc.nextInt();
        
        System.out.println("pakapi davaj!!!");
        int pow = sc.nextInt();
        int result=1;
        
        for (int i = 0; i < pow; i++) {
           result = result * base;               
        }
        
        System.out.println("pakape" + result);

                
    }
    
    
}
