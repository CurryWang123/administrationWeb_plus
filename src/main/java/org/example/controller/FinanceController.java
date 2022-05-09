package org.example.controller;

import org.example.dao.FinanceDao;
import org.example.domain.Finance;
import org.example.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/finance")
public class FinanceController {
    @Autowired
    private FinanceService financeService;
    //查看财务
    @RequestMapping("/select.do")
    public ModelAndView select(HttpSession session){
        ModelAndView model=new ModelAndView();
        List<Finance> listFinance=financeService.selectFinance();
        session.setAttribute("listFinance",listFinance);
        model.setViewName("forward:/finance/selectFinance.jsp");
        return model;
    }
    //查看某个财务
    @RequestMapping("/selectOneFinance.do")
    public ModelAndView selectOneFinance(Integer fid,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        Finance finance=financeService.selectOneFinance(fid);
        session.setAttribute("finance",finance);
        model.setViewName("forward:/finance/updateFinance.jsp");
        return model;
    }
//    更新财务
    @RequestMapping("/updateFinance.do")
    public void updateFinance(Finance finance, HttpServletResponse response) throws IOException {
        int i=financeService.updateFinance(finance);
        PrintWriter out=response.getWriter();
        if (i>0)
        {
            out.print("更新成功");
            out.flush();
            out.close();
        }
    }
//    删除财务
    @RequestMapping("/deleteFinance.do")
    public void deleteFinance(Integer fid,HttpServletResponse response) throws IOException {
       PrintWriter out= response.getWriter();
       int i=financeService.deleteFinance(fid);
       if (i>0)
       {
           out.print("删除财务成功");
           out.flush();
           out.close();
       }
    }
//    查看待审批财务
    @RequestMapping("/selectAppro.do")
    public ModelAndView selectAppro(HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        List<Finance> listApproFinance=financeService.selectAppro();
        if (listApproFinance.isEmpty())
        {
            model.setViewName("forward:/finance/noFinance.html");
        }else
        {
            session.setAttribute("listApproFinance",listApproFinance);
            model.setViewName("forward:/finance/selectAppro.jsp");
        }


        return model;
    }
//    更新财务状态
    @RequestMapping("/updateStatus.do")
    public void updateStatus(HttpServletResponse response,Integer fid) throws IOException {
        int i=financeService.updateStatus(fid);
        PrintWriter out=response.getWriter();
        if (i>0)
        {
            out.print("审核通过");
            out.flush();
            out.close();
        }
    }
//    添加财务
    @RequestMapping("/addFinance.do")
    public void addFinance(Finance finance,HttpServletResponse response) throws IOException {
        int i=financeService.addFinnance(finance);
        PrintWriter out=response.getWriter();
        if (i>0)
        {
            out.print("申请成功");
            out.flush();
            out.close();
        }
    }
}


