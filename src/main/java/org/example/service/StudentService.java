package org.example.service;

import com.github.pagehelper.PageInfo;
import org.example.domain.Administrator;
import org.example.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();
    Student selectSomeBody(int id);
    int add(Student student);
    int delete(int id);
    int update(Student student);
    Administrator admiLogin(String root,String password);
    Student StuLogin(Integer sid,String sname,String password);
    List<Student> selectDepart(String dname);
    PageInfo splitPage(int pageNum,int pageSize);
    int delAll(String[] list);
    PageInfo<Student> selectCondition(int pageNum,int pageSize,Student student);
}
