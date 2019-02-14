package lesson016;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();


        for (int el : arrayExample.intArray) {
            System.out.println(el);
        }

        for (boolean el : arrayExample.blnArray) {
            System.out.println(el);
        }

        for (double el : arrayExample.dblArray) {
            System.out.println(el);
        }


        for (int[] el : arrayExample.mltdmnsnlArray01) {
            for (int sel : el) {
                System.out.println(sel);
            }
        }

        for (int[] el : arrayExample.mltdmnsnlArray02) {
            for (int sel : el) {
                System.out.println(sel);
            }
        }

        for (Obj obj : arrayExample.objs) {
            System.out.println(obj);
        }
    }
}
