package com.kostenko.generics.e14;

//: generics/BasicGeneratorDemo.java
import net.mindview.util.*;

public class BasicGeneratorDemo {
  public static void main(String[] args) {
    Generator<CountedObject> gen =
      BasicGenerator.create(CountedObject.class);
    for(int i = 0; i < 5; i++)
      System.out.println(gen.next());
    
      System.out.println("***************");
    
    Generator<CountedObject> genExp =
      new BasicGenerator(CountedObject.class);
    for(int i = 0; i < 5; i++)
      System.out.println(genExp.next());
  }
} /* Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
*///:~
