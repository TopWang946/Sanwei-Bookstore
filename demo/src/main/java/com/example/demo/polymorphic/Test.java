package com.example.demo.polymorphic;

/**
 * @Classname Test
 * @Description 多态练习
 * @Date 2019/8/29
 * @Created by wangzheng
 */
public class Test {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
        System.out.println("9--" + b.show());
    }
}
class A {
    A(){

    }
    String show(D obj) {
        return ("A and D");
    }

    String show(A obj) {
        return ("A and A");
    }

}

class B extends A {
    String show(B obj) {
        return ("B and B");
    }

    String show(A obj) {
        return ("B and A");
    }

    String show(){
        return ("asdaaaaaaaaa");
    }
}

class C extends B {

}

class D extends B {

}