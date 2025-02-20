public class Book {
    private String title;
    private int numPages;
    private double price;
    private Author author;

    public Book(String title, int numPages, double price, Author author)
    {
        this.title = title;
        this.numPages = numPages;
        this.price = price;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public int getNumPages(){
        return numPages;
    }

    public double getPrice(){
        return price;
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    @Override
    public String toString(){
        return String.format("Title: %s Number of pages: %d Price: %.2f", title, numPages, price);
    }
}
