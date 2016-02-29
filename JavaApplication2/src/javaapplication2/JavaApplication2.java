/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.DecimalFormat;

/**
 *
 * @author Schule
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    static long count = 0;
    static double rndX = 0.0;
    static double rndY = 0.0;
    
    public static double Abstand(double x1, double y1, double x2, double y2)
    {
        
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));        
    }
    
    
    public static void main(String[] args) {
        long AnzahlWuerfe = 100000000L;
        for(long i = 0; i<AnzahlWuerfe; i++){
            rndX = (double)(Math.random()*5);
            rndY = (double)(Math.random()*10);
            //System.out.println("X: "+rndX);
            //System.out.println("Y: "+rndY);
            //System.out.println("Anzahl: "+count);
            if(rndX >= 4 && rndX <= 9){
                count++; 
            }
            else if(rndX <= 4 && rndY <= 1.25*rndX){
                count++;
            }    
            else if(rndX >= 9 && rndY <= -5*rndX + 50){
                count++;
            }
            
            
            //Die Funktion Abstand(rndX,rndY,pX,pY) berechnet euch den Abstand des Punktes
            //mit den Koordinaten (rndX,rndY) zum Punkt mit den Koordinaten (px,py).
            
            
        }
       
        System.out.println("Soviele lagen im Trapez: "+count);
        double Prozent = count/(double)AnzahlWuerfe*100;
        double Flaeche = 50*Prozent/100.0;
        System.out.println("Soviele Prozent sind im Trapez: "+Prozent+"%");
        DecimalFormat format = new DecimalFormat("###.##########################################"); 
        javax.swing.JOptionPane.showMessageDialog(null, "Soviele lagen im Trapez: "+count+"\nSoviele Prozent sind im Trapez: "+Prozent+"%" + "\nDie Flaeche beträgt " + Flaeche);
        
        
    }
    
}
