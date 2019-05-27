package lesson011.opp_access_modifiers.one;

public class One {
    private int i = 5;
    protected int j = 5;
    int x = 5;
    public int z = 5;

    void method(){
        System.out.println("Method");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class Second {
    void method(){
        One one = new One();
        // i is private we dont see this variable
        //one.i
        // Other we see
        one.j = 1;
        one.x = 2;
        one.z = 3;
    }
}
