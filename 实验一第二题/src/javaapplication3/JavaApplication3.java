/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author VE
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a,b,c;
        for(int i=100;i<1000;i++)
      {
          a=i/100;
          b=(i-a*100)/10;
          c=(i-a*100-b*10);
          if(a*a*a+b*b*b+c*c*c==i)
          System.out.println(""+i+"是水仙花数");
      }
    }
    
}
