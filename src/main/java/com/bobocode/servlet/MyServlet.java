package com.bobocode.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Init servlet config");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body align=\"center\">");
        out.println("<img src=\"https://raw.githubusercontent.com/bobocode-projects/resources/2a3cf642ed8e5d2cc48c6d0dd9dfcdf220cb377c/image/logo_white.svg\" " +
                "alt=\"Bobocode\" width=\"500\">");
        out.println("<h1>" + "Good job! This page is a response of <code>WelcomeServlet</code> object." + "</h1>");
        out.println("<h2>" + "You should create your own class <code>DateServlet</code> which returns " +
                "current date as a response on <code>/date</code> path.<br> Use <code>LocalDate.now()</code> " +
                "to get current date." + "</h2>");
        out.println("</body></html>");





    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
