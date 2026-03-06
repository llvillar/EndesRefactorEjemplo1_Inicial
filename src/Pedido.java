import java.util.ArrayList;

public class Pedido {

    public Cliente cliente;
    public ArrayList<Producto> productos = new ArrayList<>();

    public Pedido(Cliente c) {
        cliente = c;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularPedido() {
        double total = 0;

        for (Producto p : productos) {
            total += p.precio * p.cantidad;
        }

        if (total > 100) {
            total = total - (total * 0.1);
        }

        return total;
    }
}