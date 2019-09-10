/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_morelists;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author darta
 */
public class tasks {
    //1) Izvadit srakstu 
    // 2) Pievienot elementu
    //3)dzest elementu
    //4)Redigjet elementu
    //5)Iziet no programmas 

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sampleList = new ArrayList<String>();
        String choice;
        do {
            System.out.println("Izvēlieties opciju");
            System.out.println("1- Izvadit sarakstu");
            System.out.println("2- Pievienot elementu");
            System.out.println("3- dzest elementu");
            System.out.println("4- Redigjet elementu");
            System.out.println("5- Nolasit Elementus no Faila");
            System.out.println("6- Uztaisit Failu ar Esoso sarakstu");
            System.out.println("7- Iziet no programmas");
            
            String menu = sc.next();

            switch (menu) {
                case "1":
                    outputList(sampleList);
                    break;
                case "2":
                    addlist(sampleList);
                    break;
                case "3":
                    deleteList(sampleList);
                    break;
                case "4":
                    editList(sampleList);
                    break;
                case "5":
                    uploadFile(sampleList);
                    break;
                case "6":
                    System.out.println("A - Pievienot Elmentus");
                    System.out.println("B - Overwrite Failu");
                    String file = sc.next();
                    switch (file) {
                        case "A":
                            addToFile(sampleList);
                            break;
                        case"B":
                            createFile(sampleList);
                            break;
                    }
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tāda Izvēle Nepastav");
                    break;
            }
            System.out.println("Velaties Turpinat Yes?  ja ne rakstat exit");
            choice = sc.next();

        } while (!choice.equals("exit"));

    }

    private static void outputList(ArrayList<String> parList) {
        System.out.println("Saraksts ir: ");
        for (int i = 0; i < parList.size(); i++) {
            System.out.println(parList.get(i));
        }
    }

    private static void addlist(ArrayList<String> parList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet Vertibu");
        String input = sc.next();
        parList.add(input);
        System.out.println();

    }

    private static void deleteList(ArrayList<String> passList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet Elementa kartas skaiti, kuru velaties dzest");
        if (sc.hasNextInt()) {
            int delete = sc.nextInt();
            if (delete > -1 && delete < passList.size()) {
                passList.remove(delete);
                System.out.println(delete + "ir dzests");
            } else {
                System.out.println("Nekorekta ievade");
            }
        } else {
            System.out.println("Nekorekta ievade");
        }

    }

    private static void editList(ArrayList<String> passList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet Elementa kartas skaiti, kuru velaties redigjet");
        if (sc.hasNextInt()) {
            int edit = sc.nextInt();
            if (edit > -1 && edit < passList.size()) {
                System.out.println(edit + "ir atzimtets");
                System.out.println("ievadiet ko velaties rakstit " + edit + " vietā");
                String whatEdit = sc.next();
                passList.set(edit, whatEdit);

            } else {
                System.out.println("Nekorekta ievade");
            }
        } else {
            System.out.println("Nekorekta ievade");
        }

    }
    
    private static void uploadFile(ArrayList<String> passList) {
         try (FileReader fr = new FileReader("C:\\Users\\darta\\OneDrive\\Desktop\\Riga Coding School\\test.txt");
                BufferedReader br = new BufferedReader(fr)){
           while(true){
               String line = br.readLine();
               if(line==null){
                   break;
               }
               passList.add(line);
               System.out.println();
           }
            
        }catch (IOException ex) {
            System.out.println("Nav tada faila");
        }
    }
    
    private static void createFile(ArrayList<String> passList) {
        try (FileWriter writer = new FileWriter("C:\\Users\\darta\\OneDrive\\Desktop\\Riga Coding School\\test2.txt");
                BufferedWriter bw = new BufferedWriter(writer)) {

            for (int i = 0; i < passList.size(); i++) {
                bw.write(passList.get(i));
                bw.newLine();
            
            }
              //bw.write(passList);

        } catch (IOException ex) {
            System.out.println("Nevar izveidot fail");
        }
    }
    
        private static void addToFile(ArrayList<String> passList) {
        try (FileWriter writer = new FileWriter("C:\\Users\\darta\\OneDrive\\Desktop\\Riga Coding School\\test2.txt",true);
                BufferedWriter bw = new BufferedWriter(writer)) {

            for (int i = 0; i < passList.size(); i++) {
                bw.write(passList.get(i));
                bw.newLine();
            
            }
              //bw.write(passList);

        } catch (IOException ex) {
            System.out.println("Nevar izveidot fail");
        }
    }
    

}
