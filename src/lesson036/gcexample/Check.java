package lesson036.gcexample;

public class Check {
    static int count;

    Check() {
        count++;
        System.out.println("Create object " + count);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Destroy object" + count--);
    }
}
