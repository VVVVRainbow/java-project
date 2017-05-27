/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验三第二题;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VE
 */
public class Ticketbase implements Runnable{
    public Ticketbase(int x){rest=x;}
    int rest;
    public void run()
    {
        while(rest!=0)
        {
            synchronized(this)
            { System.out.println(Thread.currentThread().getName()+ "售出编号为"+rest--+"的票\n");}
            try {
                Thread.sleep((int)Math.random()*10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ticketbase.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
