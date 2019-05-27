package lesson035.clone_with_constructor;

public class User {

    private int id;
    private String name;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(User u) {
        this(u.getId(), u.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}