package com.distribuida.servicio;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Todos;

@ApplicationScoped
@Transactional
public class ServicioTodosImpl implements ServicioTodos {

	@PersistenceContext(unitName = "todosPU")
	private EntityManager entityManager;

	@Override
	public Todos getTodosById(Integer id) {
		Todos todos = null;
		todos = entityManager.find(Todos.class, id);

		return todos;
	}

	@Override
	public List<Todos> getTodos() {
		List<Todos> lista = null;
		lista = entityManager.createNamedQuery("Todos.findAll", Todos.class).getResultList();
		return lista;
	}

}
