package lesson022;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int[] arr10;
    static ArrayList al = new ArrayList();
    static int[] arr1;

    //    Object[] arr2 = arr1;


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            al.add(i, new Object());
//            al.add(1, );
        }


        for (int i = 0; i < 10; i++) {
//            arr1[1] = i;
//            al.add(1, );
        }

        System.out.println(al);
        System.out.println(arr1);

        List<String> listStrings = new ArrayList<String>();
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Four");

//        List<String> list02 = List.of("one", "two", "three");


        MyContainer container = new MyContainer(listStrings);
        System.out.println(container.getCount());

        List<String> listStrings01 = new ArrayList<>();
        // OK to add Strings:
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        // But this will cause compile error
        // istStrings.add(123);

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        System.out.println("listStrings01 = " + listStrings);

        for (String s: listStrings) {
            System.out.println("s = " + s);

        }


        List<Number> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(new Integer(123));
        linkedNumbers.add(new Float(3.1415));
        linkedNumbers.add(new Double(299.988));
        linkedNumbers.add(new Long(67000));

        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        System.out.println("singleton01 = " + singleton01);
        System.out.println("singleton02 = " + singleton02);

        EagerInitializedSingleton eagerinitializedsingleton01 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerinitializedsingleton02 = EagerInitializedSingleton.getInstance();

        System.out.println("eagerinitializedsingleton01 = " + eagerinitializedsingleton01);
        System.out.println("eagerinitializedsingleton02 = " + eagerinitializedsingleton02);

        StaticBlockSingleton staticblocksingleton01 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticblocksingleton02 = StaticBlockSingleton.getInstance();

        System.out.println("staticblocksingleton01 = " + staticblocksingleton01);
        System.out.println("staticblocksingleton02 = " + staticblocksingleton02);


        enumSingleton enumsingleton01 = enumSingleton.INSTANCE;
        enumSingleton enumsingleton02 = enumSingleton.INSTANCE;

        System.out.println("enumsingleton01 = " + enumsingleton01.i);
        System.out.println("enumsingleton02 = " + enumsingleton02.i);

        enumsingleton01.i = 6;

        System.out.println("enumsingleton01 = " + enumsingleton01.i);
        System.out.println("enumsingleton02 = " + enumsingleton02.i);


        MySingleton mysingleton01 = MySingleton.instance();
        MySingleton mysingleton02 = MySingleton.instance();

        System.out.println("mysingleton01 = " + mysingleton01);
        System.out.println("mysingleton02 = " + mysingleton02);
    }


}
