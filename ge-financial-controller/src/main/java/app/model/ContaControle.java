package app.model;

import org.bson.types.ObjectId;

public class ContaControle extends Pessoa {

	public ContaControle(ObjectId _id, String nome, Endereco endereco, String telefones, String email, String cpf,
			String rg, String webSite, String tipo) {
		super(_id, nome, endereco, telefones, email, cpf, rg, webSite, tipo);
		// TODO Auto-generated constructor stub
	}

}
