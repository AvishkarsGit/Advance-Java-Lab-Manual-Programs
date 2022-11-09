package Practical_14;

import java.net.*;

public class InetAddressDemo {
    public static void main(String[] args) throws  UnknownHostException{
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local Host Name:"+addr);
        //getByName
        addr=InetAddress.getByName("msbte.org.in");
        System.out.println("getByName Method:"+addr);
        //getAllByName
        InetAddress ar[] = InetAddress.getAllByName("www.facebook.com");
        for (int i = 0;i<ar.length;i++){
            System.out.println("Facebook IP:"+ar[i]);
        }
        //isMulticastAddress
        System.out.println("Is Multicast Address:"+addr.isMulticastAddress());

    }
}
