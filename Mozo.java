public class Mozo {
    private String nombre;

    public Mozo(String nombre){
        this.nombre = nombre;;
    }

    public void enviarPedidoACocina(Pedido pedido, Cocina cocina){
        System.out.println(nombre + " envia una comanda a la cocina");
        cocina.recibirComanda(pedido);
    }

    }
