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

}
