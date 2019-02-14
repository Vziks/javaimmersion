package lesson016;

class Obj {}


class ArrayExample {
    int[] intArray = {1, 2, 3, 4, 5};
    boolean[] blnArray = {true, false, false, true};
    double[] dblArray = {2.33, 5.2, 2.744, 8.49433};

    // Good practice
    int[][] mltdmnsnlArray01 = {{1, 2}, {4, 3}};
    // Bad practice
    int[] mltdmnsnlArray02[] = {{5, 2}, {8, 3}};

    Obj[] objs = {new Obj(),new Obj(),new Obj()};
}
