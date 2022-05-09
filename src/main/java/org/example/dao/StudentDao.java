package org.example.dao;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.example.domain.Administrator;
import org.example.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAllStudent();
    Student selectSomeBody(@Param("id") int id);
    int deleteStudent(@Param("id") int id);
    int addStudent(Student student);
    int updateStudent(Student student);
    Administrator admiLogin(@Param("root")String root,@Param("password")String password);
    Student stuLogin(@Param("sid") Integer sid,@Param("sname") String sname,@Param("password")String password);
    List<Student> selectDepart(@Param("dname") String dname);
    List<Student> selectByID();
    int delAll(String[] list);
    List<Student> selectCondition(Student student);
}
