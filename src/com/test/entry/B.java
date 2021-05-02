package com.test.entry;

public interface B {
    public default  void  show1(){
        System.out.println("B");
    }
    public static void show2(){
        System.out.println("B");
    }
}
