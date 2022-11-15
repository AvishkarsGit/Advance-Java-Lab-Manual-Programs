package Practical_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/practical";
            Connection con = DriverManager.getConnection(url,"root","system");

            Scanner sc= new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);

            String sql="insert into emp (ID,Name,Salary) values (?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1,102);
            pstm.setString(2,"Atharva");
            pstm.setInt(3,1000);
            pstm.executeUpdate();

            System.out.println("Inserted..");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
