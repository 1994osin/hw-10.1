import java.util.Objects;

public class Book {
    private final String publisher;
    private final Author author;
    private int yearOfPublication;

    public Book(String publisher, Author author, int yearOfPublication) {
        this.publisher = publisher;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Издатель: " + publisher + ", " + author + ", год издания: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(publisher, book.publisher) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher, author, yearOfPublication);
    }
}
