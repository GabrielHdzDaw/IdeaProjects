public class Main {
    public static void main(String[] args) {
        Editor e = new Editor("editor1", "password123");
        Visitor v = new Visitor("visitor1", "pass1111");

        // Create a post published by editor "e"
        Post p = new Post("Post title", "Post contents", "2020-03-07");
        e.publishPost(p);

        // Create a coment over post "p" created by visitor "v"
        Comment c = new Comment("Comment text", "2020-03-21", v);
        v.commentPost(p, c);

        System.out.println(e);
    }
}
