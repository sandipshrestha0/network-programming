
package urlconnection1;

import java.net.*;
import java.io.*;
public class NSMimeHeaderExample {
    public static void main(String[] args) throws Exception
    {
        URL url = new URL("http://example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int reponseCode = connection.getResponseCode(); 
        System.out.println("Response Code: " + reponseCode);
        String acceptRange = connection.getHeaderField("Accept-Ranges");
        System.out.println("Accept-Ranges: " + acceptRange);
        String vary = connection.getHeaderField("Vary");
        System.out.println("Vary: " + vary);
        String cacheControl = connection.getHeaderField("Cache-Control");
        System.out.println("Cache-Control: " + cacheControl);
        String server = connection.getHeaderField("server");
        System.out.println("Server: " + server);
    }
}


//Response Code: 200
//Accept-Ranges: null
//Vary: Accept-Encoding
//Cache-Control: max-age=604800
//Server: ECS (nyb/1D2E)


//steps for web caching
//1.create url
//2. bind the url with url object
//3. configure web catch
//4. make a http request
//5. reaad cache info in client server.