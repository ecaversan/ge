package app.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.ContaBancaria;
import app.model.Receita;
import app.repository.ReceitaRepository;

@Service
public class ReceitaService {

	@Autowired
	private ReceitaRepository receitaRepository;
	
	public List<Receita> findAll(){
		return receitaRepository.findAll();
	}
	
	public Optional<Receita> findById(ObjectId _id){
		return receitaRepository.findById(_id);
	}
	
	public void insert(Receita receita) {
		receitaRepository.insert(receita);
	}
	
	public void delete(Receita receita) {
		receitaRepository.delete(receita);
	}
	
	public List<Receita> listByContaBancaria(ContaBancaria conta){
		return receitaRepository.findByContaBancaria(conta);
	}
	
	public void save(Receita receita) {
		receitaRepository.save(receita);
	}
}
