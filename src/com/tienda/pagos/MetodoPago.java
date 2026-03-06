package com.tienda.pagos;

/**
 * Interfaz que define el comportamiento de los métodos de pago
 * disponibles en la tienda.
 *
 * Las clases que implementen esta interfaz deberán definir
 * cómo se realiza el pago de una determinada cantidad.
 *
 * Ejemplos de implementación pueden ser:
 * pago con tarjeta, PayPal o transferencia bancaria.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 * @see com.tienda.modelo.Pedido
 */
public interface MetodoPago {

    /**
     * Realiza el pago de una cantidad determinada.
     *
     * Las clases que implementen esta interfaz deberán
     * definir el proceso de pago correspondiente.
     *
     * @param cantidad importe a pagar
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    void pagar(double cantidad);
}