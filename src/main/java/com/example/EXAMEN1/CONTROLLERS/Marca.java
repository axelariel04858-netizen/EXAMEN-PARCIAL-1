package com.example.EXAMEN1.CONTROLLERS;

public class Marca {
    private int id;
    private String nombre;
    private String pais;
    private int fundacion;

    public Marca() {
    }

    public Marca(int id, String nombre, String pais, int fundacion) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.fundacion = fundacion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public int getFundacion() { return fundacion; }
    public void setFundacion(int fundacion) { this.fundacion = fundacion; }
}
