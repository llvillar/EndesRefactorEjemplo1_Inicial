package com.tienda.pagos;

/**
 * Implementación del método de pago mediante PayPal.
 *
 * Esta clase permite realizar pagos utilizando una cuenta
 * de PayPal identificada por su correo electrónico.
 * Implementa la interfaz {@link MetodoPago}.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 */
public class PagoPayPal implements MetodoPago {

    /**
     * Correo electrónico asociado a la cuenta de PayPal.
     */
    private String emailCuenta;

    /**
     * Constructor que inicializa el pago con el correo
     * de la cuenta de PayPal.
     *
     * @param emailCuenta correo electrónico de la cuenta PayPal
     */
    public PagoPayPal(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    /**
     * Realiza el pago mediante PayPal.
     *
     * @param cantidad importe a pagar
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago con PayPal realizado.");
        System.out.println("Cantidad: " + cantidad);
    }
}
