package cristhyn.pizza.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cristhyn.pizza.idat.model.Ingredientes;
import cristhyn.pizza.idat.repository.IngredientesRepository;

@Service
public class IngredientesServiceImpl implements IngredientesService{

	@Autowired
	private IngredientesRepository repositorio;
	
	@Override
	public void guardar(Ingredientes ingredientes) {
		repositorio.save(ingredientes);
	}

	@Override
	public void actualizar(Ingredientes ingredientes) {
		repositorio.saveAndFlush(ingredientes);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<Ingredientes> listar() {
		return repositorio.findAll() ;
	}

	@Override
	public Ingredientes obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
