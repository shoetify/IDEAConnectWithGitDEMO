package test02;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("Marine");
        s1.show();

        Student s2 = new Student("Halon",20);
        s2.show();
    }
}
