interface InterfaceA {
    default void show() {
        System.out.println("A");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("B");
    }
}

class ClassC implements InterfaceA, InterfaceB {

    public void show() {
        InterfaceA.super.show();
        System.out.println("C");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {

        ClassC obj = new ClassC();
        obj.show();
    }
}