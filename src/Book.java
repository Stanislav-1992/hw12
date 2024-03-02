import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int releaseYear;


    public Book(String title, Author author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString() {
        return "Книга: " + title + "; " + author + "; релиз: " + releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, releaseYear);
    }
}