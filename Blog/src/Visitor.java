public class Visitor extends User{
    public Visitor(String name, String password) {
        super(name, password);
    }

    public void commentPost(Post post, Comment comment){
        post.addComment(comment);
        System.out.println("Commenting on post " + post.getName() + " comment " + comment.getContent());
    }
}
