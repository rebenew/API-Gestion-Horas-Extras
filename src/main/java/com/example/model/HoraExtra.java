package com.example.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
    public class HoraExtra {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    private String tipo; // Diurna, Nocturna, Festiva, Dominical
        private LocalDate fecha;
        private Double horasTrabajadas;
        private Double valorHora;
        private String usuario;
}
