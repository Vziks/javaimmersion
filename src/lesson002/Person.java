package lesson002;

/*
 Class is an extensible program-code-template for creating objects
 Класс — это элемент ПО, описывающий абстрактный тип данных и его частичную или полную реализацию
 Под классом подразумевается некая сущность, которая задает некоторое общее поведение для объектов.
 */
public class Person {
    /*
        Параметры экземпляра класс/Параметры описывают состояние экземпляра класс
     */

    int age = 20;
    int height = 170;
    int weight = 70;

    /*
        Методы экземпляра класса/Методы описывают поведение экземпляра класс
     */
    void walk() {
        System.out.println("Call walk method");
    }

    void sleep() {
        System.out.println("Call sleep method");
    }


    void birthday() {
        age = age + 1;
    }

    public static void main(String[] args) {

        int idx = 0;

        /*
         Create instance of the Person(Type/Class)
         Создание экземпляра класс/типа Person
          */

        Person person = new Person();
        /*
         Call sleep method from Person object
         Вызов  метода sleep экземпляра
          */
        person.sleep();
        /*
        Call walk method from Person object
        Вызов  метода walk экземпляра
         */
        person.walk();

        System.out.println("Person age is " + person.age);

        /*
        Call birthday method from Person object
        Вызов  метода birthday экземпляра
        Изменения состояние экземпляра
         */
        person.birthday();

        System.out.println("Person age is " + person.age);

        /*
        Create array of Person
        Создание массива Person в кол-ве 5, но он пустой (каждый элемент равен null)
        Отсчет от от 1, не от 0
         */
        Person[] group = new Person[5];

        /*
        Output:
        null
        null
        null
        null
        null
         */
        for (Person p : group) {
            System.out.println(p);
        }
        /*
        Output:
        Person  age is 21
        Person  age is 20
        Person  age is 21
        Person  age is 20
        Person  age is 21
         */
        for (Person p : group) {
            /* Create instance of the Person */
            p = new Person();
            if (idx % 2 == 0) {
                p.birthday();
            }
            System.out.println("Person  age is " + p.age);

            idx = idx + 1;
        }


    }


}
