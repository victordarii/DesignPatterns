package com.book.chapter1;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacks for real!");
    }
}
