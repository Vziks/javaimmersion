package lesson004.data_types.primitive;

public class PrimitiveTypes {

    /*
        Java has 8(eight) primitive data types
           boolean:    1 bit,   true or false,                                             default: false
           byte:       8 bits,  from -128 to 127,                                          default: 0
           short:      16 bits, from -32768 to 32767,                                      default: 0
           int:        32 bits, from -2147483648 to 2147483647,                            default: 0
           long:       64 bits, from -9223372036854775808L to 9223372036854775807L,        default: 0L
           float:      32 bits, from -1.4e-45f to 3.4e+38f,                                default: 0.0
           double:     64 bits, from -4.9e-324 to 1.7e+308,                                default: 0.0D
           char:       16 bits, The char data type is a single 16-bit Unicode character,   default: \u0000
    */
    // Empty variable
    boolean bl;
    byte bt;
    short shrt;
    int nt;
    long lng;
    float flt;
    double dbl;
    char chr;

    // With value

    boolean blv = true;
    byte btv = 12;
    short shrtv = 3276;
    int ntv = 214743648;
    long lngv = 21474836472323L;
    float fltv = 5.99f;
    double dblv = 19.99d;
    char chrv = 'B';
    //! char chrvWrong = 'BB'; only 1 char.

    public static void main(String[] args) {

        System.out.println("run");

        PrimitiveTypes primitiveTypes = new PrimitiveTypes();

        /*
            Output:
            PrimitiveTypes.bl = false
            PrimitiveTypes.bt = 0
            PrimitiveTypes.shrt = 0
            PrimitiveTypes.nt = 0
            PrimitiveTypes.lng = 0
            PrimitiveTypes.dbl = 0.0
            PrimitiveTypes.flt = 0.0
            PrimitiveTypes.chr =  
         */
        System.out.println("PrimitiveTypes.bl = " + primitiveTypes.bl);
        System.out.println("PrimitiveTypes.bt = " + primitiveTypes.bt);
        System.out.println("PrimitiveTypes.shrt = " + primitiveTypes.shrt);
        System.out.println("PrimitiveTypes.nt = " + primitiveTypes.nt);
        System.out.println("PrimitiveTypes.lng = " + primitiveTypes.lng);
        System.out.println("PrimitiveTypes.dbl = " + primitiveTypes.dbl);
        System.out.println("PrimitiveTypes.flt = " + primitiveTypes.flt);
        System.out.println("PrimitiveTypes.chr = " + primitiveTypes.chr);

        /*
            Output:
            PrimitiveTypes.blv = true
            PrimitiveTypes.btv = 12
            PrimitiveTypes.shrtv = 3276
            PrimitiveTypes.ntv = 214743648
            PrimitiveTypes.lngv = 21474836472323
            PrimitiveTypes.dblv = 19.99
            PrimitiveTypes.fltv = 5.99
            PrimitiveTypes.chrv = B
         */
        System.out.println("PrimitiveTypes.blv = " + primitiveTypes.blv);
        System.out.println("PrimitiveTypes.btv = " + primitiveTypes.btv);
        System.out.println("PrimitiveTypes.shrtv = " + primitiveTypes.shrtv);
        System.out.println("PrimitiveTypes.ntv = " + primitiveTypes.ntv);
        System.out.println("PrimitiveTypes.lngv = " + primitiveTypes.lngv);
        System.out.println("PrimitiveTypes.dblv = " + primitiveTypes.dblv);
        System.out.println("PrimitiveTypes.fltv = " + primitiveTypes.fltv);
        System.out.println("PrimitiveTypes.chrv = " + primitiveTypes.chrv);
    }
}
