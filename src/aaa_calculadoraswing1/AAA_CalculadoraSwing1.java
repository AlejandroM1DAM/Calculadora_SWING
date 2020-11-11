/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa_calculadoraswing1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Alejandro
 */
public class AAA_CalculadoraSwing1 {
    public static void main(String[] args) {
        AAB_Calculadoraswing1 app = new AAB_Calculadoraswing1();
        app.setVisible(true);
        app.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });            
    }
}
