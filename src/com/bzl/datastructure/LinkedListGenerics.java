package com.bzl.datastructure;

import java.util.LinkedList;

public class LinkedListGenerics {
    public static void main(String[] args) {
        LinkedList<Integer>  simpleList = new LinkedList<Integer>();
        simpleList.addLast(56);
        simpleList.addLast(30);
        simpleList.addLast(70);
        System.out.println(simpleList);

    }
}