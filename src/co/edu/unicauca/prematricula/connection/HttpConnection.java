package co.edu.unicauca.prematricula.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpConnection {
	
	private String urlBase;
	
	public HttpConnection(){
		//urlBase = "http://localhost/SimcaTest/public/index.php/";
		urlBase = "http://servidorinnova.cloudapp.net/SimcaTest/public/index.php/";
	}
	
	public String getUrlBase() {
		return urlBase;
	}

	public String requestByGet(String url_m){
		BufferedReader rd = null;
		StringBuilder sb = null;
		String line = null;
		try{
			URL url = new URL(url_m);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
			sb = new StringBuilder();
			while((line = rd.readLine()) != null){
				sb.append(line + "\n");
			}
			return sb.toString();
		} catch (MalformedURLException e) {
	         e.printStackTrace();
	     } catch (ProtocolException e) {
	         e.printStackTrace();
	     } catch (IOException e) {
	         e.printStackTrace();
	     }

	    return "";
	}
	
	public String requestByJsonPost(String url_m, String json){
		String rta = "";
		try{
			URL url = new URL(url_m);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoOutput(true);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			
			OutputStream os = con.getOutputStream();
			os.write(json.getBytes());
			os.flush();
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			while((output = br.readLine()) != null){
				rta+=output;
			}
			con.disconnect();
		}catch (MalformedURLException e) {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	    }
		return rta;
	}
}
