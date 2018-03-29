package com.thoughtworks.server;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ByeWorld extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    ServletContext context=this.getServletContext();
    String sharedString = (String) context.getAttribute("sharedString");
    resp.getWriter().write("Bye " + sharedString);
  }
}
