package lesson023;

public class Pool {
    public static void main(String[] args) {
        {
            String s01 = "String";
            String s02 = "String";

            System.out.printf("s01 == i02 = %b\n", s01 == s02);
            System.out.printf("s01 eq i02 = %b\n", s01.equals(s02));

            String ss01 = new String("String");
            String ss02 = "String";

            System.out.printf("ss01 == ss02 = %b\n", ss01 == ss02);
            System.out.printf("ss01 eq ss02 = %b\n", ss01.equals(ss02));


            Integer i01 = 5;
            Integer i02 = 5;

            System.out.printf("i01 == i02 = %b\n", i01 == i02);
            System.out.printf("i01 eq i02 = %b\n", i01.equals(i02));

            Integer ii01 = new Integer(5);
            Integer ii02 = new Integer(5);

            System.out.printf("ii01 == ii02 = %b\n", ii02 == ii02);
            System.out.printf("ii01 eq ii02 = %b\n", ii01.equals(ii02));
        }

        {
            Integer i01 = 128;
            Integer i02 = 128;

            System.out.printf("i01 == i02 = %b\n", i01 == i02);
            System.out.printf("i01 eq i02 = %b\n", i01.equals(i02));

            Integer ii01 = new Integer(128);
            Integer ii02 = new Integer(128);

            System.out.printf("ii01 == ii02 = %b\n", ii02 == ii02);
            System.out.printf("ii01 eq ii02 = %b\n", ii01.equals(ii02));
        }

    }
}
