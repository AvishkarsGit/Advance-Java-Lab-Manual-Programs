package Practical_16;
import java.io.*;
import java.net.*;
import java.util.*;

public class person2 {
    public static void main(String[] args) throws IOException {
        ServerSocket p2 = new ServerSocket(8085);
        Socket p1 = p2.accept();
        Scanner sc = new Scanner(System.in);
        DataInputStream din = new DataInputStream(p1.getInputStream());
        DataOutputStream dout = new DataOutputStream(p1.getOutputStream());
        String str="";
        while (!str.equals("buy")){
            str=din.readUTF();
            System.out.println(str);
            str=sc.next();
            dout.writeUTF(str);
        }
        p2.close();
    }
}