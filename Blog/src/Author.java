public class Author extends Editor{
    protected Editor editor;

    public Author(String name, String password) {
        super(name, password);
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public void Create(){
        System.out.println("Creating post");
    }
}
