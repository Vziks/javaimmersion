package lesson019;

class Parent {
    int method() throws Exception {
        return 1;
    }

    Parent method01() {
        return this;
    }
}


class Child01 extends Parent {
    @Override
    protected int method() throws RuntimeException {
        return 2;
    }
}

class Child02 extends Parent {
    @Override
    public int method() {
        return 2;
    }
}

class Child03 extends Parent {
    @Override
    int method() {
        return 2;
    }
}


class Child04 extends Parent {
    @Override
    Child04 method01() {
        return new Child04();
    }
}

class Child05 extends Parent {

    @Override
    Child01 method01() {
        return new Child01();
    }
}