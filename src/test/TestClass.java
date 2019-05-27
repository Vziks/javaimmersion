package test;

class TestClass {
    private int i = 5;
    private int y;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class One extends TestClass {
    void someMethod() {
        int ii;
        int yy = 50;
//      System.out.println(ii); //Переменная не инициализирована, не принимает дефолтное значение
        System.out.println(yy); //Переменная инициализирована

//        В случае с обектами поведение другое

        TestClass testClass = new TestClass();
        System.out.println(testClass.getI()); //Переменная инициализирована
        System.out.println(testClass.getY()); //Переменная инициализирована присоздании объекта и значение ее 0(default)

    }
}

