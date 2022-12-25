package com.bzl.datastructure;

import java.util.LinkedList;

public class LinkedListGenerics {
    public static void main(String[] args) {
        LinkedList<Integer>  simpleList = new LinkedList<Integer>();
        simpleList.add(56);
        simpleList.add(30);
        simpleList.add(70);
        int i = 0;
        for(Integer a:simpleList){
            i++;
            if(a == 30){
                System.out.println("Node found");
                break;
            }
        }
        simpleList.add(i,40);
        System.out.println(simpleList);

    }
}