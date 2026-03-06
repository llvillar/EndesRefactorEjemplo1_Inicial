public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana", "ana@gmail.com", "666666666");

        Producto p1 = new Producto("Camiseta", 25, 3);
        Producto p2 = new Producto("Pantalón", 40, 2);

        Pedido pedido = new Pedido(c1);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        Tienda tienda = new Tienda();
        tienda.procesarPedido(pedido);
    }
}