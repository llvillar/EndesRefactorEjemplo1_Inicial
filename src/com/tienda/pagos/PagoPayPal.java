package com.tienda.pagos;

public class PagoPayPal implements MetodoPago {

    private String emailCuenta;

    public PagoPayPal(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago con PayPal realizado.");
        System.out.println("Cantidad: " + cantidad);
    }
}