package app.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.ContaBancaria;
import app.model.Receita;

public interface ReceitaRepository extends MongoRepository<Receita, ObjectId> {
	Optional<Receita> findById(ObjectId _id);
	List<Receita> listByContaBancaria(ContaBancaria conta);
}
