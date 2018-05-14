package main.java.practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class JettyGetAjaxResponse extends AbstractHandler {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8081);
		
		ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(true);
		resourceHandler.setWelcomeFiles(new String[] { "welcome.html" });
		resourceHandler.setResourceBase(".");
		
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { resourceHandler, new JettyGetAjaxResponse() });
		
		server.setHandler(handlers);
	    server.start();
	    server.join();
	}

	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("<h1>GET Ajax Response using jetty</h1>\n");
	    response.getWriter().write("<p>" + id + "</p>");
	    response.flushBuffer();
	    baseRequest.setHandled(true);
	}

}
