/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaappm5fe3;

/**
 *
 * @author nil
 */
public class JavaAppM5Fe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaulerJoc a = new TaulerJoc(300,200);
        Ball b = new Ball(50,50, 10, "GREEN");

        a.addBall(b);
        b.setXSpeed(3);

        while(true)
        {
            a.pause();
            b.bounce(300,200);
        }
    }
    
}
