package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

import com.google.gson.Gson;

public class GetHbaseDataWithAjax extends AbstractHandler {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8082);
		
		ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(true);
		resourceHandler.setWelcomeFiles(new String[] { "welcome2.html" });
		resourceHandler.setResourceBase(".");
		
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { resourceHandler, new GetHbaseDataWithAjax() });
		
		server.setHandler(handlers);
	    server.start();
	    server.join();
	}

	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		Configuration conf = HBaseConfiguration.create();
		conf.set("hbase.zookeeper.quorum", "localhost");
		HTable table =  new HTable(conf, "ns:test");
		ResultScanner rs = getDataByRowRange(table, "", "");
		
		response.setContentType("text/html;charset=utf-8");
		List<ViewerEntity> entities = new ArrayList<>();
		for(Result result : rs) {
			ViewerEntity entry = new ViewerEntity(
					Bytes.toString(result.getRow()),
					Bytes.toString(result.getValue(Bytes.toBytes("data"), Bytes.toBytes("q1"))),
					Bytes.toString(result.getValue(Bytes.toBytes("data"), Bytes.toBytes("q2"))));
			entities.add(entry);
		}
		
		Gson gson = new Gson();
		String output = gson.toJson(entities);
		response.getWriter().println(output);
	    response.flushBuffer();
	    baseRequest.setHandled(true);
	}
	
    public ResultScanner getDataByRowRange(HTable table, String start, String stop)
            throws IOException {
        Scan scan = new Scan();

        if (start != null) {
        	scan.setStartRow(Bytes.toBytes(start));
        }

        if (stop != null) {
        	scan.setStopRow(Bytes.toBytes(stop));
        }

        return table.getScanner(scan);
    }
    
    public class ViewerEntity {
    	public String key;
    	public String q1;
    	public String q2;
    	
    	public ViewerEntity(String key, String q1, String q2) {
    		this.key = key;
    		this.q1 = q1;
    		this.q2 = q2;
    	}
    }
}
