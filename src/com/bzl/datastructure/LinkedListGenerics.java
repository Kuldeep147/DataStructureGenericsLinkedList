package com.bzl.datastructure;

import java.util.LinkedList;

public class LinkedListGenerics {
    public static void main(String[] args) {
        LinkedList<Integer>  simpleList = new LinkedList<Integer>();
        simpleList.add(70);
        simpleList.add(30);
        simpleList.add(56);
        System.out.println(simpleList);

    }
}