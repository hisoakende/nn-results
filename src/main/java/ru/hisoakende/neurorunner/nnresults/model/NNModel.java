package ru.hisoakende.neurorunner.nnresults.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class NNModel {
    private String inform;
}
