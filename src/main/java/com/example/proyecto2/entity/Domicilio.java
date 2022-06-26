package com.example.proyecto2.entity;

public class Domicilio {
    private String provincia;
    private String ciudad;
    private String direccion;

    public Domicilio(String provincia, String ciudad, String direccion) {
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Domicilio() {
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "direccion=" + direccion +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}