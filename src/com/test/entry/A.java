package com.test.entry;

public interface A {
    public default void show(){
        System.out.println("A");
    }
    public default void show1(){
        System.out.println("A");
    }
    public static void show2(){
        System.out.println("A");
    }
}
