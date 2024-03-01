public class Author {
    String name;
    String nameOne;
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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameOne);
    }
}