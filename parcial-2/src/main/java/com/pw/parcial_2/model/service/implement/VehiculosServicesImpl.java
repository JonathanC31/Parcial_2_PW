package com.pw.parcial_2.model.service.implement;

import com.pw.parcial_2.model.entity.Vehiculo;
import com.pw.parcial_2.model.repository.IVehiculoRepository;
import com.pw.parcial_2.model.service.IVehiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class VehiculosServicesImpl implements IVehiculosService {

    @Autowired
    private IVehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculo> findAll() {
        return(List<Vehiculo>) vehiculoRepository.findAll();
    }

    @Override
    public Optional<Vehiculo> findById(Long id) {
        return vehiculoRepository.findById(id);
    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public void update(Vehiculo vehiculo, Long id) {
        Optional<Vehiculo>us=vehiculoRepository.findById(id);
        if(!us.isEmpty()){
            Vehiculo vehiculoUpdate=us.get();
            vehiculoUpdate.setId(vehiculo.getId());
            vehiculoUpdate.setPlaca(vehiculo.getPlaca());
            vehiculoUpdate.setHora_Entrada(vehiculo.getHora_Entrada());
            vehiculoUpdate.setHora_Salida(vehiculo.getHora_Salida());
            vehiculoUpdate.setUbicacion(vehiculo.getUbicacion());

            vehiculoRepository.save(vehiculoUpdate);
        }else {
            System.out.println("No existe el Vehiculo");
        }
    }

    @Override
    public void delete(Long id) {
        vehiculoRepository.deleteById(id);
    }
}
