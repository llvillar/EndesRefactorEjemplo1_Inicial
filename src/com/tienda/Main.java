package com.tienda;

import com.tienda.modelo.ClienteStandar;
import com.tienda.modelo.Pedido;
import com.tienda.modelo.Producto;
import com.tienda.pagos.MetodoPago;
import com.tienda.pagos.PagoTarjeta;
import com.tienda.servicio.ServicioTienda;

public class Main {

    public static void main(String[] args) {

        ClienteStandar cliente = new ClienteStandar("Ana", "ana@gmail.com", "666666666");

        Producto producto1 = new Producto("Camiseta", 25, 3);
        Producto producto2 = new Producto("Pantalón", 40, 2);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);

        MetodoPago metodoPago = new PagoTarjeta("1234-5678-9999");

        ServicioTienda servicio = new ServicioTienda();
        servicio.procesarPedido(pedido, metodoPago);
    }
}