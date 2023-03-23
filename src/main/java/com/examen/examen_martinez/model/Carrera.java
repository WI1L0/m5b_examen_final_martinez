package com.examen.examen_martinez.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Carrera")
public class Carrera {

    private String nombre;
    private String descripcion;

    private List<Ciclo> ciclo;

}
