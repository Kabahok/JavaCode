package my.function;

import my.classes.Author;
import my.classes.Book;
import my.function.CreateAuthor;

import java.util.Scanner;

public class CreateBook {
    public static Book createBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название книги:");
        String nameBook = sc.next();

        System.out.println("Введите год выпуска:");
        int releaseBook = sc.nextInt();

        System.out.println("Введите количество страниц в книге:");
        int pagesBook = sc.nextInt();

        System.out.println("- Заполните информацию об авторе -");
        Author authorBook = CreateAuthor.createAuthor();
        return new Book(nameBook, releaseBook, authorBook, pagesBook);
    }
}
