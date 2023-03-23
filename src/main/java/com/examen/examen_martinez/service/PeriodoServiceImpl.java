package com.examen.examen_martinez.service;

import com.examen.examen_martinez.model.Periodo;
import com.examen.examen_martinez.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PeriodoServiceImpl extends GenericServiceImpl<Periodo, Long> implements PeriodoService {

    @Autowired
    PeriodoRepository Repository;

    @Override
    public CrudRepository<Periodo, Long> getDao() {
        return Repository;
    }
}
