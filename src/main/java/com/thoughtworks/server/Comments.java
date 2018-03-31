package com.thoughtworks.server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Comments extends HttpServlet{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String pwdPath = System.getProperty("user.dir");
    String filePath = pwdPath + "/src/main/webapp/comments.jsp";
    resp.setHeader("Content-Type","text/html");
    resp.getWriter().write(String.valueOf(Files.readAllLines(Paths.get(filePath))));
  }
}
