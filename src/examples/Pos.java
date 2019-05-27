package examples;

public class Pos {

    private boolean active;



    public static void main(String[] args) {



    }


    private static int Func(int var_1) {
        int n = 1;
        for (int i = 0; i <= var_1; i += 5) {
            n = -5 * var_1;
        }
        return n;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
