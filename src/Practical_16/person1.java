package Practical_16;
import java.io.*;
import java.net.*;
import java.util.*;
public class person1 {
    public static void main(String[] args) throws IOException {
        Socket p1= new Socket("localhost",8085);
        Scanner sc = new Scanner(System.in);
        DataInputStream din = new DataInputStream(p1.getInputStream());
        DataOutputStream dout = new DataOutputStream(p1.getOutputStream());
        String str="";
        while (!str.equals("buy")){
            str=sc.next();
            dout.writeUTF(str);
            str=din.readUTF();
            System.out.println(str);
        }
        p1.close();
    }
}