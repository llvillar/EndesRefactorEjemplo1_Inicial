package com.tienda.modelo;

/**
 * Representa un producto disponible en la tienda.
 *
 * Cada producto tiene un nombre, un precio unitario y una cantidad
 * determinada dentro de un pedido. Permite calcular el subtotal
 * multiplicando el precio unitario por la cantidad.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 * @see Pedido
 */
public class Producto {

    /** Nombre del producto */
    private String nombre;

    /** Precio unitario del producto */
    private double precioUnitario;

    /** Cantidad de unidades del producto */
    private int cantidad;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre nombre del producto
     * @param precioUnitario precio por unidad del producto
     * @param cantidad número de unidades del producto
     * @throws IllegalArgumentException si el nombre es nulo
     *                                  o si el precio o la cantidad son negativos
     */
    public Producto(String nombre, double precioUnitario, int cantidad) {

        if (nombre == null) {
            throw new IllegalArgumentException("El nombre del producto no puede ser nulo");
        }

        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }

        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    /**
     * Calcula el subtotal del producto dentro de un pedido.
     *
     * El subtotal se obtiene multiplicando el precio unitario
     * por la cantidad.
     *
     * @return subtotal del producto
     */
    public double calcularSubtotal() {
        return precioUnitario * cantidad;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio unitario del producto.
     *
     * @return precio unitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Obtiene la cantidad del producto.
     *
     * @return cantidad de unidades
     */
    public int getCantidad() {
        return cantidad;
    }
}