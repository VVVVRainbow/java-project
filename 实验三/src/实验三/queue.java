/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验三;

import java.util.LinkedList;


/**
 *
 * @author VE
 * @param <T> 类型参数
 */
public class queue <T>{
    public queue(){
        x=new LinkedList();
    }
    LinkedList<T> x;
    public T get(){
        return x.poll();
    }
    public void add(T a){
        x.add(a);
    }
    public boolean  isEmpty()
    {
        return x.isEmpty();
    }
}
