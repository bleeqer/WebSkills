package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/wae")
public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Hello World");
	}
	
}
