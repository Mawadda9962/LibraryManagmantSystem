package Entites;

public class Books extends LibraryItems {

    private String Author;
    private String isbn;

    public Books(String ID, String tittle, boolean status, String author, String isbn) {
        super(ID, tittle, status);
        Author = author;
        this.isbn = isbn;
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


}
