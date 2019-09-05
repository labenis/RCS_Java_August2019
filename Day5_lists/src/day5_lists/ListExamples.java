/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_lists;

import java.util.ArrayList;

/**
 *
 * @author darta
 */
public class ListExamples {
    public static void sampleList(){
        ArrayList<Integer> sample = new ArrayList<Integer>();
        sample.add(4);
        sample.add(1);
        sample.add(6);
        
        for (int i = 0; i < sample.size(); i++) {
            System.out.println(sample.get(i));
        }
        
    }
    
    
}
