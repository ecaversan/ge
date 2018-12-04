package app.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import app.model.Endereco;
import app.model.Fornecedor;
import app.repository.FornecedorRepository;

public class FornecedorService {
	
	@Autowired
	FornecedorRepository repository;
	
	public List<Fornecedor> findAll() {
		return repository.findAll();
	}

	public Optional<Fornecedor> findById(ObjectId _id) {
		return repository.findById(_id);
	}

	public void insert(String nome, Endereco endereco, String telefones, String email, String cpf,
			String rg, String webSite, String tipo) {
		repository.insert(new Fornecedor(ObjectId.get(), nome, endereco, telefones, email, cpf, rg, webSite, tipo));
	}
	
	public void insert(Fornecedor fornecedor) {
		repository.insert(fornecedor);
	}
	
	public void delete(Fornecedor fornecedor) {
		repository.delete(fornecedor);
	}
	
	public void save(Fornecedor fornecedor) {
		repository.save(fornecedor);
	}
}
