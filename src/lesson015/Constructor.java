package lesson015;

class Constructor {
    Constructor() {
        System.out.println("Default");
    }

    Constructor(int i) {
        System.out.println("Constructor with argument");
    }

    Constructor(int i, String strng) {
        this(i); // run constructor with 1 argument? only first in constructor
        System.out.println("Constructor with 2 argument");
    }

}



class Constructor01 {
    Constructor01(int i) {
        System.out.println("Constructor01 - With argument");
    }
    Constructor01() {
        System.out.println("Constructor01 - Default");
    }
}

class Constructor02 extends Constructor01{
    Constructor02(int i) {
        super(i);
        System.out.println("Constructor02 - With argument");
    }
    Constructor02() {
        System.out.println("Constructor02 - Default");
    }
}