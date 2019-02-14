package lesson004.objects;


import lesson004.Test;
import lesson004.Test.*;

class Obj {
    int i = 6;
}


public class ObjectTypes {

    /*
        Java Object data types
           Boolean:    1 bit,   true or false,                                             default: false
           Byte:       8 bits,  from -128 to 127,                                          default: 0
           Short:      16 bits, from -32768 to 32767,                                      default: 0
           int:        32 bits, from -2147483648 to 2147483647,                            default: 0
           long:       64 bits, from -9223372036854775808L to 9223372036854775807L,        default: 0L
           float:      32 bits, from -1.4e-45f to 3.4e+38f,                                default: 0.0
           Double:     64 bits, from -4.9e-324 to 1.7e+308,                                default: 0.0D
           String:     16 bits, N byte Unicode string of textual data. Immutable,          default: \u0000
    */
    Boolean blnOt;
    Byte BtOt;
    Short shrtOt;
    Character chrctrOt;
    Integer intgrOt;
    Long lngOt;
    Float fltOt;
    Double dblOt;
    String strngOt;

    // Ссылочный тип
    Obj o = new Obj();
    Test nt = new Test();

    private void doStuff(Obj obj0, Obj obj1) {
        System.out.println("obj0 " + obj0);
        System.out.println("obj1 " + obj1);

        obj0.i = 8;
        obj0 = obj1;
        obj0.i = 2000;
        obj1.i = 5000;
        System.out.println("obj0 " + obj0);
        System.out.println("obj1 " + obj1);


    }


    public static void main(String[] args) {

        ObjectTypes currentObject = new ObjectTypes();

        Obj obj0 = new Obj();
        Obj obj1 = new Obj();
        obj0.i = 10;
        obj1.i = 15;
        System.out.println("BobjB " + obj1);
        System.out.println("BobjB " + obj0);
        System.out.println("BobjB " + obj0.i);

        // Значение по ссылке/Java передает все по значению.
        // obj0 = obj1;

        currentObject.doStuff(obj0, obj1);
        System.out.println("BobjB " + obj1);
        System.out.println("BobjB " + obj0);
        System.out.println("BobjB " + obj0.i);
        System.out.println("BobjB " + obj1.i);
    }
}
