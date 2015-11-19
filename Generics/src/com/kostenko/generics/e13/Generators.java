package com.kostenko.generics.e13;

//: generics/Generators.java
// A utility to use with Generators.
import generics.coffee.*;
import java.util.*;

public class Generators {
  public static <T> Collection<T>
  fill(Collection<T> coll, Generator<T> gen, int n) {
    for(int i = 0; i < n; i++)
      coll.add(gen.next());
    return coll;
  }	
  public static <T> List<T>
  fill(List<T> coll, Generator<T> gen, int n) {
      System.out.println("Special List method");
    for(int i = 0; i < n; i++)
      coll.add(gen.next());
    return coll;
  }
    public static <T> LinkedList<T>
  fill(LinkedList<T> coll, Generator<T> gen, int n) {
      System.out.println("Special LinkedList method");
    for(int i = 0; i < n; i++)
      coll.add(gen.next());
    return coll;
  }	
  public static void main(String[] args) {
      System.out.println("***************");
    Collection<Coffee> coffee = fill(
      new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
    for(Coffee c : coffee)
      System.out.println(c);
    System.out.println("***************");
    Collection<Integer> fnumbers = fill(
      new ArrayList<Integer>(), new Fibonacci(), 12);
    for(int i : fnumbers)
      System.out.print(i + ", ");
    System.out.println();
    System.out.println("***************");
    Collection<Integer> mynumbers = fill(
      new HashSet<Integer>(), new Fibonacci(), 12);
    for(int i : mynumbers)
      System.out.print(i + ", ");
    System.out.println("***************");
    Collection<Integer> mynumbers1 = fill(
      new LinkedList<Integer>(), new Fibonacci(), 12);
    for(int i : mynumbers1)
      System.out.print(i + ", ");
  }
} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
*///:~
