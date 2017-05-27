/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 整数求和;

import java.util.Scanner;


/**
 *
 * @author VE
 * 
 */




public class 整数求和 {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner;
        int add=0;
        
        scanner = new Scanner(System.in);
       while(true){
        try{
            add=scanner.nextInt();
            if(add==999)
                break;
            if(add<0)
                throw new nagetivenumber();
            sum+=add;
    }catch(java.util.InputMismatchException re){
         scanner.next();
    }
    }
       System.out.print("值为"+sum+"");
    
    }
}
