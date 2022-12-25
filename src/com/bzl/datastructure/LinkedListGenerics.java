package com.bzl.datastructure;

import java.util.LinkedList;

public class LinkedListGenerics {
    public static void main(String[] args) {
        LinkedList<Integer>  simpleList = new LinkedList<Integer>();
        simpleList.add(56);
        simpleList.add(30);
        simpleList.add(70);
        simpleList.remove(0);
        System.out.println(simpleList);

    }
}