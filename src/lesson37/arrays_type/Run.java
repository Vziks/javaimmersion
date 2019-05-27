package lesson37.arrays_type;

import java.util.Arrays;

public class Run {
    static int[][] arr1 = {{1, 2}, {3, 4}};
    static int[][][] arr2 = new int[2][2][2];
    static float[][] farr1 = {{1, 1, 2, 2}, {3, 3, 4, 4}};
    static float[][][] farr2 = new float[2][2][2];

    private static void checkClass(Object obj) {
        Class cls = obj.getClass();
        System.out.println("The type of the object is: " + cls.getSimpleName());
    }

    public static void main(String[] args) {
        System.out.println(arr2.toString());
        System.out.println(Arrays.deepToString(arr2));
        Run.checkClass(arr1);
        Run.checkClass(arr2);
        System.out.println(farr2.toString());
        Run.checkClass(farr1);
        Run.checkClass(farr2);
    }
}
