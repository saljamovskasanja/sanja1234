package com.company;

public class Main {

    public static void main(String[] args) {
	sayHello("Sanja");
    }
    public static void sayHello(String name){
        System.out.println("Hello " +name);
        System.out.println("Hi");

    }
    private int age = 7;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
