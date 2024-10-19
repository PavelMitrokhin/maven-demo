package byITacademyMPA.marathon.oct4;

public class Book {
    private String id;
    private String name;
    private String author;
    private String publisher;
    private int publishedDate;
    private int pages;
    private double price;
    private String bindingType;

    public Book(String id, String name, String author, String publisher,
                int publishedDate, int pages, double price, String typeOfBinding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.pages = pages;
        this.price = price;
        this.bindingType = typeOfBinding;
    }

    public Book(String id, String Name, String publisher){
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }
    public Book(String id, String name, int publishedDate) {
        this.id = id;
        this.name = name;
        this.publishedDate = publishedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(int publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", typeOfBinding='" + bindingType + '\'' +
                '}';
    }
}

