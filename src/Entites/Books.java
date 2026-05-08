package Entites;

import java.util.Scanner;

public class Books extends LibraryItems {

    Scanner sr = new Scanner(System.in);

    private String Author;
    private String isbn;

    public Books(Scanner sr, String author, String isbn) {
        this.sr = sr;
        Author = author;
        this.isbn = isbn;
    }

    public Books(String ID, String tittle, boolean status, Scanner sr, String author, String isbn) {
        super(ID, tittle, status);
        this.sr = sr;
        Author = author;
        this.isbn = isbn;
    }

    public Scanner getSr() {
        return sr;
    }

    public void setSr(Scanner sr) {
        this.sr = sr;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Books{" +
                "sr=" + sr +
                ", Author='" + Author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}


