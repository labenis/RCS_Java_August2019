/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulators;

/**
 *
 * @author darta
 */
public class Darbibas {
    
    private double a, b;
    private int e;

    public Darbibas() {
        a = 0;
        b = 0;

    }
    
    public void skaitluVertibas(double pirmaisSkaitlis, double otraisSkailis) {
        a = pirmaisSkaitlis;
        b = otraisSkailis;
    }
    
    public double reizinajums() {

        return a * b;
    }

    public double summa() {

        return a + b;
    }

    public double atnemsana() {

        return a - b;
    }

    public double dalisana() {

        return a / b;
    }
        
}
