package Practical_15;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class URLConnectionDemo {
    public static void main(String[] args) throws IOException {
        URL ui = new URL("https://www.udemy.com/");
        URLConnection u2 = ui.openConnection();
        System.out.println("Date:"+new Date(u2.getDate()));
        System.out.println("Type of Content:"+u2.getContentType());
        System.out.println("Length of Content:"+u2.getContentLength());
        System.out.println("Date of Expiration :"+new Date(u2.getExpiration()));
        System.out.println("Last Modified:"+new Date(u2.getLastModified()));

    }
}
