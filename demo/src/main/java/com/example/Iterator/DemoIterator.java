package com.example.Iterator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        Collection<String>coll=new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        Iterator<String> it= coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
