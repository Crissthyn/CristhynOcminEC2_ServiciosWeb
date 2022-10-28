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
@Table(name="ingrediente")
public class Ingredientes {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idingrediente;
	private String nombre;
	private String descripcion;

	
	@ManyToMany( cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name="Ingredientes_pizza",
			joinColumns = @JoinColumn(
					name = "idingrediente",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idingrediente) references ingrediente(idingrediente)")
					),
			inverseJoinColumns = @JoinColumn(
					name = "idpizza",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idpizza) references pizza(idpizza)")
					)
			)
	private List<Pizza> pizzas = new ArrayList<>();
}
