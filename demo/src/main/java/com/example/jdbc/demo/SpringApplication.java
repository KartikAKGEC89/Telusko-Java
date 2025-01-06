package com.example.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpringApplication {

    // Connection to the database

    public static void main(String[] args) {
        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         */

        String url = "jdbc:mysql://localhost:3307/application";
        String uname = "root";
        String pass = "root";
        try {
            System.out.println("Connection established");
            Connection con = DriverManager.getConnection(url, uname, pass);
            System.out.println("Connected to the database successfully.");
        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }

        // String sql = "select sname from student where sid=1";

        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         * 
         * 
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";
        String sql = "select sname from student where sid=1";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString("sname");
        System.out.println("Name of a student is " + name);
        con.close();
        System.out.println("Connection closed");

        // String sql = "select * from student";

        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         * 
         * 
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";
        String sql = "select * from student";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }

        // rs.next();
        // String name = rs.getString("sname");
        // System.out.println("Name of a student is " + name);
        con.close();
        System.out.println("Connection closed");

        // Delete a record from the database

        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         * 
         * 
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";
        // String sql = "insert into student values (5, 'John', 48)";
        // String sql = "update student set sname = 'Max' where sid = 5";
        String sql = "delete from student where sid = 5";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        Statement st = con.createStatement();
        st.execute(sql);

        con.close();
        System.out.println("Connection closed");

        // Problem with statements
        // 1. SQL Injection
        // 2. Buffer Overflow

        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         * 
         * 
         */

        int sid = 101;
        String sname = "Max";
        int marks = 48;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";

        String sql = "insert into student values (" + sid + ",'" + sname + "'," + marks + ")";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        Statement st = con.createStatement();
        st.execute(sql);

        con.close();
        System.out.println("Connection closed");

        // Prepared Statements
        // 1. Better Performance
        // 2. SQL Injection Protection
        // 3. Buffer Overflow Protection

        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         * 
         * 
         */

        int sid = 102;
        String sname = "Jasmine";
        int marks = 52;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";

        String sql = "insert into student values (?,?,?)";

        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();

        con.close();

    }
}