package com.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SampleApi{
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection Connection = (HttpURLConnection) url.openConnection();
		Connection.setRequestMethod("POST");
		Connection.setRequestProperty("Content-Type","application/json");
		Connection.setDoOutput(true);
		String jsonBody="{\"name\":\"jagadeesh\",\"salary\":\"123\",\"age\":\"23\"}";
		byte[] bytes = jsonBody.getBytes();
		OutputStream outputStream = Connection.getOutputStream();
		outputStream.write(bytes);
		System.out.println("status: "+Connection.getResponseCode()+" "+Connection.getResponseMessage());
		InputStream k = Connection.getInputStream();
		InputStreamReader ir=new InputStreamReader(k);
		BufferedReader bf=new BufferedReader(ir);
		String line;
		while ((line=bf.readLine())!=null) {
			System.out.println(line);
		}
		
		
	}
	
}