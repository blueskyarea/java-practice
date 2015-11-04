package practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class FirstJetty extends AbstractHandler {
	
	public static void main(String args[]) throws Exception {
		Server server = new Server(12345);
		server.setHandler(new FirstJetty());
		server.start();
		server.join();
	}

	@Override
	public void handle(String targetUri, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		response.getWriter().println("<h1>First Jetty</h1>");
		response.getWriter().println("Target URI is" + targetUri);
	}
	
}
