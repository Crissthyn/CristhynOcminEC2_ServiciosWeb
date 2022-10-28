package cristhyn.pizza.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cristhyn.pizza.idat.model.Pizza;

public interface PizzaRepository  extends JpaRepository<Pizza, Integer>{

}
