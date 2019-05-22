package com.drkiettran.microprofile.rest;

import java.net.UnknownHostException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greetings")
public class HelloWorldEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{year}/{month}/{day}")
	public Response doGetDate(@PathParam("year") int year, @PathParam("month") int month, @PathParam("day") int day) {

		String date = year + "/" + month + "/" + day;
		Message message = new Message();
		message.setName("Thorntail");
		message.setMessage(date);
		return Response.status(200).entity(message).build();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{year}/{month}/{day}")
	public Response doPutDate(@PathParam("year") int year, @PathParam("month") int month, @PathParam("day") int day,
			Message inMessage) throws UnknownHostException {
		System.out.println("inMessage: " + inMessage.getName() + ":" + inMessage.getMessage());

		String date = year + "/" + month + "/" + day;
		Message message = new Message();
		Greetings greetings = new Greetings();
		message.setName(inMessage.getName());
		message.setMessage(greetings.hello(inMessage.getName()));
		return Response.status(200).entity(message).build();
	}
}
