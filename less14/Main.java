package less14;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.showBook();
        book.updateBook("Ocean", "Conan", 1988, 288);
        book.showBook();
    }
}
