package my.classes;

public class Author {
    private String name;
    private String surname;
    private int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getRating() {
        return this.rating;
    }
}
