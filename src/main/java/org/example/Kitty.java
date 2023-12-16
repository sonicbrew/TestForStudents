package org.example;

// Main class
public class Kitty {
    public static void main(String[] args) {
        // create Cat object named kitty
        Cat kitty = new Cat("Kitty", 2);

        // Kitty says meow
        kitty.sayMeow();

        // Display Kitty's age
        kitty.displayAge();
    }
}
