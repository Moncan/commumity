package com.example.demo;

import java.util.ArrayList;

public class DemoFor {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add("eee");

        for (String s:arrayList){
            System.out.println(s);
        }
    }
}
