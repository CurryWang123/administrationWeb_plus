package org.example.controller;

import org.example.domain.Competition;
import org.example.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/competition")
public class CompetitionController {
    @Autowired
    private CompetitionService competitionService;
//    查看所有评优
    @RequestMapping("/selectAllCompetition.do")
    public ModelAndView selectAllCompetition(HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        List<Competition> listCompetition=competitionService.select();
        session.setAttribute("listCompetition",listCompetition);
        model.setViewName("forward:/competition/selectAllCompetition.jsp");
        return model;
    }
//    查看某个评优
    @RequestMapping("/selectOneCompetition.do")
    public ModelAndView selectOneCompetition(Integer cid,HttpSession session)
    {
        ModelAndView model=new ModelAndView();
        Competition competition=competitionService.selectOneCompetition(cid);
        session.setAttribute("competition",competition);
        model.setViewName("forward:/competition/updateCompetition.jsp");
        return model;
    }
//    修改评优
    @RequestMapping("/updateCompetition.do")
    public void updateCompetition(Competition competition, HttpServletResponse response) throws IOException {
        int i=competitionService.updateCompetition(competition);
        if (i>0)
        {
            PrintWriter out=response.getWriter();
            out.print("修改成功");
            out.flush();
            out.close();
        }
    }
//    删除评优
    @RequestMapping("deleteCompetition.do")
    public void deleteCompetition(Integer cid, HttpServletResponse response) throws IOException {
        int i=competitionService.deleteCompetition(cid);
        if (i>0)
        {
            PrintWriter out=response.getWriter();
            out.print("删除成功");
            out.flush();
            out.close();
        }
    }
//    添加评优
    @RequestMapping("/addCompetition.do")
    public void addCompetition(Competition competition,HttpServletResponse response) throws IOException {
        int i=competitionService.addCompetition(competition);
        if (i>0)
        {
            PrintWriter out=response.getWriter();
            out.print("添加成功");
            out.flush();
            out.close();
        }
    }
//    按名字查看评优
    @RequestMapping("/selectByName.do")
    public ModelAndView selectByName(String sname)
    {
        ModelAndView model=new ModelAndView();
        Competition competition=competitionService.selectOneByName(sname);
        if (competition!=null)
        {
            model.addObject("competition",competition);
            model.setViewName("forward:/competition/selectOneByName.jsp");
        }
        else
        {
            model.setViewName("forward:/competition/noCompetition.html");
        }
        return model;
    }

}
