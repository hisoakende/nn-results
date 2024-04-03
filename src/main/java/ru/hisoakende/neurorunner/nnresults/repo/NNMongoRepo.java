package ru.hisoakende.neurorunner.nnresults.repo;

import ru.hisoakende.neurorunner.nnresults.model.NNModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NNMongoRepo extends MongoRepository<NNModel, UUID> {
}
