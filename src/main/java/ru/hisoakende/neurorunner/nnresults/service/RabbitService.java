package ru.hisoakende.neurorunner.nnresults.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hisoakende.neurorunner.nnresults.model.NNModel;
import ru.hisoakende.neurorunner.nnresults.repo.NNMongoRepo;

@Service
@Transactional
public class RabbitService {
    private final NNMongoRepo repo;
    @Autowired
    public RabbitService(NNMongoRepo repo) {
        this.repo = repo;
    }

    public void saveModel(NNModel message){
        repo.save(message);
    }
}
