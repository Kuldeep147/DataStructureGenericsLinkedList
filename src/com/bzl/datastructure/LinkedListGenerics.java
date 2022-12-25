package com.bzl.datastructure;

import java.util.LinkedList;

public class LinkedListGenerics {
    LinkedList<Integer>  simpleList = new LinkedList<Integer>();
    public static void main(String[] args) {
        LinkedListGenerics ob = new LinkedListGenerics();
        ob.addSorted(56);
        ob.addSorted(30);
        ob.addSorted(40);
        ob.addSorted(70);
        ob.addSorted(99);
        ob.addSorted(1);
        ob.print();

    }
    public void print(){
        System.out.println(simpleList);
    }
    public void addSorted(Integer a){
        int f = 0;
        if(simpleList.size() == 0){
            simpleList.add(a);
        }else {
            for(Integer d:simpleList){
                f++;
                if (a < d){
                    simpleList.add(f -1,a);
                    break;
                }else if(a > d && f == simpleList.size()){
                    simpleList.add(a);
                    break;
                }
            }
        }
    }
}