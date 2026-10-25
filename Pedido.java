
   import java.util.ArrayList;
    import java.util.List;

    public class Pedido {
        private List<Plato> platos;
        private int numeroMesa;

        public Pedido(int numeroMesa) {
            this.numeroMesa = numeroMesa;
            this.platos = new ArrayList<>();
        }
        public void agregarPlato(Plato plato){
            platos.add(plato);
        }
        public List<Plato> getPlatos(){
            return platos;
        }
        public int getNumeroMesa(){
            return numeroMesa;
        }
        public void mostrarPedido(){
            System.out.println("Mesa: " + numeroMesa );

            for (Plato plato : platos){
                System.out.println("Plato: " + plato.getNombre() + ", Precio: " + plato.getPrecio() + ", Tiempo de preparación: " + plato.getTiempoPreparacion() + " minutos");
            }
        }

    }


