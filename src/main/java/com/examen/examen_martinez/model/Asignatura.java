package com.examen.examen_martinez.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Asignatura")
public class Asignatura {

    private String nombre;
    private Integer n_horas;
    private Integer n_horas_practicas;
    private Integer n_horas_autonomas;



}
