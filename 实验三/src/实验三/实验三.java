/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验三;

/**
 *
 * @author VE
 */
public class 实验三 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     queue<Integer> x=new queue();
     x.add(1);
     x.add(2);
     x.add(3);
     System.out.print(x.get());
     System.out.print(x.get());
     x.add(5);
     System.out.print(x.isEmpty());
    
    }
    
}
