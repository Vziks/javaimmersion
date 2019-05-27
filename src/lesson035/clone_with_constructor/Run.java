package lesson035.clone_with_constructor;

public class Run {

    public static void main(String[] args) {
        User u1 = new User(1, "Name 1");

        User u2 = new User(u1);

        u2.setId(2);
        System.out.println(u1);
        System.out.println(u2);
    }
}
