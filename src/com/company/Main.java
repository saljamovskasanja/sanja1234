package com.company;

public class Main {

    public static void main(String[] args) {
	sayHello("Ljupce");
    }
    public static void sayHello(String name){
        System.out.println("Helllo " +name);
        System.out.println("Use revert");

    }
    private int age = 7;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
