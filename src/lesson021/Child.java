package lesson021;

/*
 * Output:
 * Static PreParent block
 * Static Parent block
 * Static Child block
 * Init PreParent block
 * Constructor PreParent
 * Init Parent block
 * Constructor Parent
 * Init Child block
 * Init Child block1
 * Init Child block2
 * Constructor Child
 */
class PreParent {
    static {
        System.out.println("Static PreParent block");
    }

    {
        System.out.println("Init PreParent block");
    }

    PreParent() {
        System.out.println("Constructor PreParent");
    }
}

class Parent extends PreParent {
    static {
        System.out.println("Static Parent block");
    }

    {
        System.out.println("Init Parent block");
    }

    Parent() {
        System.out.println("Constructor Parent");
    }
}

public class Child extends Parent {

    static {
        System.out.println("Static Child block");
    }

    {
        //3 run
        System.out.println("Init Child block");
    }

    {
        //3 run
        System.out.println("Init Child block1");
    }

    {
        //3 run
        System.out.println("Init Child block2");
    }

    Child() {
        // 2 run
        super();
        //4 run
        System.out.println("Constructor Child");
    }
}
