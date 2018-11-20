package app.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.ContaBancaria;
import app.model.Despesa;

public interface DespesaRepository extends MongoRepository<Despesa, ObjectId> {
	Optional<Despesa> findById(ObjectId _id);
	List<Despesa> findByContaBancaria(ContaBancaria conta);
}
