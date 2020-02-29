package com.distribuida.servicio;

import java.util.List;

import com.distribuida.dto.Todos;

public interface ServicioTodos {
	public Todos getTodosById(Integer id);

	public List<Todos> getTodos();

}
