
package urlconnection1;
import java.net.*;
import java.io.*;

public class ReadServer {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        connection.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while((line = reader.readLine()) != null)
        {
        System.out.println(line);
        }
        reader.close();
}

    
}
