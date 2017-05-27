/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验三第二题;

/**
 *
 * @author VE
 */
public class 实验三第二题 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ticketbase x=new Ticketbase(100); 
        new Thread(x,"1").start();
        new Thread(x,"2").start();
        new Thread(x,"3").start();
        new Thread(x,"4").start();
        new Thread(x,"5").start();
    }
}
