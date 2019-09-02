/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author darta
 */
public class Tasks {

    public int a;

    public Tasks() {
        a = 0;
    }

    public void setA(int newa) {
        //Ja newA 5-15 tad viss Ok
        // Ja ne tad 99
        if (newa <= 15  && newa >=5) {
          int a = newa;  
        }
        else {
          int a = 99;  
        }
        
    }
    
     public void printA() {
       System.out.println(a);
    }

    public static void stars() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pyramid2() {
//        String[] stars = new String[4];
        String[] stars = {"*", "**","***","****"};
        
        for (int i = 0; i < 4; i++) {
            System.out.println(stars[i]);
        }
        
    }

}
