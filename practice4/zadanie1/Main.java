package zadanie1;

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

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String describe() {
        return "Книга: " + title + " автор " + author +
                ", " + pages + " стр., прочитана: " + (isRead ? "Да" : "Нет");
    }
}

public class Main {
    public static void main(String[] args) {

        Book[] books = {
            new Book("1984", "Джордж Оруэлл", 328, true),
            new Book("Мастер и Маргарита", "Михаил Булгаков", 480, false),
            new Book("Преступление и наказание", "Федор Достоевский", 672, true)
        };

        for (Book book : books) {
            System.out.println(book.describe());
        }
    }
}