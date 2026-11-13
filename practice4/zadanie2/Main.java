package zadanie2;

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

class Reader {
    private String name;
    private String favoriteGenre;
    private Book lastBook;

    public Reader(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public void readBook(Book book) {
        lastBook = book;
        book.setRead(true);
    }

    public String getLastBookInfo() {
        if (lastBook == null) {
            return "ты ничего не читвал";
        }

        return lastBook.describe();
    }
}

public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Александр", "Фантастика");
        Reader reader2 = new Reader("Даун", "Детективы");

        Book book1 = new Book("1984", "Джордж Оруэлл", 328, false);
        Book book2 = new Book("Шерлок Холмс", "Артур Конан Дойл", 250, false);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 480, false);

        reader1.readBook(book1);
        reader2.readBook(book2);

        System.out.println("что читал Александр:");
        System.out.println(reader1.getLastBookInfo());

        System.out.println();

        System.out.println("что читал даун:");
        System.out.println(reader2.getLastBookInfo());

        System.out.println();

        System.out.println("доп книга:");
        System.out.println(book3.describe());
    }
}