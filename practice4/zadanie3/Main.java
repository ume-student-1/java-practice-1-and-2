package zadanie3;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isRead;

    public Book(String title, String author, int pages, boolean isRead) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String describe() {
        return "Книга: " + title + " автор " + author
                + ", " + pages + " стр., прочитана: " + (isRead ? "Да" : "Нет");
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }

        return result;
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public int getTotalPages() {
        int totalPages = 0;

        for (Book book : books) {
            totalPages += book.getPages();
        }

        return totalPages;
    }

    public List<Book> getUnreadBooks() {
        List<Book> unreadBooks = new ArrayList<>();

        for (Book book : books) {
            if (!book.isRead()) {
                unreadBooks.add(book);
            }
        }

        return unreadBooks;
    }
}
public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book[] books = {
            new Book("Скотный двор", "Джордж Оруэлл", 224, false),
            new Book("1984", "Джордж Оруэлл", 328, true),
            new Book("Мастер и Маргарита", "Михаил Булгаков", 480, true),
            new Book("Собачье сердце", "Михаил Булгаков", 256, false),
            new Book("Преступление и наказание", "Федор Достоевский", 672, true),
            new Book("Идиот", "Федор Достоевский", 640, false)
        };

        for (Book book : books) {
            library.addBook(book);
        }

        System.out.println("Общее количество страниц:");
        System.out.println(library.getTotalPages());

        System.out.println();

        System.out.println("Книги Джорджа Оруэлла:");

        for (Book book : library.findByAuthor("Джордж Оруэлл")) {
            System.out.println(book.describe());
        }

        System.out.println();

        System.out.println("Непрочитанные книги:");

        for (Book book : library.getUnreadBooks()) {
            System.out.println(book.describe());
        }
    }
}
