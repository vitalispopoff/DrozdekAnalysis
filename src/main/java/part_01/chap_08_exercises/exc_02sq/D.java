package part_01.chap_08_exercises.exc_02sq;

import part_01.chap_08_exercises.exc_02sq.inner.A;

public class D extends A {

    static A var = new A("k", "m", "p", "q");

    static void cMethod (){

//        System.out.println(var.k);  //  Error: java: k has private access in (...).A
//        System.out.println(var.m);  //  Error: java: m is not public in (...).inner.A; cannot be accessed from outside package
//        System.out.println(var.p);  //  Error: java: p has protected access in (...).A
        System.out.println(var.q);
    }

    public static void main(String[] args) {
    }
}