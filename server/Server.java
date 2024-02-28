import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Server {
    public static void main(String[] args) throws IOException {
        // Create a HTTP server listening on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
        // Create a context for the root path "/"
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                // Set response headers
                exchange.getResponseHeaders().set("Content-Type", "text/html");
                
                // Get the HTML file
                File file = new File("index.html");
                
                // Check if the file exists
                if (file.exists() && file.isFile()) {
                    // Read the file content
                    byte[] content = Files.readAllBytes(file.toPath());
                    
                    // Set the response code and write the file content to the response body
                    exchange.sendResponseHeaders(200, content.length);
                    OutputStream outputStream = exchange.getResponseBody();
                    outputStream.write(content);
                    outputStream.close();
                } else {
                    // If file not found, return 404 error
                    exchange.sendResponseHeaders(404, 0);
                }
            }
        });
        
        // Start the server
        server.start();
        System.out.println("Server is listening on port 8000");
    }
}
