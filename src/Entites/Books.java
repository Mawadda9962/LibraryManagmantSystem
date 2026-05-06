package Entites;

import java.util.Scanner;

public class Books extends LibraryItems {

    Scanner sr = new Scanner(System.in);

    private String Author;
    private String isbn;

    public Books(String newItemId, String itemTitle, String author, String isbn) {
        super(ID, tittle, status);
        Author = author;
        this.isbn = this.isbn;
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
                "Author='" + Author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public boolean getDetails(){
    System.out.println("Book Id" + getID() );
    System.out.println("");


//        System.out.println("Enter item type (Book, Magazine");
//        String itemType = sr.nextLine();
//        if (itemType.equalsIgnoreCase("Book")){
//            System.out.println("Enter Arthur name: ");
//            String AutherName = sr.nextLine();
//            setAuthor(AutherName);
//            System.out.println("Enter Isbn: ");
//            String BookIsbn = sr.next();
//            setIsbn(isbn);
//
//        }else {
//
//        }
        return false;
    }



}


