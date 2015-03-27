package org.music.analysis.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.music.analysis.module.*;

public class JDBCExample extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 
	PrintWriter out = response.getWriter();
	out.println("<h4>"+"-------- MySQL JDBC Connection Testing ------------"+"</h4>");
 
	Connection connection = null;
	connection=new ConnDB().getConnection(); 

	if (connection != null) {
		out.println("<h4>"+"You made it, take control your database now!"+"</h4>");
	} else {
		out.println("<h4>"+"Failed to make connection!"+"</h4>");
	}
  }
}
