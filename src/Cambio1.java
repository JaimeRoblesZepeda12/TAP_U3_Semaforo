/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
public class Cambio1 extends Thread{
    public boolean pausado=false;
    public boolean ejecutar = true;
    //NewJFrame puntero;
    
    Lienzo li;
    public Semaforo puntero;
    
    
    private int contador=0;
    public int semaforo=0;
    
    public int semaforo2=0;
    
    public Cambio1(Semaforo p) {
        puntero = p;
        
    }
    public void pausar(){
        pausado =! pausado;
        
    }
    public void detener(){
        ejecutar = false;
    }
    @Override
    public void run(){
        while(ejecutar){
            try {
                contador++;
                if(contador>0 && contador<=10){
                    semaforo=1;
                    semaforo2=3;
                    
                }
                if(contador>10 && contador<=15){
                    semaforo=2;
                    semaforo2=2;
                }
                if(contador>16){
                    semaforo=3;
                    semaforo2=1;
                }
                if(contador==26){
                    contador=0;
                    semaforo=0;
                    semaforo2=0;
                
                }
                
                sleep(1000);
                
            } catch (InterruptedException ex) {
               
            }
        }
        
    }

    private boolean estaDespausado() {
        return !pausado;
    }
}
