package Practical_20;

import java.sql.*;
import java.util.*;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/practical";
            Connection con = DriverManager.getConnection(url,"root","system");

            Scanner sc= new Scanner(System.in);
            Scanner sc1= new Scanner(System.in);

            System.out.print("Enter Employee ID to Update Record:");
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
            String update ="update emp set ID=?, Name=?, Salary=? where ID = "+ID;
            PreparedStatement ps = con.prepareStatement(update);
            System.out.println("Enter ID:");
            ID= sc.nextInt();
            System.out.println("Enter Name:");
            String name = sc1.nextLine();
            System.out.println("Enter Salary");
            int salary = sc.nextInt();
            ps.setInt(1,ID);
            ps.setString(2,name);
            ps.setInt(3,salary);
            ps.executeUpdate();
            System.out.println("Updated ....");

        con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
