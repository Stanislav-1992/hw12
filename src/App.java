public class App {

    public static void main(String[] args) {
        Author author = new Author("Sky", "Pro");
        Book book = new Book("'Учебное пособие'", new Author("Sky", "Pro").toString(), 2024);
        System.out.println("Книга: " + book.title + ", автор: " + author.name + " " + author.nameOne + "," +" год издания: " + book.releaseYear);
        
    }

}
