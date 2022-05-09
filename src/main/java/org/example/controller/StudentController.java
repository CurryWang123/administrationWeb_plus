package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.example.domain.Administrator;
import org.example.domain.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
//笔记：
//@ResponseBody不能和String返回值一起用,通常和ajax一起用,将返回值直接写入响应体中，不通过视图解析器

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    public static final int pageSize=5;

    //    登录
    @RequestMapping(value = "/login.do")
    public ModelAndView login(Integer sid,String root, String password, String user,HttpSession session) {
        ModelAndView model = new ModelAndView();
        String loginInfo = "";
        int flag=0;
        session.setAttribute("usertype", user);
        if (root != null && password != null) {
              if (user.equals("管理员"))
              {
                  Administrator adm = studentService.admiLogin(root, password);
                  if (adm!=null)
                  {
                      loginInfo="登录成功";
                      flag=1;
                      session.setAttribute("flag",flag);
                      session.setAttribute("username",adm.getRoot());
                      session.setAttribute("user",adm);
                      session.setAttribute("loginInfo",loginInfo);
                      model.setViewName("forward:/index.jsp");
                  }
                  else {
                      loginInfo="登录失败";
                      flag=0;
                      session.setAttribute("flag",flag);
                      model.setViewName("forward:/login.jsp");
                      session.setAttribute("loginInfo",loginInfo);
                  }
              }
              else
              {
                  Student student=studentService.StuLogin(sid,root,password);
                  if (student!=null)
                  {
                      loginInfo="登录成功";
                      session.setAttribute("loginInfo",loginInfo);
                      session.setAttribute("username",root);
                      session.setAttribute("user",student);
                      session.setAttribute("sid",sid);
                      model.setViewName("forward:/studentView.jsp");
                  }
                  else {
                      loginInfo="登录失败";
                      model.setViewName("forward:/login.jsp");
                      session.setAttribute("loginInfo",loginInfo);
                  }

              }
        }
        return model;
    }

//    退出登录
    @RequestMapping("/loginout.do")
    public ModelAndView loginout(HttpSession session)
    {
        ModelAndView modelAndView=new ModelAndView();
         session.invalidate();
         modelAndView.setViewName("forward:/login.jsp");
         return modelAndView;
    }
    //    分页
    @RequestMapping(value = "/selectStudent.do")
    public ModelAndView splitPage(HttpSession session)
    {
        ModelAndView view=new ModelAndView();
        PageInfo pageInfo=studentService.splitPage(1,pageSize);
        session.setAttribute("students",pageInfo);
        view.setViewName("splitPage");
        return view;
    }
//    分页
    @ResponseBody
    @RequestMapping("ajaxSplit")
    public void ajaxSplit(int pageNum,HttpSession session,Student student)
    {
        PageInfo pageInfo=studentService.selectCondition(pageNum,pageSize,student);
        session.setAttribute("students",pageInfo);
    }
//    修改学生
    @RequestMapping(value = "/updateStudent.do")
    public String  updateStudent(Student student,HttpSession session) {
        int i=studentService.update(student);
        if (i>0)
        {
           session.setAttribute("msg","修改成功");
        }
        else
        {
            session.setAttribute("msg","修改失败");
        }
        return "forward:/student/selectStudent.do";
    }
//    查询某个学生的个人信息
    @RequestMapping(value = "/selectStudentInfo.do")
    @ResponseBody
    public Student selectSomeBody(Integer sid, HttpSession session,HttpServletResponse response) throws IOException {
        Student student=null;
        student=studentService. selectSomeBody(sid);
        return student;
    }
//    查看学生详细信息
    @RequestMapping(value = "/selectDetail.do")
    public ModelAndView selectDetail(Integer sid,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        Student student=studentService.selectSomeBody(sid);
        session.setAttribute("studentInfo",student);
        model.setViewName("updateStudent");
        return model;
    }

//    添加学生
    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student,HttpSession session)
    {
       ModelAndView model=new ModelAndView();
       int num=0;
       num=studentService.add(student);
       if (num!=0)
       {
           session.setAttribute("msg","添加学生成功");
       }else
       {
           session.setAttribute("msg","添加学生失败");
       }
       model.setViewName("forward:/student/selectStudent.do");
       return model;
    }
//    查看某部门的全部成员
    @RequestMapping("/select_dname.do")
    public ModelAndView select_dname(String dname,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        List<Student> list_dname=studentService.selectDepart(dname);
        session.setAttribute("list_dname",list_dname);
        model.addObject("dname",dname);
        model.setViewName("list_dname");
        return model;
    }
//注册
    @RequestMapping("/register")
    public String register(HttpServletRequest request,Student student)
    {
        int num=0;
        num=studentService.add(student);
        if (num>0)
        {
            request.setAttribute("msg","注册成功");
        }
        else
        {
            request.setAttribute("msg","注册失败");
        }
        return "forward:/register.jsp";
    }

    //    删除学生
    @RequestMapping(value = "/deleteStudent.do")
    public String deleteStudent(Integer sid,HttpServletRequest request)
    {
        int i=studentService.delete(sid);
        if (i>0)
        {
           request.setAttribute("msg","删除成功");
        }
        return "forward:/student/ajaxDel.do";
    }
    //删除学生后进行的ajax
    @ResponseBody
    @RequestMapping(value = "/ajaxDel",produces = "text/html;charset=UTF-8")
    public Object ajaxDel(HttpSession session,HttpServletRequest request)
    {
        PageInfo pageInfo=studentService.splitPage(1,pageSize);
        session.setAttribute("students",pageInfo);
        return request.getAttribute("msg");
    }
//    批量删除
    @RequestMapping("/delAll")
    public String delAll(String sids,HttpServletRequest request)
    {
        String[] list=sids.split(",");
        int num=studentService.delAll(list);
        if (num>0)
        {
            request.setAttribute("msg","批量删除成功");
        }else
        {
            request.setAttribute("msg","批量删除失败");
        }
        return "forward:/student/ajaxDel.do";
    }
//    取消
    @RequestMapping("/cancel")
    public String Cancel(HttpSession session)
    {
        session.invalidate();
        return "forward:/student/selectStudent.do";
    }
}
