package app.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.ContaControle;
import app.model.Endereco;
import app.repository.ContaControleRepository;

@Service
public class ContaControleService {

	@Autowired
	private ContaControleRepository repository;

	public List<ContaControle> findAll() {
		return repository.findAll();
	}

	public void insert(String nome, Endereco endereco, String telefones, String email, String cpf,
			String rg, String webSite, String tipo) {
		repository.insert(new ContaControle(ObjectId.get(), nome, endereco, telefones, email, cpf, rg, webSite, tipo));
	}
}
