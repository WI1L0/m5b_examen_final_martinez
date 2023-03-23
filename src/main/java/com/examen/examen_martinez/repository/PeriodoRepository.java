package com.examen.examen_martinez.repository;

import com.examen.examen_martinez.model.Periodo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeriodoRepository extends MongoRepository<Periodo, Long> {
}
