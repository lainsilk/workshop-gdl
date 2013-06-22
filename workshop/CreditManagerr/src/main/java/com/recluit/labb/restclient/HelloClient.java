package com.recluit.labb.restclient;



import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class HelloClient {
	
	public String getMessage(String option, String rfc){
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/RestServer/rest/find/"+"r%7C"+rfc);
		ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
		
		if(response.getStatus() != 200){
			throw new RuntimeException("Carajo >_<*!!!!!!!: "+response.getStatus());
		}
		
		String output = response.getEntity(String.class);
		return output;
	}

}
