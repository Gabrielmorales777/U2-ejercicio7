
import java.util.LinkedList;
import java.util.Queue;

public class Cocina {

    private Queue<Pedido> pedidosPendientes;

    public Cocina() {
        pedidosPendientes = new LinkedList<>();
    }

    public void recibirComanda(Pedido pedido) {
        pedidosPendientes.add(pedido);
        System.out.println("Cocina recibió el pedido de la mesa "
                + pedido.getNumeroMesa());
    }

    public void mostrarPendientes() {
        System.out.println("\n=== ESTADO DE LA COCINA ===");

        if (pedidosPendientes.isEmpty()) {
            System.out.println("No hay pedidos pendientes.");
            return;
        }

        for (Pedido pedido : pedidosPendientes) {
            pedido.mostrarPedido();
            System.out.println("--------------------------");
        }

        System.out.println("Total de pedidos pendientes: "
                + pedidosPendientes.size());
    }
}
