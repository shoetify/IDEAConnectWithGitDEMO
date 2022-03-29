package test02;

public class Student {
    private int age;
    private String name;
    
    public Student() {};
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void show() {
        System.out.println(name + " , " + age);
    }
}
