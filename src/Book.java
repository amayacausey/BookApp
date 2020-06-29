public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    public Book(){
    }

    public Book(String title){ // new Book("Java")
        this.title=title;
    }

    // new Book("Java", "Someone", "Java book", 10.00, true)
    public Book(String title, String author, String description, double price, boolean isInStock){
        this.title=title;
        this.author=author;
        this.description=description;
        this.price=price;
        this.isInStock=isInStock;
    }

    // getter and setter

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setInStock(boolean isInStock){
        this.isInStock=isInStock;
    }
    public boolean isInStock(){
        return this.isInStock;
    }
}
