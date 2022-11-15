package Practical_18;

import java.sql.*;

public class RetriveDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String
                    url="jdbc:mysql://localhost:3306/practical";
            Connection con = DriverManager.getConnection(url,"root","system");
            Statement st = con.createStatement();
            String show ="select * from emp";

            ResultSet rs = st.executeQuery(show);
            while (rs.next()){
                System.out.println("ID :"+rs.getInt(1));
                System.out.println("Name :"+rs.getString(2));
                System.out.println("Salary :"+rs.getInt(3));
            }
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
