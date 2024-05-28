package mentoria.lojavirutal.model;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Table(name="acesso")
@Entity
public class Acesso implements GrantedAuthority {

	
 
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_acesso", sequenceName="seq_acesso", allocationSize =1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
	private Long id;
	
	@Column(nullable = false)
	private String descricao;
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
