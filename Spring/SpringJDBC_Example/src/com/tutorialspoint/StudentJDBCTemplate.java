package com.tutorialspoint;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate
implements  StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);

        String sql ="CREATE TABLE Student(\n" +
                "   ID   INT NOT NULL AUTO_INCREMENT,\n" +
                "   NAME VARCHAR(20) NOT NULL,\n" +
                "   AGE  INT NOT NULL,\n" +
                "   PRIMARY KEY (ID)\n" +
                ");";
        jdbcTemplateObject.execute(sql);
    }

    public void create(String name,Integer age) {
        String SQL = "insert into Student(name,age) values(?,?)";
        jdbcTemplateObject.update(SQL,name,age);
        System.out.println("Created Recoed Name = "+ name + "Age = " + age);
        return;
    }

    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student students = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id},new StudentMapper());
        return  students;
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(SQL,new StudentMapper());
        return  students;
    }

    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL,id);
        System.out.println("Deleted Record with ID = " + id);
        return;
    }

    public void update(Integer id,Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL,age,id);
        System.out.println("Updated Record with ID = " + id);
    }
}
