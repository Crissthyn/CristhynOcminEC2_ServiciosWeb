package cristhyn.pizza.idat.service;

import java.util.List;

import cristhyn.pizza.idat.model.Pizza;


public interface PizzaService {

	void guardar(Pizza pizza);
	void actualizar(Pizza pizza);
	void eliminar(Integer id);
	List<Pizza> listar();
	Pizza obtener(Integer id);
}
