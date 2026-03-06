package com.tienda.servicio;

import com.tienda.modelo.Pedido;
import com.tienda.pagos.MetodoPago;

public class ServicioTienda {

    public void procesarPedido(Pedido pedido, MetodoPago metodoPago) {

        double total = pedido.calcularTotalPedido();

        System.out.println("Procesando pedido de: " + pedido.getCliente().getNombre());
        System.out.println("Total a pagar: " + total);

        metodoPago.pagar(total);
    }
}