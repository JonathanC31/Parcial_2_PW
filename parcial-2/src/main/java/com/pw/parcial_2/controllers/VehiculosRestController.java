package com.pw.parcial_2.controllers;

import com.pw.parcial_2.model.entity.Vehiculo;
import com.pw.parcial_2.model.service.IVehiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class VehiculosRestController {

    @Autowired
    private IVehiculosService vehiculoService;

    @GetMapping("/vehiculo")
    public List<Vehiculo> findALL(){
        return vehiculoService.findAll();
    }

    @GetMapping("/vehiculo/{id}")
    public Optional<Vehiculo> findById(@PathVariable Long id){
        return vehiculoService.findById(id);
    }

    @PostMapping("/vehiculo")
    public Vehiculo save(@RequestBody Vehiculo vehiculo){
        return vehiculoService.save(vehiculo);}


    @PutMapping("/vehiculo/{id}")
    public void update(@RequestBody Vehiculo vehiculo, @PathVariable Long id){
        vehiculoService.update(vehiculo, id);
    }


    @DeleteMapping("/vehiculo/{id}")
    public void delete(@PathVariable Long id){
        vehiculoService.delete(id);
    }
}
