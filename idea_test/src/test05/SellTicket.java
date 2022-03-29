package test05;

public class SellTicket implements Runnable{
    private int tickets = 100;

    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第 " + tickets + "张票");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                }
            }
        }
    }
}
