package org.example.handler;

import org.example.domain.Administrator;
import org.example.domain.Student;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHandler implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        String url = request.getRequestURI();
        String path = url.substring(url.indexOf("/",1)+1);
//        打印出当前请求路径
        System.out.println("当前请求路径:"+path);
        if (user==null)
        {
            System.out.println("被拦截");
            response.sendRedirect("/administrationWeb/login.jsp");
            return false;
        }else
        {

            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
