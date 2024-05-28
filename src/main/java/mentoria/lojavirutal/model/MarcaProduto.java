package mentoria.lojavirutal.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="marca_produto")
@Getter
@Setter
public class MarcaProduto implements Serializable {

  
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_marca_produto", sequenceName="seq_marca_produto", allocationSize =1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
	private Long id;
	
	@Column(nullable = false)
	private String nomeDesc;
	
	
}
