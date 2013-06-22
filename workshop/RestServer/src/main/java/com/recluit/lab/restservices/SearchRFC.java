package com.recluit.lab.restservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;



@Path("/find")

public class SearchRFC {
	@GET
	@Path("/{rfc}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String getBook(@PathParam("rfc")String rfc)
	{
		
		return rfc;
	}


}

