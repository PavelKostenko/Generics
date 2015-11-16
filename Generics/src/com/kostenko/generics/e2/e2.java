/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.generics.e2;
import typeinfo.pets.*;
/**
 *
 * @author pavel
 */
public class e2 {
    public static void main(String[] args) {
        Hold3 <Pet> h = new Hold3 <Pet> (new Mouse(),new Cat(),new Dog());
        System.out.println(h.get1());
        System.out.println(h.get2());
        System.out.println(h.get3());
    }
}

class Hold3 <T>{
    T t1;
    T t2;
    T t3;
    public Hold3(T a,T b,T c){
        t1 = a;
        t2 = b;
        t3 = c;
    }
    
    T get1(){
        return t1;
    }
    T get2(){
        return t2;
    }
    T get3(){
        return t3;
    }
    void set1(T t){
        t1 = t;
    }
    void set2(T t){
        t2 = t;
    }
    void set3(T t){
        t3 = t;
    }
}