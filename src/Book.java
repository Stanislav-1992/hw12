public class Book {
    String title;
    Class Author;
    int releaseYear;

    public Book(String title, String author, int releaseYear) {
        this.title = title;
        this.Author = author.getClass();
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Class getAuthor() {
        return this.Author;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

