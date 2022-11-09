package Practical_17;

import java.io.IOException;
import java.net.*;

public class DatagramsocketDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte data[]="Welcome to world of Networking".getBytes();
        int len=data.length;
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(data,len,addr,8181);
        ds.send(dp);
        ds.close();
    }
}
