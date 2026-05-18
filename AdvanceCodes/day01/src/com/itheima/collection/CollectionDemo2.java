package com.itheima.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



}
