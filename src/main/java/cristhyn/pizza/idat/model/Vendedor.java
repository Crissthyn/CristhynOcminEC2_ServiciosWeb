package cristhyn.pizza.idat.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="vendedor")
public class Vendedor {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idvendedor;
	private String nombre;
	private String celular;
	
	@ManyToMany(mappedBy = "vendedores", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Pizza> listapizzas;

}
