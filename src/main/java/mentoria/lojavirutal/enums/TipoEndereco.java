package mentoria.lojavirutal.enums;

public enum TipoEndereco {

	COBRANCA("Corbrança"), ETREGA("Entrega");
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
 		return this.descricao;
	}
}
