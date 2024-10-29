package com.pw.parcial_2.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="placa")
    private String placa;

    @Column(name="hora_Entrada")
    private String hora_Entrada;

    @Column(name="hora_Salida")
    private String hora_Salida;

    @Column(name="ubicacion")
    private String ubicacion;
}
