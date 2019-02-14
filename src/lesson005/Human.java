package lesson005;

public class Human {
    int age = 20;
    public static void main(String[] args) {

        Human human = new Human();

        System.out.println(human.getAge(human, human.age));

    }

    /*
        Output:
        40.0
     */
    double getAge(Human h, int a) {
        return h.age + a;
        // StackOverflowError вызов самого себя, переполнение
        // ! return h.getAge(h, a) + a;
    }
}
