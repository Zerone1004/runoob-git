package com.javaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class JDBCDemo {

    public static void main(String[] args) throws Exception {

        //1.注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2.获取链接
        String url = "jdbc:mysql://47.96.115.13:3306/kettle";
        String user = "root";
        String password = "123mysql";
        Connection conn = DriverManager.getConnection(url, user, password);

        //3.定义语句
        String sql = "update stu1 set age= 23 where id = 1001";

        //4.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();

        //5.执行sql
        int count = stmt.executeUpdate(sql);//受影响的行数

        //6.处理结果
        System.out.println(count);

        //7.释放资源
        stmt.close();
        conn.close();

    }
}
