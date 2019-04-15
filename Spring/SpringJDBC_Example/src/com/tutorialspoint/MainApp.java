package com.tutorialspoint;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import com.sun.xml.ws.api.pipe.ServerTubeAssemblerContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;


// https://www.tutorialspoint.com/spring/spring_jdbc_example.htm


public class MainApp {
    public static  void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("------Records Creation------");
        studentJDBCTemplate.create("Zara",11);
        studentJDBCTemplate.create("Nuha",2);
        studentJDBCTemplate.create("Ayan",15);

        System.out.println("------Listing Multiple Records------");
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record: students) {
            System.out.print("ID :"+ record.getId());
            System.out.print(", Name :"+ record.getName());
            System.out.println(", Age :"+ record.getAge());
        }

        System.out.println("------Updating Record with ID = 2------");
        studentJDBCTemplate.update(2,20);;

        System.out.println("------Listing Record witd ID =2 ------");
        try {
            Student student = studentJDBCTemplate.getStudent(2);
            System.out.print("ID : "+ student.getId());
            System.out.print(", Name : "+ student.getName());
            System.out.println(", Age : "+ student.getAge());
        } catch (org.springframework.dao.EmptyResultDataAccessException e){
            System.out.println("Without Record witd ID =2 ");
        }

    }
}
