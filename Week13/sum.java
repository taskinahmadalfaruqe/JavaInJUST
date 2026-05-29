public class Sum extends Frame{
    public Sum(){

    }
}
public static void main(String[] args) {
    Sum s = new Sum();
    s.setSize(400,400);
    s.setLayout(new FlowLayout(FlowLayout.CENTER));
    textField t1 = new textField(10);
    s.add(t1);
    Label l1 = new Label("+");
    s.add(l1);
    textField t2 = new textField(10);
    s.add(t2);
    Button b1 = new Button("=");
    s.add(b1);
    textField t3 = new textField(10);
    s.add(t3);
    s.setVisible(true);
}
public static int add(int a, int b){
    return a+b;
}