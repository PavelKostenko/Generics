package com.kostenko.generics.e10;

//: generics/GenericMethods.java

public class GenericMethods {
  public <T, U, V> void f(T x, Integer u, V v) {
    System.out.println(x.getClass().getName());
    System.out.println(u.getClass().getName());
    System.out.println(v.getClass().getName());
      System.out.println("**************");
    
  }
  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f("", 1, 1.0);
    gm.f(1.0F, 90,gm);
  }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
