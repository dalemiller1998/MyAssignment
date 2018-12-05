package parser;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//HTTP Post: Requesting code from the server
public class HTTPpost {


public void sendPost() throws Exception {
	String url ="http://i2j.openode.io/student?id=s195390";
	URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	
	//Receiving HTTP Request
	con.setRequestMethod("GET");
//	con.setRequestProperty("id", "S195390");
//	con.setRequestProperty("Accept-Language", "en-united kingdom,en;q=0.5");
//	
//	String urlParameters = "";
//	
//	//Sending Post Request
//	con.setDoOutput(true);
//	DataOutputStream out = new DataOutputStream(con.getOutputStream());
//	out.writeBytes(urlParameters);
//	out.flush();
//	out.close();
	
	int responseCode = con.getResponseCode();
	System.out.println("Sending a post Request to Server");
	System.out.println("Post parameters of String");
	System.out.println("Response to code");
	
	BufferedReader in = new BufferedReader(
			new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();
	
	while ((inputLine = in.readLine()) !=null) {
		response.append(inputLine);
	}
	out.close();
	}
}

