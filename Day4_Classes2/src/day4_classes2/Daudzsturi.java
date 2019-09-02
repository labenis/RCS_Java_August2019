/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_classes2;

/**
 *
 * @author darta
 */
public class Daudzsturi {

   // 1. Uztaisīt konstruktoru, kas piešķir visiem mainigajiemvertibu 0
   //2. Uztaisit velvienu privatu mainigo kas atbildes par malu skaitu
   // 3.malu skaitam uztaisit set metodi (setA (int number)
   // 4. set metode. kas piešķir vērtības mainigajiem a, b, c, d
   // 5.Uztaisit metodi kas aprekina perimetru un return atgriez vertibu
   // Obligati jabut pozitiviem skaitliem -  a, b, c  un d obligati
    private double a, b, c, d;
    private int e;

    public Daudzsturi() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }

    public void setSides(int maluskaits) {
        e = maluskaits;
    }

    public void maluVertibas(double pirmaMala, double otraMala, 
            double tresaMala,
            double ceturtaMala) {
        a = pirmaMala;
        b = otraMala;
        c = tresaMala;
        d = ceturtaMala;
    }
    
    public void maluVertibas(double pirmaMala, double otraMala, double tresaMala){
        a = pirmaMala;
        b = otraMala;
        c = tresaMala;
    }

    public double perimetrs() {

//        switch (maluskaits) {
//            case 3:
//                return a + b + c
//            case 4:
//                return a + b + c + d
//            default:
//                return
//        }
        
        if (e < 4) {
            double per = a + b + c;
            return per;
        } else {
            double per = a + b + c + d;
            return per;
        }
    }
    

}
