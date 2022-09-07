package task;

public class Main {
    public static void main(String[] args) {
        var author = new Author("Лев", "Толстой");
        var book = new Book("Война и мир", author, 1865);
        var author1 = new Author("Стивен", "Кинг");
        var book1 = new Book("Чужак", author1, 2018);


        System.out.println(book.getName()+" "+book.getPublicationYear()+ " " +book.getAuthor());
        System.out.println(book1.getName()+" "+book1.getPublicationYear()+ " " +book1.getAuthor());

        book1.setPublicationYear(2020);

        System.out.println(book1.getName()+" "+book1.getPublicationYear()+ " " +book1.getAuthor());
    }
}
