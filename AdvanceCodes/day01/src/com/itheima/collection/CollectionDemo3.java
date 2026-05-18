package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CollectionDemo3 {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");

        // 迭代器
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 增强for
        for (String s : collection) {
            System.out.println(s);
        }

        // foreach
        collection.forEach(System.out::println);

        int[] intArray = {11, 22, 33, 44, 55, 66};
        for (int i : intArray) {
            System.out.println(i);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

}
