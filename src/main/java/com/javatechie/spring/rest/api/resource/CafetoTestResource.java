package com.javatechie.spring.rest.api.resource;

import com.javatechie.spring.rest.api.utils.Util;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/cafetoTestResource")
public class CafetoTestResource {

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getProperty/{name}")
	public Response getProperty(@PathParam("name") String name) {
		return Util.validateProperty(name) == true? Response.status(Response.Status.OK)
				.entity("Property exist, value: "+System.getProperty(name))
				.build(): Response.status(Response.Status.NOT_FOUND)
				.entity("Property does not exist")
				.build();
	}

}
