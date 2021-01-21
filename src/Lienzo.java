
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Lienzo extends Canvas{
    NewJFrame puntero;
    Semaforo sem=new Semaforo();
    Carros car=new Carros();
    Cambio1 c1;
    public Lienzo(NewJFrame p) {
        puntero=p;
       
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2= (Graphics2D)g;
        this.setBackground(Color.DARK_GRAY);
        
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.gray);
        
        //Se dibujan las calles
        g2.fillRect(320,0, 150, 600);
        g2.fillRect(0,250,800,150);
        
        
        

        sem.semaforo1(g2);
        sem.semaforo2(g2);
        car.carrosAll(g2);
        
        
        repaint();
    }
    
    
}
