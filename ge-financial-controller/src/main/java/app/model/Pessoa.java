package app.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("unused")
@Document(collection = "pessoas")
public class Pessoa {
	
	@Id
	private ObjectId _id;
	private String nome;
	private Endereco endereco;
	private String telefones;
	private String email;
	private String cpf;
	private String rg;
	private String webSite;
	private String tipo;
	
	/**
	 * @param id
	 * @param nome
	 * @param endereco
	 * @param telefones
	 * @param email
	 * @param cpf
	 * @param rg
	 * @param webSite
	 * @param tipo
	 */
	public Pessoa(ObjectId _id, String nome, Endereco endereco, String telefones, String email, String cpf,
			String rg, String webSite, String tipo) {
		super();
		this._id = _id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.webSite = webSite;
		this.tipo = tipo;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefones() {
		return telefones;
	}

	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
