package com.tienda.modelo;

public class ClienteVip extends Cliente {

    private static final double DESCUENTO = 0.10;

    public ClienteVip(String nombre, String email, String telefono) {
        super(nombre, email, telefono);
    }

    @Override
    public double aplicarDescuento(double total) {
        return total - (total * DESCUENTO);
    }
}