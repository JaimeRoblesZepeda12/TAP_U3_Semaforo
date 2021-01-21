
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Semaforo extends Canvas{
    Cambio1 c1=new Cambio1(this);
    //Cambio1 c1;
    Lienzo li;
    boolean rojo;
    boolean amarillo;
    boolean verde;
    
    boolean rojo2;
    boolean amarillo2;
    boolean verde2;
    public Semaforo(Cambio1 c) {
        c1=c;
        
    }

    public Semaforo() {
        c1.start();
    }
    public void semaforo1(Graphics2D g2) {
        //Se dibuja el primer semaforo
        g2.setColor(Color.black);
        g2.drawRect(100,50,100,150);
        
        /*g2.drawRect(100,50,100,150);
        g2.setColor(Color.black);
        g2.fillOval(130, 55, 40, 40);
        g2.setColor(Color.black);
        g2.fillOval(130, 105, 40, 40);
        g2.setColor(Color.black);
        g2.fillOval(130, 155, 40, 40);*/
          
        switch(c1.semaforo){
            case 1:
                rojo=true;
                amarillo=false;
                verde=false;
                break;
            case 2:
                rojo=false;
                amarillo=true;
                verde=false;
                break;
            case 3:
                rojo=false;
                amarillo=false;
                verde=true;
                break;
        }
        if(rojo==true){
            g2.setColor(Color.red);
            g2.fillOval(130, 55, 40, 40);
        }else{
            g2.setColor(Color.black);
            g2.fillOval(130, 55, 40, 40);
        }
        if(amarillo==true){
            g2.setColor(Color.yellow);
            g2.fillOval(130, 105, 40, 40);

        }else{
            g2.setColor(Color.black);
            g2.fillOval(130, 105, 40, 40);
        }
        if(verde==true){
            g2.setColor(Color.green);
            g2.fillOval(130, 155, 40, 40);

        }else{
            g2.setColor(Color.black);
            g2.fillOval(130, 155, 40, 40);
        }
        
    }
    public void semaforo2(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.drawRect(600,50,100,150);
        //se dibuja el seuno semaforo
        /*g2.drawRect(600,50,100,150);
        g2.setColor(Color.black);
        g2.fillOval(630, 55, 40, 40);
        g2.setColor(Color.black);
        g2.fillOval(630, 105, 40, 40);
        g2.setColor(Color.black);
        g2.fillOval(630, 155, 40, 40); */ 
        switch(c1.semaforo2){
            case 1:
                rojo2=true;
                amarillo2=false;
                verde2=false;
               
                break;
            case 2:
                rojo2=false;
                amarillo2=true;
                verde2=false;
                
                break;
            case 3:
                rojo2=false;
                amarillo2=false;
                verde2=true;
                
                break;
        }
        if(rojo2==true){
            g2.setColor(Color.red);
            g2.fillOval(630, 55, 40, 40);
        }else{
            g2.setColor(Color.black);
            g2.fillOval(630, 55, 40, 40);
        }
        if(amarillo2==true){
            g2.setColor(Color.yellow);
            g2.fillOval(630, 105, 40, 40);
        }else{
            g2.setColor(Color.black);
            g2.fillOval(630, 105, 40, 40);
        }
        if(verde2==true){
            g2.setColor(Color.green);
            g2.fillOval(630, 155, 40, 40);
        }else{
            g2.setColor(Color.black);
            g2.fillOval(630, 155, 40, 40);
        }
       
    }
}
