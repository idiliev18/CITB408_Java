package week2.exercise.repo;

public class Book extends Document {

    private Author author;
    private final String isbn;

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(Author author, String isbn) {
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title, String format, double size, String isbn, Author author) {
        super(title, format, size);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
