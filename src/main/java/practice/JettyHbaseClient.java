package practice;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class JettyHbaseClient extends HttpServlet {
	private static final long serialVersionUID = -5946662321501173508L;

	public static void main(String[] args) throws Exception {
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(JettyHbaseClient.class, "/hbase");
		
		Server server = new Server(12345);
		server.setHandler(handler);
		server.start();
		server.join();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		conf.set("hbase.zookeeper.quorum", "localhost");
		HTable table =  new HTable(conf, "ns:test");
		ResultScanner rs = getDataByRowRange(table, "", "");
		
		response.getWriter().println("Jetty with Servlet.\n");
		for(Result result : rs) {
			response.getWriter().println(Bytes.toString(result.getRow()) + "\n");
		}
		
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

}
