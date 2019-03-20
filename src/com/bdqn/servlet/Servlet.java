package com.bdqn.servlet;

import com.bdqn.pojo.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            this.doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out=response.getWriter();
        List<User> userList=new ArrayList<User>();
        User user=new User();
        user.setUname("李超");
        user.setUpwd("123");
        User user2=new User();
        user2.setUname("张鸿翱");
        user2.setUpwd("321");
        userList.add(user);
        userList.add(user2);
        StringBuffer stringBuffer=new StringBuffer("[");
      for(int i=0;i<userList.size();i++){
          stringBuffer.append("{name:\""+userList.get(i).getUname()+"\"pwd:\""+userList.get(i).getUpwd()+"\"}");
          if(i>userList.size() || i==userList.size()){
              stringBuffer.append("]");
          }else{
              stringBuffer.append(",{name:\""+userList.get(i).getUname()+"\"pwd:\""+userList.get(i).getUpwd()+"\"}");
          }
      }
      out.print(stringBuffer);
    }
}
