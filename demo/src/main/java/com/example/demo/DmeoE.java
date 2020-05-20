package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class DmeoE {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);

        ArrayList<String> a2=new ArrayList<>();
        a2.add("hello");
        a2.add("word");

        printArray(a1);
        printArray(a2);
        }

    public static void printArray(ArrayList<?> arrayList){
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
