package com.examen.examen_martinez.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Periodo")
public class Periodo {

    private Long id;
    private String periodo;
    private Integer year;

    private List<Carrera> carrera;

}
