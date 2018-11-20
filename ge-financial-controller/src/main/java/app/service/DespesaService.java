package app.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.ContaBancaria;
import app.model.Despesa;
import app.repository.DespesaRepository;

@Service
public class DespesaService {
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	public List<Despesa> findAll(){
		return despesaRepository.findAll();
	}
	
	public Optional<Despesa> findById(ObjectId _id){
		return despesaRepository.findById(_id);
	}
	
	public void insert(Despesa Despesa) {
		despesaRepository.insert(Despesa);
	}
	
	public void delete(Despesa Despesa) {
		despesaRepository.delete(Despesa);
	}
	
	public List<Despesa> listByContaBancaria(ContaBancaria conta){
		return despesaRepository.findByContaBancaria(conta);
	}
	
	public void save(Despesa Despesa) {
		despesaRepository.save(Despesa);
	}

}
