package lesson037.fors;

public class Cls {
    Cls(){
        System.out.println("New Instance" + this.getClass());
    }

    Cls(int i){
        System.out.println("New Instance with param " + i + this.getClass());
    }
}
