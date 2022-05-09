package org.example.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.StudentDao;
import org.example.domain.Administrator;
import org.example.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAllStudent();
    }

    @Override
    public Student selectSomeBody(int id) {
        return studentDao.selectSomeBody(id);
    }

    @Override
    public int add(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public int delete(int id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public int update(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public Administrator admiLogin(String root, String password) {
        return studentDao.admiLogin(root,password);
    }

    @Override
    public List<Student> selectDepart(String dname) {
        return studentDao.selectDepart(dname);
    }

    @Override
    public Student StuLogin(Integer sid,String sname, String password) {
        return studentDao.stuLogin(sid,sname,password);
    }

    @Override
    public PageInfo splitPage(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Student> list=studentDao.selectByID();
        PageInfo<Student> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int delAll(String[] list) {
        return studentDao.delAll(list);
    }

    @Override
    public PageInfo<Student> selectCondition(int pageNum,int pageSize,Student student) {
        PageHelper.startPage(pageNum,pageSize);
        List<Student> list=studentDao.selectCondition(student);
        PageInfo<Student> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
}
