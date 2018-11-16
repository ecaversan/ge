package app.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, ObjectId> {
	Optional<Cliente> findById(ObjectId _id);
}
