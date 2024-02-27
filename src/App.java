public class App {

    public static void main(String[] args) {
        Author author = new Author("Sky", "Pro");
        Book book = new Book("'Учебное пособие'", new Author("Sky", "Pro").toString(), 2024);
        System.out.println("Книга: " + book.getTitle() + ", автор: " + author.getName() + " " + author.getNameOne() + "," +" год издания: " + book.getReleaseYear());

        Book bookOne = new Book("'Объекты и класс'", "Ivan Ivanov", 2024);
        System.out.println("Книга: " + bookOne.getTitle() + ", автор: " + bookOne.getAuthor() + "," +" год издания: " + bookOne.getReleaseYear());
        bookOne.setReleaseYear(2023);
        System.out.println("Книга: " + bookOne.getTitle() + ", автор: " + bookOne.getAuthor() + "," +" год издания: " + bookOne.getReleaseYear());

    }


}
