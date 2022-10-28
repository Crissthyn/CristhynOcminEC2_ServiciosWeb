package cristhyn.pizza.idat.service;

import java.util.List;

import cristhyn.pizza.idat.model.Ingredientes;


public interface IngredientesService {

	void guardar(Ingredientes ingredientes);
	void actualizar(Ingredientes ingredientes);
	void eliminar(Integer id);
	List<Ingredientes> listar();
	Ingredientes obtener(Integer id);
}
