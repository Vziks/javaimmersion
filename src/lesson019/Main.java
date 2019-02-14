package lesson019;

public class Main {

    public static void main(String[] args)  throws Exception{
        Parent pr = new Parent();
        Parent ch = new Child01();

        System.out.println(pr.method());
        System.out.println(ch.method());

        Parent ch1 = new Child02();
        System.out.println(ch1.method());
    }
}
