package com.tienda.modelo;

/**
 * Representa un cliente estándar de la tienda.
 *
 * Este tipo de cliente no recibe ningún descuento
 * en sus compras.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 * @see Cliente
 * @see ClienteVip
 */
public class ClienteStandar extends Cliente {

    /**
     * Constructor de ClienteStandar.
     *
     * @param nombre nombre del cliente
     * @param email correo electrónico del cliente
     * @param telefono teléfono del cliente
     */
    public ClienteStandar(String nombre, String email, String telefono) {
        super(nombre, email, telefono);
    }

    /**
     * No aplica ningún descuento al total de la compra.
     *
     * @param total importe total de la compra
     * @return el mismo total sin descuento
     * @throws IllegalArgumentException si el total es negativo
     */
    @Override
    public double aplicarDescuento(double total) {

        if(total < 0){
            throw new IllegalArgumentException("El total no puede ser negativo");
        }

        return total;
    }
}