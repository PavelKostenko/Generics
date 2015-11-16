package com.kostenko.generics.e4;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector <T> {
  boolean end();
  T current();
  void next();
}	
class Element <T> {
    public final T t;
    public Element(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
}
public class Sequence <T> {
  private Element [] items;
  private int next = 0;
  public Sequence(int size) { items = new Element[size]; }
  public void add(T x) {
    if(next < items.length)
      items[next++] = new Element(x);
  }
  private class SequenceSelector implements Selector <T> {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public T current() { 
        return (T)items[i].getT();
    }
    public void next() { if(i < items.length) i++; }
  }
  public Selector <T> selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Sequence <Integer> sequence = new Sequence <Integer>(10);
    for(int i = 0; i < 10; i++)
      sequence.add(i);
    Selector <Integer> selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
