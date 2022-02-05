import java.util.*;
import java.io.*;
public class A {
    public void print(){
        System.out.println("A");
    }
}

public class B extends A {
    public void print(){
        System.out.println("B");
    }
}

public class C extends A {
    public void print(){
        System.out.println("C");
    }
}

public class Test{
    public static void main(String args[]){
        B b = new B();
        C c = new C();
        b = c;

        newPrint(b);
    }

    public static void newPrint(A a){
        a.print();
    }
}