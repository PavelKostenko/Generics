/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.generics.e3;

/**
 *
 * @author Pavel
 */

public class SixTuple{
    public final int a;
    public final int b;
    public final String s;
    public final boolean bool;
    public final float f;
    public final double d;
    
    public SixTuple(int a, int b, String s, boolean bool,float f, double d){
        this.a = a;
        this.b = b;
        this.s = s;
        this.bool = bool;
        this.f = f;
        this.d = d;
    }
    public String toString(){
        return (a + ", " + b + ", " + s + ", " + bool + ", " + f + ", " + d);
    }
}