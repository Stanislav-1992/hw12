import java.util.Objects;

public class Author {
    private String name;
    private String nameOne;

    public Author(String name, String nameOne) {
        this.name = name;
        this.nameOne = nameOne;
    }
    public String getName() {
        return this.name;
    }
    public String getNameOne() {
        return this.nameOne;
    }
    @Override
    public String toString() {
        return "Автор: " + "имя - " + name + ", фамилия - " + nameOne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(nameOne, author.nameOne);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameOne);
    }
}