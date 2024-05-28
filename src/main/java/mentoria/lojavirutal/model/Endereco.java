package mentoria.lojavirutal.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import mentoria.lojavirutal.enums.TipoEndereco;
import jakarta.persistence.ForeignKey;


@Entity
@Table(name="endereco")
@Getter
@Setter
@EqualsAndHashCode
public class Endereco implements Serializable {

  
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_endereco", sequenceName="seq_endereco", allocationSize =1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
	private Long id;
	
	private String ruaLogra;
	private String cep;
	private String numero;
	private String complemento;
	private String bairro;
	private String uf;
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco;
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;

	
}
