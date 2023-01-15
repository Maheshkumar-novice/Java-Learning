package book;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book(100);
        System.out.println(book1.getNoOfCopies());
        book1.setTitle("The Art Of Computer Programming");
        book1.setNoOfCopies(100);
        System.out.println(book1.getTitle());
        System.out.println(book1.getNoOfCopies());

        Book book2 = new Book(75);
        System.out.println(book2.getNoOfCopies());
        book2.setTitle("Effective");
        book2.setNoOfCopies(10);
        System.out.println(book2.getTitle());
        System.out.println(book2.getNoOfCopies());


        Book book3 = new Book(60);
        System.out.println(book3.getNoOfCopies());
        book3.setTitle("Clean Code");
        book3.setNoOfCopies(30);
        System.out.println(book3.getTitle());
        System.out.println(book3.getNoOfCopies());

        book1.changeNoOfCopies(-1100);
        book2.changeNoOfCopies(100);
        book3.changeNoOfCopies(200);

        System.out.println(book1.getNoOfCopies());
        System.out.println(book2.getNoOfCopies());
        System.out.println(book3.getNoOfCopies());
    }
}
