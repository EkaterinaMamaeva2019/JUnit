package org.example;

public class Book {
    public int amount;
    public Book (){
        this.amount = amount;
    }

    public String toString(){
        return "колличество страниц "  + amount;
    }

    public String comparison (Book book1, Book book2){
        if (book1.amount > book2.amount) return " первая книга больше "; else
        if (book1.amount < book2.amount) return " вторая книга больше "; else return "книги равны";
    }
}
