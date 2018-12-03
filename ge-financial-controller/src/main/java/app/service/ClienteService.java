package app.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import app.model.Cliente;
import app.model.Endereco;
import app.repository.ClienteRepository;

public class ClienteService {
	
	@Autowired
	ClienteRepository repository;
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
	
	public Optional<Cliente> findById(ObjectId _id) {
		return repository.findById(_id);
	}

	public void insert(String nome, Endereco endereco, String telefones, String email, String cpf,
			String rg, String webSite, String tipo) {
		repository.insert(new Cliente(ObjectId.get(), nome, endereco, telefones, email, cpf, rg, webSite, tipo));
	}
	
	public void insert(Cliente cliente) {
		repository.insert(cliente);
	}
	
	public void delete(Cliente cliente) {
		repository.delete(cliente);
	}
	
	public void save(Cliente cliente) {
		repository.save(cliente);
	}

}
