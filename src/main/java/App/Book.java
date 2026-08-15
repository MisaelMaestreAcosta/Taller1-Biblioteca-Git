
package App;


public class Book extends Material {
    private String author;
    private boolean available;

    public Book() {
    }

    public Book( String code, String title, String yearPublished, String author, boolean available) {
        super(code, title, yearPublished);
        this.author = author;
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", available=" + available + '}';
    }
    
    
    
    
}
