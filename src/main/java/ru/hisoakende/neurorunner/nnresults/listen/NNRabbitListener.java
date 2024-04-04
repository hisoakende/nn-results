package ru.hisoakende.neurorunner.nnresults.listen;

import ru.hisoakende.neurorunner.nnresults.model.NNModel;
import ru.hisoakende.neurorunner.nnresults.service.RabbitService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
@EnableRabbit
@Component
public class NNRabbitListener {

    private final RabbitService rabbitService;

    @Autowired
    public NNRabbitListener(RabbitService rabbitService){
        this.rabbitService = rabbitService;
    }

    @RabbitListener(queues = "rabbitQueue")
    public void getMessage(String message){

        NNModel model = new NNModel();
        model.setInform(message);
        rabbitService.saveModel(model);
    }
}
