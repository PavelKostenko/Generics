/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.generics.e1;
import typeinfo.pets.*;
/**
 *
 * @author pavel
 */
public class e1 {
    public static void main(String[] args) {
        Holder <Pet> h = new Holder<Pet>(new Mouse());
        System.out.println(h.getT());
    }
    
    
}

class Holder <T>{
    public T t;
    public Holder(T a){
        t = a;
    }
    public void setT(T new_t){
        t = new_t;
    }
    public T getT(){
        return t;
    }
}