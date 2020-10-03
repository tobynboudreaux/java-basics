package com.toby;

public final class FinalClass {
    
    protected final String type = "Type-A";
    protected final ClassA classA = new ClassA();

    public final void someMethod(){
        System.out.println("Some Method");
    }
}

public class ClassA {

    public String greeting = "Hello";

    public final void someMethod(){
        System.out.println("Some Method.");
    }
}

public final class ClassB extends ClassA {

    public final void someMethod(int x) {
        System.out.println("Some method.");
    }
}

public class Simulator {

    public static void main(String[] args) {
        FinalClass fc = new FinalClass();

        fc.classA.greeting = "New Greeting";
    }
}
