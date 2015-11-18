/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.generics.e7;

import java.util.Iterator;

/**
 *
 * @author Pavel
 */
public class IterableFibonacci implements Iterable<Integer> {

    Fibonacci f = new Fibonacci();
    int n;

    IterableFibonacci(int n) {
        this.n = n;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return f.next();
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        for (int i: new IterableFibonacci(14)){
            System.out.println(i + " ");
        }
    }
}

