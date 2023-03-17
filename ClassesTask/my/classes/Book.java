package my.classes;


public class Book {
    private String title;
    private int releaseYear;
    private Author author;
    private int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return (title.contains(word) || author.getName().contains(word) || author.getSurname().contains(word));
    }

    public int estimatePrice() {
        int res = (int) Math.floor(3 * pages * Math.sqrt(author.getRating()));
        return Math.max(res, 250);
    }

    public String getTitle() {
        return this.title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public int getPages() {
        return this.pages;
    }


}
