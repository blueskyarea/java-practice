package com.blueskyarea;

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

import com.blueskyarea.generator.hadoop.ApplicationListGenerator;

public class Graphoop extends AbstractHandler {
	public static void main(String[] args) throws Exception {
		Server server = new Server(8087);
		ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(true);
		resourceHandler.setWelcomeFiles(new String[] {"graphoop.html"});
		resourceHandler.setResourceBase(".");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { resourceHandler, new Graphoop() } );
		server.setHandler(handlers);
		server.start();
		server.join();
	}

	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}
	
	private void showJobsData(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) {
		String output = new ApplicationListGenerator().startToGetList();
	}
}
