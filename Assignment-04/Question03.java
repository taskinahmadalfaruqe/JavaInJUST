class Outer {

    class ParentInner {

        void display() {
            System.out.println("Method of ParentInner");
        }
    }

    class ChildInner extends ParentInner {

        void show() {
            System.out.println("Method of ChildInner");
        }
    }
}

public class Question03 {

    public static void main(String[] args) {

        Outer obj = new Outer();

        Outer.ChildInner child = obj.new ChildInner();

        child.display();
        child.show();
    }
}