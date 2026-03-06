package com.tienda.modelo;

/**
 * Clase abstracta que representa un cliente de la tienda.
 *
 * Contiene los datos básicos de un cliente y define el comportamiento
 * que deben implementar los diferentes tipos de clientes para aplicar
 * descuentos en las compras.
 *
 * Las clases que hereden de Cliente deberán implementar el método
 * {@link #aplicarDescuento(double)}.
 *
 * @author Luis López
 * @version 1.0
 * @since 1.0
 * @see ClienteStandar
 * @see ClienteVip
 */
public abstract class Cliente {

    /** Nombre del cliente */
    protected String nombre;

    /** Correo electrónico del cliente */
    protected String email;

    /** Teléfono del cliente */
    protected String telefono;

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre nombre del cliente
     * @param email correo electrónico del cliente
     * @param telefono número de teléfono del cliente
     * @throws IllegalArgumentException si algún dato es nulo
     */
    public Cliente(String nombre, String email, String telefono) {
        if(nombre == null || email == null || telefono == null){
            throw new IllegalArgumentException("Los datos del cliente no pueden ser nulos");
        }

        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el email del cliente.
     *
     * @return correo electrónico del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Muestra los datos del cliente por consola.
     */
    public void mostrarDatos(){
        System.out.println("Cliente: " + nombre +
                " | Email: " + email +
                " | Teléfono: " + telefono);
    }

    /**
     * Aplica el descuento correspondiente al tipo de cliente.
     *
     * @param total importe total de la compra
     * @return total después de aplicar el descuento
     * @throws IllegalArgumentException si el total es negativo
     */
    public abstract double aplicarDescuento(double total);

}