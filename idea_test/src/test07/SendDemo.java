package test07;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] byt = new byte[1024];
        String s = null;
        Scanner sc = new Scanner(System.in);
        InetAddress address = InetAddress.getByName("LAPTOP-DLS82VV7");
        int port = 10086;

        while (s==null || !s.equals("886")) {
            s = sc.nextLine();
            byt = s.getBytes(StandardCharsets.UTF_8);
            DatagramPacket dp = new DatagramPacket(byt,byt.length,address,port);
            ds.send(dp);
        }

        System.out.println("数据发送结束");

        ds.close();

    }
}
