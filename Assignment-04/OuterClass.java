class Outer {

    class Inner {
        void display() {
            System.out.println("Method of Inner Class");
        }
    }
}

class ChildInner extends Outer.Inner {

    ChildInner(Outer obj) {
        obj.super();
    }

    void show() {
        System.out.println("Method of ChildInner Class");
    }
}

public class OuterClass {
    public static void main(String[] args) {

        Outer obj = new Outer();

        ChildInner child = new ChildInner(obj);

        child.display();
        child.show();
    }
}