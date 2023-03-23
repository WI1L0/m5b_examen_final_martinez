package com.examen.examen_martinez.controller;

import com.examen.examen_martinez.model.Periodo;
import com.examen.examen_martinez.service.PeriodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Periodo")
public class PeriodoController {

    @Autowired
    PeriodoService periodoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Periodo>> listarPeriodo() {
        return new ResponseEntity(periodoService.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Periodo> crearPeriodo(
            @RequestBody Periodo a) {
        return new ResponseEntity<>(periodoService.save(a),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Periodo> actualizarPeriodo(@PathVariable Long id, @RequestBody Periodo p) {
        Periodo PeriodoEcontrada = periodoService.findById(id);
        if (PeriodoEcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                PeriodoEcontrada.setPeriodo(p.getPeriodo());
                PeriodoEcontrada.setYear(p.getYear());
                return new ResponseEntity<>(periodoService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Periodo> eliminarPeriodo(@PathVariable Long id) {
        periodoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
