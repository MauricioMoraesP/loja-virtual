package mentoria.lojavirutal.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pessoa_fisica")
@PrimaryKeyJoinColumn(name="id")
@Getter
@Setter

public class PessoaFisica extends Pessoa {
 
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String cpf;
	
	@Temporal(TemporalType.DATE)	
	private Date dataNascimento;
 
}
