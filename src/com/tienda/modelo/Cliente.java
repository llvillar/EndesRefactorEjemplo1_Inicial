package com.tienda.modelo;

public abstract class Cliente {

    protected String nombre;
    protected String email;
    protected String telefono;


    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarDatos(){
        System.out.println("Cliente: " + nombre + " | Email: " + email + " | Teléfono: " + telefono);
    }

    public abstract double aplicarDescuento(double total);

}