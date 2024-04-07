package com.javaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class JDBCDemo_Connection {

    public static void main(String[] args) throws Exception {

        //1.注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2.获取链接
        String url = "jdbc:mysql://47.96.115.13:3306/kettle";
        String user = "root";
        String password = "123mysql";
        Connection conn = DriverManager.getConnection(url, user, password);

        //3.定义语句
        String sql1 = "update stu1 set age= 25 where id = 1001";
        String sql2 = "update stu1 set age= 25 where id = 1002";

        //4.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();

        try {

            //开启事务
            conn.setAutoCommit(false);

            //5.执行sql
            int count1 = stmt.executeUpdate(sql1);//受影响的行数

            //6.处理结果
            System.out.println(count1);

            //5.执行sql
            int count2 = stmt.executeUpdate(sql2);//受影响的行数

            //6.处理结果
            System.out.println(count2);

            //提交事务
            conn.commit();
        } catch (SQLException e) {
            //事务回滚
            conn.rollback();
            throw new RuntimeException(e);
        }

        //7.释放资源
        stmt.close();
        conn.close();

    }
}
