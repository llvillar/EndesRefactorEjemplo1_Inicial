package com.tienda.modelo;

/**
 * Representa un cliente VIP de la tienda.
 *
 * Los clientes VIP tienen un descuento fijo aplicado
 * al total de sus compras.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 * @see Cliente
 * @see ClienteStandar
 */
public class ClienteVip extends Cliente {

    /** Porcentaje de descuento aplicado a clientes VIP */
    private static final double DESCUENTO = 0.10;

    /**
     * Constructor de ClienteVip.
     *
     * @param nombre nombre del cliente
     * @param email correo electrónico del cliente
     * @param telefono teléfono del cliente
     */
    public ClienteVip(String nombre, String email, String telefono) {
        super(nombre, email, telefono);
    }

    /**
     * Aplica un descuento del 10% al total de la compra.
     *
     * @param total importe total de la compra
     * @return total con el descuento aplicado
     * @throws IllegalArgumentException si el total es negativo
     */
    @Override
    public double aplicarDescuento(double total) {

        if(total < 0){
            throw new IllegalArgumentException("El total no puede ser negativo");
        }

        return total - (total * DESCUENTO);
    }
}