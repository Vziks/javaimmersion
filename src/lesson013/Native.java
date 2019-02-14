package lesson013;

public class Native {
    public native int square(int i);

    public static void main(String[] args) {
        System.loadLibrary("Native");
        System.out.println(new Native().square(2));
    }
}
