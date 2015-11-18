package com.kostenko.generics.e6;

//: generics/RandomList.java
import java.util.*;

public class RandomList<T> {
  private ArrayList<T> storage = new ArrayList<T>();
  static private Random rand = new Random(47);
  public void add(T item) { storage.add(item); }
  public T select() {
    return storage.get(rand.nextInt(storage.size()));
  }
  public static void main(String[] args) {
    RandomList<String> rs = new RandomList<String>();
    for(String s: ("The quick brown fox jumped over " +
        "the lazy brown dog").split(" "))
      rs.add(s);
    for(int i = 0; i < 11; i++)
      System.out.print(rs.select() + " ");
    
    RandomList<Integer> integ = new RandomList<Integer>();
    for (int j = 0; j<10;j++){
        integ.add(j);
    }
    for (int k = 0; k<10; k++){
        System.out.print(integ.select() + " ");
    }
    
    RandomList<Boolean> bool = new RandomList<Boolean>();
    Random rand1 = new Random();
    for (int j = 0; j<10;j++){
        if (j%2==0){
            bool.add(Boolean.TRUE);
        } else{
            bool.add(Boolean.FALSE);
        }
    }
    for (int k = 0; k<10; k++){
        System.out.print(bool.select() + " ");
    }
  }
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
