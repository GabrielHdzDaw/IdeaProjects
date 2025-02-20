public class Comment {
    protected String content;
    protected Visitor visitor;
    protected String date;

    public Comment(String content, Visitor visitor) {
        this.content = content;
        this.visitor = visitor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content='" + content + '\'' +
                '}';
    }
}
