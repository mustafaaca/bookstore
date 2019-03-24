
/**
 * @author mustafa
 **/

public class Book 
{
    //We created here features of a book
    private int id;
    private String name;
    private String author;
    private String publisher;
    private String type;
    private String numberOfPages;
    private String publishYear;
    private String price;

    //We created here book class constructor
    public Book(int id, String name, String author, String publisher, String type, String numberOfPages, String publishYear, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
        this.numberOfPages = numberOfPages;
        this.publishYear = publishYear;
        this.price = price;
    }

    //We created here setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
