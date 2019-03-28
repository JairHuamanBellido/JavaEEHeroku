package com.Rest.service;


import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import com.Rest.vo.VOUsuario;

@Path("/rest")

public class ServiceLogin {


	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validarUsuario(VOUsuario vo ) {
		if(vo.getUsername().equals("Jair")) 
			vo.setUsername("pepe");
	
		return vo;
	}
	
	
	@GET
	@Path("/hello")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public String getHello() {
		return "Hello";
	}
}
