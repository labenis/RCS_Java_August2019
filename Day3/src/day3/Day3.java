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
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Example ex = new Example();
//        ex.nonStaticExample();      
//        Example.staticExample();

        Tasks tsk = new Tasks();
        tsk.setA(5);
        tsk.printA();

        Tasks tsk2 = new Tasks();
        tsk2.printA();

        Tasks.stars();



    }
    
}
