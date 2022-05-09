package org.example.controller;

import com.github.pagehelper.PageInfo;
import org.example.domain.Work;
import org.example.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping(value = "/work")
public class WorkController {
   @Autowired
    WorkService workService;
//    添加工作
    @RequestMapping(value = "/addWork.do")
    public ModelAndView addWork(Work work, HttpSession session)
    {
        ModelAndView modelAndView=new ModelAndView();
        int i=workService.addWork(work);
        if (i>0)
        {
           session.setAttribute("msg","添加工作成功");
           modelAndView.setViewName("forward:/work/selectWork.do");
        }
return modelAndView;
    }
//    分页查询所有工作
    @RequestMapping(value = "/selectWork.do")
    public ModelAndView selectWork(HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        PageInfo pageInfo=workService.splitPage(1,5);
        session.setAttribute("workList",pageInfo);
        model.setViewName("forward:/work/selectWork.jsp");
        return model;
    }
//    分页相应ajax
    @ResponseBody
    @RequestMapping("ajaxSplit")
    public void ajaxSplit(HttpSession session,int pageNum)
    {
        PageInfo pageInfo=workService.splitPage(pageNum,5);
        session.setAttribute("workList",pageInfo);
    }
//    查询某一个工作的详细信息
    @RequestMapping(value = "/selectOneWork.do")
    public ModelAndView selectOneWork(Integer wid,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        Work work=workService.selectOneWork(wid);
        session.setAttribute("work",work);
        model.setViewName("forward:/updateWork.jsp");
        return model;
    }
//    更新工作
    @RequestMapping(value = "/updateWork.do")
    public ModelAndView updateWork(Work work,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        int i=workService.updateWork(work);
        if (i>0)
        {
            session.setAttribute("msg","更新工作计划成功");
            model.setViewName("forward:/work/selectWork.do");
        }
        return model;
    }
//    删除工作
    @RequestMapping(value = "deleteWork.do")
    public String deleteWork(Integer wid,HttpServletRequest request)
    {
        ModelAndView model=new ModelAndView();
        int i=workService.deleteWork(wid);
        if (i>0)
        {
           request.setAttribute("msg","删除工作成功");
        }
        return "forward:/work/ajaxDel.do";
    }
    //删除工作后进行的ajax
    @ResponseBody
    @RequestMapping(value = "/ajaxDel",produces = "text/html;charset=UTF-8")
    public Object ajaxDel(HttpSession session, HttpServletRequest request)
    {
        PageInfo pageInfo=workService.splitPage(1,5);
        session.setAttribute("workList",pageInfo);
        return request.getAttribute("msg");
    }
//    查询待审批工作
    @RequestMapping("/selectApproval.do")
    public ModelAndView selectApproval(HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        List<Work> listAppro=workService.selectApproval();
        session.setAttribute("listAppro",listAppro);
        model.setViewName("forward:/work/selectApproval.jsp");
        return model;
    }
//    更新工作状态
    @RequestMapping("/updateStatus.do")
    public String updateStatus(HttpServletRequest request,Integer wid){
        int i=workService.updateStatus(wid);
        if (i>0)
        {
            request.setAttribute("msg","审核成功");
        }
        return "forward:/work/selectApproval.do";
    }
    //    取消
    @RequestMapping("/cancel")
    public String Cancel(HttpSession session)
    {
        session.invalidate();
        return "forward:/work/selectWork.do";
    }
}
