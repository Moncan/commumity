package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class collection {
    public static void main(String[] args) {
        Collection<String> col=new TreeSet<>();
        System.out.println(col);
        col.add("张三");
        col.add("李四");
        col.add("王五");
        System.out.println(col);
        boolean b = col.remove("李四");
        System.out.println(b);
        System.out.println(col);
        boolean b1 = col.contains("王五");
        System.out.println(b1);
        boolean b2 = col.isEmpty();
        System.out.println(b2);
        Object[] array = col.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        col.clear();
        System.out.println(col);
        System.out.println(array[1]);
        System.out.println(array[0]);
        }

}
