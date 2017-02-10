/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01threads;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author upam
 */
public class DibujarFrame  extends JFrame{

    public DibujarFrame() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.drawOval(50, 50, 100, 100);
    }
    
    
    
}
