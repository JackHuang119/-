package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    /*
     *  Collection常用成员方法
     *  add
     *  remove
     *  contain
     *  clear
     *  isEmpty
     *  size
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.clear();;
        System.out.println(collection.isEmpty());
    }



}
