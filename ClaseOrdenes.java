package encapsulacion;

public class ClaseOrdenes {

    public static void main(String[] args) {
        try {
            Pedido pedido = new Pedido("Luis");

            pedido.agregarItem(new Item("Manzanas", 10.5));
            pedido.agregarItem(new Item("Naranjas", 8.0));
            pedido.agregarItem(new Item("Peras", 12.0));

            // Intento de agregar item inválido
            pedido.agregarItem(new Item("Fruta inválida", -5.0));

            System.out.println("Cliente: " + pedido.getComprador());
            System.out.println("Total del pedido: " + pedido.getValorTotal());

        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

}
