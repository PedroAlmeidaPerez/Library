package model;

public class Book {
    private int Id;
    private static int IdNext = 1;
    private String tittle;
    private String author;
    private int year;
    private boolean status;
    private String lent;
    private int IdLent;


    public Book(String tittle) {
        this.tittle = tittle;
        Id = IdNext;
        IdNext++;

    }

    public Book(String tittle, String author, int year) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
        Id = IdNext;
        IdNext++;
    }

    public int getId() {
        return Id;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLent() {
        return lent;
    }

    public void setLent(String lent) {
        this.lent = lent;
    }

    public int getIdLent() {
        return IdLent;
    }

    public void setIdLent(int idLent) {
        IdLent = idLent;
    }

    public void showBook(Book book) {
        System.out.print("Id: " + book.getId() +
                " Tittle: " + book.getTittle() +
                " Author: " + book.getAuthor() +
                " Year: " + book.getYear() +
                " Status: ");

        if (book.getStatus()) {
            System.out.println("lent");
        } else {
            System.out.println("not lent");
        }
     }

    @Override
    public String toString() {
        return "\nid: " + Id + ", tittle: " + tittle + ", author: " + author + ", year: " + year ;
    }

}
