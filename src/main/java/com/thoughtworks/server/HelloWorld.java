package com.thoughtworks.server;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorld extends HttpServlet {
  String sharedString = "World";
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    ServletContext context=this.getServletContext();
    context.setAttribute("sharedString",sharedString);
    res.getWriter().write("Hello " + sharedString);
  }
}
