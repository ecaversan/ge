package app.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.ContaBancaria;
import app.model.ContaControle;
import app.repository.ContaBancariaRepository;

@Service
public class ContaBancariaService {

	@Autowired
	ContaBancariaRepository repository;

	public List<ContaBancaria> findAll() {
		return repository.findAll();
	}

	public Optional<ContaBancaria> findById(ObjectId _id) {
		return repository.findById(_id);
	}

	public void insert(String conta, BigDecimal saldoInicial, BigDecimal saldoAtual, ContaControle contaControle) {
		repository.insert(new ContaBancaria(ObjectId.get(), conta, saldoInicial, saldoAtual, contaControle));
	}

	public void insert(ContaBancaria conta) {
		repository.insert(conta);
	}

	public void delete(ContaBancaria conta) {
		repository.delete(conta);
	}

	public void save(ContaBancaria conta) {
		repository.save(conta);
	}

}
