package app.model;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Fornecedor extends Pessoa {

	public Fornecedor(ObjectId id, String nome, Endereco endereco, String telefones, String email, String cpf, String rg,
			String webSite, String tipo) {
		super(id, nome, endereco, telefones, email, cpf, rg, webSite, tipo);
		// TODO Auto-generated constructor stub
	}

}
