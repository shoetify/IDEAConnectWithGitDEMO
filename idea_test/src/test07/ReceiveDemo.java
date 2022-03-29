package test07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(10086);
        byte[] byt = new byte[1024];
        DatagramPacket dp = new DatagramPacket(byt, 1024);
        String s = null;

        while (true) {
            ds.receive(dp);
            byt = dp.getData();
            int len = dp.getLength();
            s = new String(byt,0,len);
            System.out.println(s);
            if (s.equals("886")) {
                break;
            }
        }

        System.out.println("数据接收已完成！");
        ds.close();

    }
}
