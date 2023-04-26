package org.example;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.comparison(book1, book2));
    }
}