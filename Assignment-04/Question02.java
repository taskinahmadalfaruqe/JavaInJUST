class Outer {

    static class StaticNested {

        void display() {
            System.out.println("Method of StaticNested Class");
        }
    }
}

class ChildStatic extends Outer.StaticNested {

    void show() {
        System.out.println("Method of ChildStatic Class");
    }
}

public class Question02 {

    public static void main(String[] args) {

        ChildStatic obj = new ChildStatic();

        obj.display();
        obj.show();
    }
}