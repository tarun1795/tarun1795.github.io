package servletAssignment1and2;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		try
		{
			DatabaseConnection connection = DatabaseConnection.getConnection();
			String sql = "INSERT INTO servlet_streams_exercises VALUES(?,?,?);";
			PreparedStatement stmt = connection.getCon().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.executeUpdate();
			req.getRequestDispatcher("/nextServlet").forward(req, resp);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		try
		{
			DatabaseConnection connection = DatabaseConnection.getConnection();
			String sql = "INSERT INTO servlet_streams_exercises VALUES(?,?,?);";
			PreparedStatement stmt = connection.getCon().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.executeUpdate();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
