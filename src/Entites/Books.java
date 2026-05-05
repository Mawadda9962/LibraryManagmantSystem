package Entites;

public class Books {

    private String Author;
    private String isbn;

    public Books(String author, String isbn) {
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
