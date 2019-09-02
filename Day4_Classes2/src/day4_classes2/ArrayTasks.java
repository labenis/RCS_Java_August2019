/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_classes2;

import java.util.Scanner;

/**
 *
 * @author darta
 */
public class ArrayTasks {
    
    public static void switchPlaces(){
        int a = 5;
        int b = 4;
        
        int c = a;
        a=b;
        b=c;
            
        System.out.println(a + " " + b);

    }
    
    public static void sortArray() {
        int[] arr = {7, 6, 3, 2, 9, 13};
        int temp;

        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[5]);

    }
    
    public static void sortArray1() {
        int[] arr = {7, 6, 3, 2, 9, 13};
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    //Maiņa
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int elm:arr){
            System.out.println(elm+ " ");
        }
        
        
    }
    
    
    public static void sumOfElements() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter elements");
        
        
        int sum = 0;
        int n = 5;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("ievade ir: ");
        for (int i : arr) { 
            System.out.print(i);
        }
        System.out.println();
        
        for (int i : arr) { 

            sum = sum+i;
        }
        System.out.println("Summa ir: " + sum);
        
//Uztaisit Masivu ar 5 Elementiem 
        //Elementus ievada cilves
        //Izvada elementu sumu
        // Izvada masivu
       
        
        
        
    }
    
}
