package app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pessoas")
public class Endereco {

	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;

	/**
	 * @param endereco
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param cep
	 */
	public Endereco(String endereco, String bairro, String cidade, String uf, String cep) {
		super();
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
}
