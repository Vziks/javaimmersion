package lesson040.strings;

public class Run {

    public static void main(String[] args) {

        String str = new String("abc");
        System.out.println(str);
        str.concat("111");
        System.out.println(str);

        Person person = new Person("Firstname", "Name", "MiddleName");

        System.out.println(person.getName());
        System.out.println(person.name.hashCode());

        person.name = person.name.concat("AddString");
        System.out.println(person.name.hashCode());

        person.name = person.name.concat("AddString");
        System.out.println(person.name.hashCode());

        System.out.println(person.getName());
    }
}
