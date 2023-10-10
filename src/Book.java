import java.util.Scanner;

public class Book {
    int ID;
    String Author;
    String Title;
    private boolean availabilityStatus;

    public Book(int ID, String author, String title, String availabilityStatus) {
        this.ID = ID;
        this.Author = author;
        this.Title = title;
        this.availabilityStatus = true;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", Author='" + Author + '\'' +
                ", Title='" + Title + '\'' +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                '}';
    }

}
