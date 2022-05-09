package org.example.controller;

import org.example.domain.Depart;
import org.example.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/depart")
public class DepartController {
@Autowired
    DepartService departService;
//增加部门
@RequestMapping("/addDepart.do")
    public ModelAndView addDepart(Depart depart, HttpSession session)
{
    ModelAndView model=new ModelAndView();
    int i=departService.addDepart(depart);
    if (i>0)
    {
        session.setAttribute("addDepartInfo","添加部门成功");
        model.setViewName("forward:/depart/addDepartInfo.jsp");
    }
    return model;
}
//查询所有部门
    @RequestMapping("/selectDepart.do")
    public ModelAndView selectDepart(HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        List<Depart> departList=departService.selectDepart();
        session.setAttribute("departList",departList);
        model.setViewName("forward:/depart/selectDepart.jsp");
        return model;

    }
//    查询某一个部门
    @RequestMapping("/selectOneDepart.do")
    public ModelAndView selectOneDepart(Integer depid,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        Depart depart=departService.selectOneDepart(depid);
        session.setAttribute("depart",depart);
        model.setViewName("forward:/depart/selectOneDepart.jsp");
        return model;
    }
//    修改部门信息
    @RequestMapping("/updateDepart.do")
    public ModelAndView updateDepart(Depart depart,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        int i=departService.updateDepart(depart);
        if (i>0)
        {
            session.setAttribute("updateDepartInfo","修改部门信息成功");
            model.setViewName("forward:/depart/updateDepartInfo.jsp");
        }
        return model;
    }
//    删除
    @RequestMapping("/deleteDepart.do")
    public ModelAndView deleteDepart(Integer depid,HttpSession session)
    {
        ModelAndView modelAndView=new ModelAndView();
        int i=departService.deleteDepart(depid);
        if (i>0)
        {
            session.setAttribute("deleteDepartInfo","删除部门成功");
            modelAndView.setViewName("forward:/depart/deleteDepartInfo.jsp");
        }
        return modelAndView;
    }
}
