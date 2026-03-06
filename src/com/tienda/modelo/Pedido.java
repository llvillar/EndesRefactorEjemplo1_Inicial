package com.tienda.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static final double LIMITE_DESCUENTO = 100.0;

    private ClienteStandar cliente;
    private List<Producto> listaProductos;
    private double porcentajeDescuento;

    public Pedido(ClienteStandar cliente) {
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
        this.porcentajeDescuento = 0.10; // 10%
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public double calcularTotalPedido() {
        double total = calcularSumaProductos();
        return aplicarDescuentoSiCorresponde(total);
    }

    private double calcularSumaProductos() {
        double suma = 0;
        for (Producto producto : listaProductos) {
            suma += producto.calcularSubtotal();
        }
        return suma;
    }

    private double aplicarDescuentoSiCorresponde(double total) {
        if (total > LIMITE_DESCUENTO) {
            double descuentoCalculado = total * porcentajeDescuento;
            return total - descuentoCalculado;
        }
        return total;
    }

    public ClienteStandar getCliente() {
        return cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
}