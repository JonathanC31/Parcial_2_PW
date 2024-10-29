package com.pw.parcial_2.model.service;

import com.pw.parcial_2.model.entity.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IVehiculosService {
    List<Vehiculo> findAll();
    Optional<Vehiculo> findById(Long id);
    Vehiculo save(Vehiculo vehiculo);
    void update(Vehiculo vehiculo, Long id);
    void delete(Long id);
}
