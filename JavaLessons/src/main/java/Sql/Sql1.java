package Sql;

import java.sql.*;

public class Sql1 {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(" jdbc:mysql://localhost:3306/students", "root", "400205");
        String sql = "Select * from studenttable";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        System.out.println(resultSet.getString(1));
    }
}
