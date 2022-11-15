package Practical_20;

import java.sql.*;
import java.util.*;

public class deleteDemo {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/practical";
            Connection con = DriverManager.getConnection(url,"root","system");


            Scanner sc= new Scanner(System.in);
            Scanner sc1= new Scanner(System.in);

            System.out.print("Enter Employee ID to Dele1te Record:");
            int ID = sc.nextInt();

            String s="SELECT * FROM EMP WHERE ID = '"+ID+"'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(s);
            while(rs.next()) {
                ID = rs.getInt("ID");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                System.out.printf("%-10s %-20s %-15s\n ","ID","NAME","Salary");
                System.out.println("----------------------------------------------------------");
                System.out.printf("%-10d %-20s %-15s\n",rs.getInt(1),rs.getString(2),rs.getInt(3));
                System.out.println("----------------------------------------------------------");

            }
            String delete ="delete from emp where ID="+ID;
            PreparedStatement ps = con.prepareStatement(delete);
            ps.executeUpdate();
            System.out.println("Record Deleted ....");
            con.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
