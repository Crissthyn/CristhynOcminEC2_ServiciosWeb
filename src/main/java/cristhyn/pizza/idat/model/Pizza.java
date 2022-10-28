package cristhyn.pizza.idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name="pizza")
public class Pizza {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpizza;
	private String pizza;
	private String descripcion;
	
	
	@ManyToMany( cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name="vendedor_pizza",
			joinColumns = @JoinColumn(
					name = "idpizza",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idpizza) references pizza(idpizza)")
					),
			inverseJoinColumns = @JoinColumn(
					name = "idvendedor",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idvendedor) references vendedor(idvendedor)")
					)
			)
	private List<Vendedor> vendedores = new ArrayList<>();
	
	
	@ManyToMany(mappedBy = "pizzas", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Ingredientes> listaingredientes;

}
