package com.tienda.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido realizado por un cliente en la tienda.
 *
 * Un pedido contiene una lista de productos y permite calcular
 * el total de la compra. Si el importe total supera un límite
 * establecido, se aplica un descuento al pedido.
 *
 * Cada pedido está asociado a un cliente estándar.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 * @see Cliente
 * @see ClienteStandar
 * @see Producto
 */
public class Pedido {

    /** Límite mínimo a partir del cual se aplica el descuento */
    private static final double LIMITE_DESCUENTO = 100.0;

    /** Cliente que realiza el pedido */
    private ClienteStandar cliente;

    /** Lista de productos incluidos en el pedido */
    private List<Producto> listaProductos;

    /** Porcentaje de descuento aplicado si se supera el límite */
    private double porcentajeDescuento;

    /**
     * Constructor de la clase Pedido.
     *
     * Inicializa un pedido para un cliente estándar y crea
     * una lista vacía de productos.
     *
     * @param cliente cliente que realiza el pedido
     * @throws IllegalArgumentException si el cliente es nulo
     */
    public Pedido(ClienteStandar cliente) {

        if(cliente == null){
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }

        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
        this.porcentajeDescuento = 0.10; // 10%
    }

    /**
     * Agrega un producto al pedido.
     *
     * @param producto producto que se desea añadir al pedido
     * @throws IllegalArgumentException si el producto es nulo
     */
    public void agregarProducto(Producto producto) {

        if(producto == null){
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }

        listaProductos.add(producto);
    }

    /**
     * Calcula el total del pedido sumando todos los productos
     * y aplicando el descuento si corresponde.
     *
     * @return total final del pedido
     */
    public double calcularTotalPedido() {
        double total = calcularSumaProductos();
        return aplicarDescuentoSiCorresponde(total);
    }

    /**
     * Calcula la suma de los subtotales de todos los productos del pedido.
     *
     * @return suma total de los productos
     */
    private double calcularSumaProductos() {
        double suma = 0;

        for (Producto producto : listaProductos) {
            suma += producto.calcularSubtotal();
        }

        return suma;
    }

    /**
     * Aplica un descuento al total si supera el límite establecido.
     *
     * @param total total del pedido antes del descuento
     * @return total con descuento aplicado si corresponde
     */
    private double aplicarDescuentoSiCorresponde(double total) {

        if (total > LIMITE_DESCUENTO) {
            double descuentoCalculado = total * porcentajeDescuento;
            return total - descuentoCalculado;
        }

        return total;
    }

    /**
     * Obtiene el cliente asociado al pedido.
     *
     * @return cliente que realiza el pedido
     */
    public ClienteStandar getCliente() {
        return cliente;
    }

    /**
     * Obtiene la lista de productos incluidos en el pedido.
     *
     * @return lista de productos del pedido
     */
    public List<Producto> getListaProductos() {
        return listaProductos;
    }
}