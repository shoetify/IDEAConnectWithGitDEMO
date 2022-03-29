package test06;

import java.util.Comparator;
import java.util.TreeSet;

public class SortDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = o2.getChineseMark() - o1.getChineseMark();
                if (num1!=0) {
                    return num1;
                }
                else {
                    num1 = o2.getMathsMark() - o1.getMathsMark();
                    if (num1!=0) {
                        return num1;
                    }
                    else {
                        num1 = o2.getName().compareTo(o1.getName());
                        return num1;
                    }
                }
            }
        });

        Student s1 = new Student("Mark",90,80);
        Student s2 = new Student("Mark",96,88);
        Student s3 = new Student("Mark",95,80);
        Student s4 = new Student("Mark",99,80);
        Student s5 = new Student("Mark",96,86);
        Student s6 = new Student("Mark",96,88);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student i : ts) {
            System.out.println(i.toString());
        }

    }
}
