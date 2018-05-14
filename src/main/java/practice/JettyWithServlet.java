package main.java.practice;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class JettyWithServlet extends HttpServlet {
	private static final long serialVersionUID = -5946662321501173508L;

	public static void main(String[] args) throws Exception {
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(JettyWithServlet.class, "/servlet");
		
		Server server = new Server(12345);
		server.setHandler(handler);
		server.start();
		server.join();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().println(request);
		response.getWriter().println("Jetty with Servlet.");
	}

}
