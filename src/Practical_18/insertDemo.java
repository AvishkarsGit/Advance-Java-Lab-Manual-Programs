package Practical_18;

import java.sql.*;
import java.util.*;

public class insertDemo {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/practical";
            Connection con = DriverManager.getConnection(url,"root","system");

            Scanner sc= new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);

            String sql="insert into emp (ID,Name,Salary) values (?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            System.out.println("Enter ID:");
            int id=sc1.nextInt();
            System.out.println("Enter Name:");
            String name=sc.nextLine();
            System.out.println("Enter Salary:");
            int salary = sc1.nextInt();

            pstm.setInt(1,id);
            pstm.setString(2,name);
            pstm.setInt(3,salary);
            pstm.executeUpdate();

            System.out.println("Inserted..");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
