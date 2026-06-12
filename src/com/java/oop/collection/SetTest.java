package com.java.oop.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    static void main() {
        Set set = new HashSet();
        set.add("kittu");
        set.add(1);
        set.add("kittu");
        set.add("vikas");
        set.add("balu");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(1));
        set.remove("vikas");
        System.out.println(set);
        System.out.println(set.size());
     //   Iterator iterator = set.iterator();
    //  while (iterator.hasNext()){
       // System.out.println(set.next());
     //  }
        Set<String>  name = new HashSet<>();
            name.add("vikas");
            name.add("kittu");
            name.add("balu");
        System.out.println(name);
        for (String names : name) {
            System.out.println(name.size());
        }



    }
}
