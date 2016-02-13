/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Schule
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    static int count = 0;
    static double rndX = 0.0;
    static double rndY = 0.0;
    
    public static void main(String[] args) {
        for(int i = 0; i<1000000; i++){
            rndX = (double)(Math.random()*10)-6;
            rndY = (double)(Math.random()*5);
            //System.out.println("X: "+rndX);
            //System.out.println("Y: "+rndY);
            //System.out.println("Anzahl: "+count);
            if(rndX >= 0 && rndY <= 5.0 - 1.25 * rndX ){
                count++; 
            }

            if(rndX <= 0 && rndY <= 5.0+0.83*rndX){
                count++;
            }
        }
        
        System.out.println("Soviele lagen im Dreieck: "+count);
        double Prozent = count/10000;
        System.out.println("Soviele Prozent sind im 3-Eck: "+Prozent+"%");
        
        javax.swing.JOptionPane.showMessageDialog(null, "Soviele lagen im Dreieck: "+count+"\nSoviele Prozent sind im 3-Eck: "+Prozent+"%");
        
        
    }
    
}
