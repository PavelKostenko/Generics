/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.generics.e18;

import generics.Generators;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import net.mindview.util.*;

/**
 *
 * @author Pavel
 */
public class FishEating {

    public static void eat(BigFish bF, LittleFish lF) {
        System.out.println(bF + " eats " + lF);
    }

    public static void main(String[] args) {
        
        Random r = new Random();
        List<BigFish> bigFishes = new ArrayList<BigFish>();
        Generators.fill(bigFishes, BigFish.genBF, 5);
        
        List<LittleFish> littleFishes = new LinkedList<LittleFish>();
        Generators.fill(littleFishes, LittleFish.genLF, 15);
        
        for(BigFish bF: bigFishes){
            eat(bF,littleFishes.get(r.nextInt(littleFishes.size())));
        }
    }
}

class LittleFish {

    public static long counter;
    public final long id = counter++;

    private LittleFish() {
    }

    public String toString() {
        return "Little fish " + id;
    }
    public static Generator<LittleFish> genLF = new Generator<LittleFish>() {
        public LittleFish next() {
            return new LittleFish();
        }
    };
}

class BigFish {

    public static long counter;
    public final long id = counter++;

    private BigFish() {
    }

    public String toString() {
        return "Big fish " + id;
    }
    public static Generator<BigFish> genBF = new Generator<BigFish>() {
        public BigFish next() {
            return new BigFish();
        }
    };
}
