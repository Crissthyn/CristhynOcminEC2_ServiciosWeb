package cristhyn.pizza.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cristhyn.pizza.idat.model.Vendedor;
import cristhyn.pizza.idat.repository.VendedorRepository;

@Service
public class VendedorServiceImpl implements VendedorService{

	@Autowired
	private VendedorRepository repositorio;
	
	@Override
	public void guardar(Vendedor vendedor) {
		repositorio.save(vendedor);
	}

	@Override
	public void actualizar(Vendedor vendedor) {
		repositorio.saveAndFlush(vendedor);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<Vendedor> listar() {
		return repositorio.findAll() ;
	}

	@Override
	public Vendedor obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
