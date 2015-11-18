//: net/mindview/util/New.java
// Utilities to simplify generic container creation
// by using type argument inference.
package com.kostenko.generics.e11;

import java.util.*;

public class New {

    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    // Examples:

    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> qs = New.queue();
        System.out.println("**************");
        Map<MyBeautifulClass, MySuperBeautifulClass> m = New.map();
        m.put(new MyBeautifulClass(13), new MySuperBeautifulClass(56));
        System.out.println(m);

    }
} ///:~

class MyBeautifulClass {
    int j;
    public MyBeautifulClass(int i) {
        j = i;
    }

    public String toString() {
        return j + " MyBeautifulClass";
    }
}

class MySuperBeautifulClass {
    int j;
    public MySuperBeautifulClass(int i) {
        j = i;
    }

    public String toString() {
        return j + " MySuperBeautifulClass";
    }
}
