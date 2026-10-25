public class Main{
    public static void  main(String [] args){
        Cocina cocina = new Cocina();
        Mozo mozo = new Mozo("Carlos");


        Pedido pedido = new Pedido(5);

        Plato plato1 = new Plato("Hamburguesa", 8500, 15);
        Plato plato2 = new Plato("Papas fritas", 3500, 10);
        Plato plato3 = new Plato("Pizza", 12000, 20);

        pedido.agregarPlato(plato1);
        pedido.agregarPlato(plato2);
        pedido.agregarPlato(plato3);

        mozo.enviarPedidoACocina(pedido, cocina);

        cocina.mostrarPendientes();



    }
}