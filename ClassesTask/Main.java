import my.classes.Book;
import my.function.CreateBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = CreateBook.createBook();

        while (true) {
            reply();
            String input = sc.next();

            if (input.equals("end")) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    if (book.isBig()) {
                        System.out.println("> Книга большая");
                    }
                    System.out.println("> Книга маленькая");
                    break;
                case 2:
                    System.out.println("< Введите слово: ");
                    String word = sc.next();
                    if (book.matches(word)) {
                        System.out.println("> Название или автор содержат слово: " + word);
                    } else {
                        System.out.println("> Название или автор не содержат слово: " + word);
                    }
                    break;
                case 3:
                    System.out.println("> Книга стоит: " + book.estimatePrice());
                    break;
            }
        }
    }

    public static void reply() {
        System.out.println("------------------------------------------------------");
        System.out.println("Что вы хотите узнать о книге? Введите номер функции:");
        System.out.println("1. Узнать размер книги");
        System.out.println("2. Проверить слово в названии или авторе");
        System.out.println("3. Узнать стоимость книги");
        System.out.println("end - выход");
        System.out.println("------------------------------------------------------");
    }
}
