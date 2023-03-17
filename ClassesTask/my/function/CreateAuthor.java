package my.function;

import my.classes.Author;

import java.util.Scanner;

public class CreateAuthor {
    public static Author createAuthor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-> Введите имя автора:");
        String nameAuthor = sc.next();

        System.out.println("-> Введите фамилию автора");
        String surnameAuthor = sc.next();

        System.out.println("-> Введите рейтинг автора:");
        int ratingAuthor = sc.nextInt();

        return new Author(nameAuthor, surnameAuthor, ratingAuthor);
    }
}
