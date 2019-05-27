package lesson034.order_of_initialization_of_fields_and_blocks;

public class Run {

    public static void main(String[] args) {
        /*
            Т.е. порядок такой:
            1. Статические блоки и статические поля в порядке объявления суперкласса(FirstClass)
            2. Статические блоки и статические поля в порядке объявления подкласса(SecondClass)
            3. Не статические блоки и не статические поля в порядке объявления суперкласса(FirstClass)
            4. Конструктор суперкласса(FirstClass)
            5. Не статические блоки и не статические поля в порядке объявления подкласса(SecondClass)
            6. Конструктор подкласса(SecondClass)
         */
        new SecondClass();
    }
}
