package org.example.homework003.task003;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Первый", "Автор", 200, 1900, 13);
        Book book2 = new Book("Второй", "Тайтай", 2000, 2019, 7);
        Book book3 = new Book("Третий", "ТумТум", 500, 1905, 1);
        Book book4 = new Book("Четвертый", "ТрамТрам", 100, 5000, 100);
        Book book5 = new Book("Пятый", "Дворник", 50, 2000, 200);
        Book book6 = new Book("Шестой", "Ааррр", 60, 2010, 23);
        Book book7 = new Book("Седьмой", "Тай", 500, 2023, 100);
        Book book8 = new Book("Восьмой", "Пафнутй", 70, 2017, 13);

        List<Book> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);


        StringBuilder sortedBooks = new StringBuilder();
        for (int i = 0; i < booksList.size(); i++) {
            if (isPrime(booksList.get(i).countPages) && booksList.get(i).author.contains("а")) {
                if (booksList.get(i).year >= 2010 && booksList.get(i).year <= 2023) {
                    sortedBooks.append(booksList.get(i).name).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

}