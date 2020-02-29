package com.distribuida.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.dto.Todos;
import com.distribuida.servicio.ServicioTodos;

@Path("todos")
@ApplicationScoped
public class ServicioTodosRest {

	@Inject
	private ServicioTodos servicio;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todos> listarTodos() {
		List<Todos> lista = servicio.getTodos();
		return lista;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Todos singerPorId(@PathParam("id") Integer id) {
		Todos todos = servicio.getTodosById(id);
		return todos;
	}

}
