package Practical_15;

import java.io.IOException;
import java.net.*;
public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL ui = new URL("https://www.udemy.com/");
        System.out.println("Protocol Name:"+ui.getProtocol());
        System.out.println("Port Number:"+ui.getPort());
        System.out.println("Host Name:"+ui.getHost());
        System.out.println("FIle name :"+ui.getFile());
    }
}
