package com.tienda.pagos;

/**
 * Implementación del método de pago mediante tarjeta bancaria.
 *
 * Esta clase permite realizar pagos utilizando una tarjeta
 * identificada por su número. Implementa la interfaz
 * {@link MetodoPago}, por lo que define el comportamiento
 * del proceso de pago.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 */
public class PagoTarjeta implements MetodoPago {

    /**
     * Número de la tarjeta utilizada para el pago.
     */
    private String numeroTarjeta;

    /**
     * Constructor que inicializa el pago con el número de tarjeta.
     *
     * @param numeroTarjeta número de la tarjeta bancaria
     */
    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Realiza el pago con tarjeta de una cantidad determinada.
     *
     * @param cantidad importe a pagar
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago con tarjeta realizado.");
        System.out.println("Cantidad: " + cantidad);
    }
}
