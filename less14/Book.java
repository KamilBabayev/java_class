package less14;

public class Book {
    public String title;
    public String author;
    public int yearPublished;
    public int pageCount;

    public Book(){
        this.title = "unknown";
        this.author = "unknown";
        this.yearPublished = 0;
        this.pageCount = 0;
    }

    public Book(String title, String author, int yearPublished, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.yearPublished = yearPublished;
    }

    public void showBook() {
        System.out.println();
        System.out.println(author + "\n" + title + "\n" + yearPublished + "\n" + pageCount);
    }

    public void updateBook(String title, String author, int yearPublished, int pageCount) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }
}
