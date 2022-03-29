package test08;

public class FlyableDemo {
    public static void main(String[] args) {

        useFlyalbe((String s) -> {
            System.out.println(s);
            System.out.println("你好");
        });

    }

    public static void useFlyalbe(Flyable f) {
        f.fly("风和日丽");
    }
}
