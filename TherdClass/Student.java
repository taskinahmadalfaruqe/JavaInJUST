// Student class in Java
public class Student {

    String name = "Taskin Ahmad Al Faruqe";
    int age = 20;
    String grade = "A";
    String school = "Jiangsu University of Science and Technology";
    String major = "Computer Science and Technology";
    String studentID = "2020210101001";
    String address = "Room: 231, Dormitory 12";

    public void getName() {
        System.out.println("Name: " + name);
    }

    public void getAge() {
        System.out.println("Age: " + age);
    }

    public void getGrade() {
        System.out.println("Grade: " + grade);
    }

    public void getSchool() {
        System.out.println("School: " + school);
    }

    public void getMajor() {
        System.out.println("Major: " + major);
    }

    public void getStudentID() {
        System.out.println("Student ID: " + studentID);
    }

    public void getAddress() {
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.getName();
        s.getAge();
        s.getGrade();
        s.getSchool();
        s.getMajor();
        s.getStudentID();
        s.getAddress();
    }
}