public class App {

    public static void main(String[] args) {
        Author author = new Author("Sky", "Pro");
        Book book = new Book("'Учебное пособие'", new Author("Sky", "Pro"), 2024);
        System.out.println("Книга: " + book.getTitle() + ", автор: " + author.getName() + " " + author.getNameOne() + "," +" год издания: " + book.getReleaseYear());

        Author authorOne = new Author("Ivan", "Ivanov");
        Book bookOne = new Book("'Объекты и класcы'",new Author("Ivan", "Ivanov"), 2024);
        System.out.println("Книга: " + bookOne.getTitle() + ", автор: " + authorOne.getName() + " " + authorOne.getNameOne() + "," +" год издания: " + bookOne.getReleaseYear());
        bookOne.setReleaseYear(2023);
        System.out.println("Книга: " + bookOne.getTitle() + ", автор: " + authorOne.getName() + " " + authorOne.getNameOne() + "," +" год издания: " + bookOne.getReleaseYear());

        System.out.println(author);
        System.out.println(authorOne);
        System.out.println(book);
        System.out.println(bookOne);
        System.out.println(author.equals(authorOne));
        System.out.println(book.equals(bookOne));
        System.out.println(authorOne.hashCode());
        System.out.println(author.hashCode());
        System.out.println(book.hashCode());
        System.out.println(bookOne.hashCode());


    }
}
