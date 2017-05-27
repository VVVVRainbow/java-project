/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.lang.Math;
import java.awt.*;
/**
 *
 * @author VE
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Triangle llll=new Triangle(new Point(0,0),new Point(3,0),new Point(0,4));
        System.out.print(llll.area());
    }
}

class Triangle{
 Point a;
 Point b;
 Point c;
 Triangle (Point aa,Point bb,Point cc)
 {
     a=aa;b=bb;c=cc;
 }
 public float area()
 {
   float aa;
     aa = (float) Math.sqrt(Math.pow(Math.abs(a.x-b.x),2)+Math.pow(Math.abs(a.y-b.y),2));//ab之间
   float bb;
     bb = (float) Math.sqrt(Math.pow(Math.abs(c.x-b.x),2)+Math.pow(Math.abs(c.y-b.y),2));//bc
    float cc;
     cc = (float) Math.sqrt(Math.pow(Math.abs(a.x-c.x),2)+Math.pow(Math.abs(a.y-c.y),2));//ac
    float p=(aa+bb+cc)/2;
return (float) Math.sqrt(p*(p-aa)*(p-bb)*(p-cc));
 }
}
