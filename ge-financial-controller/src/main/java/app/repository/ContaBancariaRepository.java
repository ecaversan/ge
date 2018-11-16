package app.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.ContaBancaria;

public interface ContaBancariaRepository extends MongoRepository<ContaBancaria, ObjectId> {
	Optional<ContaBancaria> findById(ObjectId _id);
}
