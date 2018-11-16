package app.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.Fornecedor;

public interface FornecedorRepository extends MongoRepository<Fornecedor, ObjectId> {
	Optional<Fornecedor> findById(ObjectId _id);
}
