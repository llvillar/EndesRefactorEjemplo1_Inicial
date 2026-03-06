public class Tienda {

    public void procesarPedido(Pedido p) {

        double total = p.calcularPedido();

        System.out.println("Total pedido: " + total);

        Pago pago = new Pago();
        pago.pagar(total);
    }
}