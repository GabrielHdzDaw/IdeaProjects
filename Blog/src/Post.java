public class Post {
    protected String name;
    protected String content;
    protected Author author;
    protected Comment[] comments;
    protected int numComments;
    private static final int MAX_COMMENTS = 100;

    public Post(String name, String content, Author author) {
        this.name = name;
        this.content = content;
        this.author = author;
        comments = new Comment[MAX_COMMENTS];
        numComments = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void addComment(Comment comment){
        comments[numComments] = comment;
        numComments++;

    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", author=" + author +
                '}';
    }
}
