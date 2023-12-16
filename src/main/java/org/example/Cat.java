package org.example;

public class Cat {
    // instance variables
    private String name;
    private int age;

    // Constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // instance methods
    public void sayMeow() {
        System.out.println(this.name + " says: Meow!");
    }

    public void displayAge() {
        System.out.println(this.name + " is " + this.age + " years old.");
    }
}