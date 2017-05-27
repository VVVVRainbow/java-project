/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author VE
 */
public class ComputerTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
		String s;
               
		s = scanner.next();
                s = "javaapplication5."+s;
		int A,B,C;
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
                scanner.close();
               Common transport = null;
		try {
			transport =  (Common) Class.forName(s).newInstance();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println(transport.v(A, B, C));
    }
}
