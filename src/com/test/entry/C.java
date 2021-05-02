package com.test.entry;

public class C {
    public static void main(String[] args) {
        D d=new D();
        d.show();
        d.show1();
        A.show2();
        B.show2();
    }
}
class D implements A,B{

    //逻辑冲突需要重写
    @Override
    public void show1() {
        System.out.println("D");
    }
}
