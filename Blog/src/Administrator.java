public class Administrator extends User{
    public Administrator(String name, String password) {
        super(name, password);
    }

    public void Register(User user){
        System.out.println("Registering user");
    }
}
