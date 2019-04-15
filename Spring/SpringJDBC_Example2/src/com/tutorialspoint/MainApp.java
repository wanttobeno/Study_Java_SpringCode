package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainApp {
    public static  void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DBParaConstructor.xml");
        DBParaConstructor dbParaConstructor = (DBParaConstructor)context.getBean("DBParaConstructor");
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // 连接已经存在的数据库，如：mysql
            Connection connection = DriverManager.getConnection(dbParaConstructor.sqlServerUrl,
                    dbParaConstructor.sqlServerUserName, dbParaConstructor.sqlServerPassword);
            Statement statement = connection.createStatement();

            // 创建数据库
            String dbName = "Test";
            boolean bRet = statement.execute("drop database " + dbName);
            int count = statement.executeUpdate("create database if not exists `" + dbName + "` default character set utf8");
            System.out.println("影响了"+count+"行！");

            statement.execute("use " + dbName);
            bRet = statement.execute("create table Student(ID INT NOT NULL AUTO_INCREMENT," +
                    "NAME VARCHAR(20) NOT NULL," +
                    "AGE INT NOT NULL," +
                    "PRIMARY KEY (ID))");

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
