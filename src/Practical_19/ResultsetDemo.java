package Practical_19;

import java.sql.*;

public class ResultsetDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/practical";
            Connection con = DriverManager.getConnection(url,"root","system");
            Statement st = con.createStatement();
            String show ="select * from emp";

            ResultSet rs = st.executeQuery(show);
            System.out.println("---------------------------------------------");
            System.out.printf("%-10s %-20s %-15s\n","ID","NAME","SALARY");
            System.out.println("----------------------------------------------");
            while (rs.next()){

                System.out.printf("%-10s %-20s %-15s\n",rs.getInt(1),rs.getString(2),rs.getInt(3));
            }
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
