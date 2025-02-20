public class Author {
    private String name;
    private int yearBirth;
    private Book[] books;

    public Author(String name, int yearBirth, Book[] books)
    {
        this.name = name;
        this.yearBirth = yearBirth;
        this.books = books;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public Book[] getBooks(){
        return books;
    }

    public void setBooks(Book[] books){
        this.books = books;
    }

    @Override
    public String toString(){
        String allBooks = "";
        for (Book book : books) {
            allBooks += "\n" + book;
        }
        return String.format("Name: %s Year of birth: %d Books: %s", name, yearBirth, allBooks);
    }
}
