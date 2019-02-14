package lesson023;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {

    public static void main(String[] args) {
        int i = 5;
        byte b = 3;
        char c = 140;
        float f = 1.40f;
        boolean bl = true;

        Integer ii = 5;
        Byte bb = 3;
        Character cc = 140;
        Float ff = 1.40f;
        Boolean flf = false;

//        int j = "5"; error
        //get numeric valic from string
        int jj = new Integer("522333");

        System.out.println("jj = " + jj);

//        List<int> list; error
        List<Integer> list;


        Integer j01 = new Integer(522333);
        Integer j02 = new Integer("522333");
        // parseInt Return primitive
        int j03 = Integer.parseInt("522333");

//        j03.toString(); error

        // valueOf Return Object
        Integer j04 = Integer.valueOf("522333");
        String str = j04.toString();

        Integer d01 = new Integer(5);
        Integer d02 = new Integer(5);


        System.out.println("j03 = " + j03);
        System.out.println("j03 = " + j04);
        System.out.println(System.identityHashCode(d01));
        System.out.println(System.identityHashCode(d02));


        Integer d03 = new Integer(5);
        Integer d04 = new Integer(5);


        System.out.println("Hashcode :       " + d03.hashCode());
        System.out.println("toString :       " + d03.toString());
        System.out.println("Hashcode :       " + System.identityHashCode(d03));
        System.out.println("Hashcode (HEX) : " + Integer.toHexString(d03.hashCode()));

        System.out.println("Hashcode :       " + d04.hashCode());
        System.out.println("toString :       " + d04.toString());
        System.out.println("Hashcode :       " + System.identityHashCode(d04));
        System.out.println("Hashcode (HEX) : " + Integer.toHexString(d04.hashCode()));

        int d05 = new Integer(5);
        int d06 = new Integer(5);


        System.out.println("Hashcode :       " + System.identityHashCode(d05));

        System.out.println("Hashcode :       " + System.identityHashCode(d06));


        Integer jj01 = new Integer(5);
//        jj01++;
        int tempjj01 = jj01.intValue();
        tempjj01++;
        jj01 = new Integer(tempjj01);


        System.out.println("jj01 = " + jj01);

        int s01 = 5;
        int s02 = s01;

        s01++;
        ++s02;
        s02++;

        System.out.println("s01 = " + s01);
        System.out.println("s02 = " + s02);


        Integer ss01 = new Integer(5);
        Integer ss02 = ss01;

//        System.out.println("ss01 = " + ss01);
//        System.out.println("ss02 = " + ss02);

        System.out.println("ss01.equals(ss02) = " + ss01.equals(ss02));
//
//        ss01.;
        ss01++;
//        ++ss02;
//        ss02++;

        System.out.println("ss01 = " + ss01);
        System.out.println("ss02 = " + ss02);

        System.out.println("ss01.equals(ss02) = " + ss01.equals(ss02));


        Naaa n01 = new Naaa();
        Naaa n02 = n01;


        System.out.println("n01.i = " + n01.ss01);
        System.out.println("n02.i = " + n02.ss01);

        System.out.println("n01.equals(n02) = " + n01.equals(n02));

        n01.ss01++;

        System.out.println("n01.equals(n02) = " + n01.equals(n02));

        System.out.println("n01.i = " + n01.ss01);
        System.out.println("n02.i = " + n02.ss01);


        List<Integer> lst = new ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);


        for (Integer iiii : lst) {
            System.out.println("iiii = " + iiii);
        }


        Integer equal01 = new Integer(5);
        Integer equal02 = equal01;

        System.out.println("equal01.equals(equal02) = " + equal01.equals(equal02));
        equal01++;
        System.out.println("equal01.equals(equal02) = " + equal01.equals(equal02));
        equal01--;
        System.out.println("equal01.equals(equal02) = " + equal01.equals(equal02));


        String equals01 = new String("Sssss");
        String equals02 = equals01;

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.print("equals01 == equals(equals02) = ");

        System.out.println(equals02 == equals01);

        equals01 = equals01 + "s";

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.print("equals01 == equals(equals02) = ");
        System.out.println(equals02 == equals01);

        equals01 = "Sssss";

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.print("equals01 == equals(equals02) = ");
        System.out.println(equals02 == equals01);
    }

    Object method() {
//        is equivalent
//        return 1;
//        return new Integer(1);

        return 5;
    }


}

class Naaa {

    //    int i = 5;
    Integer ss01 = new Integer(5);
    String ss02 = new String("11212212121");
}