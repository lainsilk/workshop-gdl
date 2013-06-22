package com.recluit.lab.restservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class MessageService {
	
	@GET
	@Path("/{RFC}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String sayHello(@PathParam("RFC") String RFC)
	{
	
		
try {
			
			Socket s = new Socket ("0.0.0.0", 3551);
			
			
			
			InputStreamReader stream = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(stream);

			PrintWriter writer = new PrintWriter(s.getOutputStream());
			writer.println(RFC);
			writer.flush();
			
			String str = null;
		
			str= reader.readLine();
			
	        String[] strgotit = str.split(",");
	        for (int i = 0; i < strgotit.length; i++) {
	            System.out.println(strgotit[i]);
	           
	        }
	        
			writer.close();
			reader.close();
			s.close();
			return (str);
			
		}catch(IOException e){e.printStackTrace();}

return null;
		
	}// fin say hello 
	
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		return "<?xml version=\"1.0\"?>" +
				 "<hello>Hello from RESTServer HML!!</hello>";
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello(){
		return new StringBuilder("")
		.append("<html>")
		.append("\t<head><title>Hello</head></title>")
		.append("<body><h1>Hello from RESTServer HTML!!!</h1></body>")
		.append("</html>").toString();
				
	}

}
