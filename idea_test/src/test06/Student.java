package test06;

public class Student {
    private String name;
    private int chineseMark;
    private int mathsMark;

    public Student() {
    }

    public Student(String name, int chineseMark, int mathsMark) {
        this.name = name;
        this.chineseMark = chineseMark;
        this.mathsMark = mathsMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseMark() {
        return chineseMark;
    }

    public void setChineseMark(int chineseMark) {
        this.chineseMark = chineseMark;
    }

    public int getMathsMark() {
        return mathsMark;
    }

    public void setMathsMark(int mathsMark) {
        this.mathsMark = mathsMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseMark=" + chineseMark +
                ", mathsMark=" + mathsMark +
                '}';
    }
}
