package book;

public class Book {
    private String title;
    private int noOfCopies;

    public Book(int noOfCopies) {
        setNoOfCopies(noOfCopies);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies < 0) {
            return;
        }
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void changeNoOfCopies(int howMuch) {
        setNoOfCopies(noOfCopies + howMuch);
    }
}
