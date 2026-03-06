package com.tienda.modelo;

public class ClienteStandar extends Cliente {

    public ClienteStandar(String nombre, String email, String telefono) {
        super(nombre, email, telefono);
    }

    @Override
    public double aplicarDescuento(double total) {
        return total;
    }
}