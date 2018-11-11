package app.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.ContaControle;

public interface ContaControleRepository extends MongoRepository<ContaControle, ObjectId> {
	Optional<ContaControle> findById(ObjectId _id);
}
