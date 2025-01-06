class A {
    void methodA() {
        System.out.println("Method A from class A");
    }
}

interface B {
    void methodB();
}

interface C {
    void methodC();
}

class D1 extends A implements B, C {
    public void methodB() {
        System.out.println("Method B from interface B");
    }

    public void methodC() {
        System.out.println("Method C from interface C");
    }
}
