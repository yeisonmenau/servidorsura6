package com.example.servidorsura6.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String modelo;
    private String marca;
    private String cilindraje;
    private String color;
    private String Descripcion;
    private Integer numeroSiniestros;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String placa, String modelo, String marca, String cilindraje, String color, String descripcion, Integer numeroSiniestros) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        Descripcion = descripcion;
        this.numeroSiniestros = numeroSiniestros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Integer getNumeroSiniestros() {
        return numeroSiniestros;
    }

    public void setNumeroSiniestros(Integer numeroSiniestros) {
        this.numeroSiniestros = numeroSiniestros;
    }
}
