package com.tienda.pagos;

public class PagoTarjeta implements MetodoPago {

    private String numeroTarjeta;

    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago con tarjeta realizado.");
        System.out.println("Cantidad: " + cantidad);
    }
}