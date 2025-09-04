package encapsulacion;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String comprador;
    private double valorTotal;
    private List<Item> items;

    public Pedido(String comprador){
        if (comprador == null || comprador.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío.");
        }
        this.comprador = comprador;
        this.items = new ArrayList<>();
        this.valorTotal = 0.0;
    }
    //Metodo para agregar items y recalcular el total
    // Encapsulación con validaciones
    public void agregarItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("El item no puede ser nulo.");
        }
        this.items.add(item);
        this.valorTotal += item.getValor();
    }
    // Metodo qu espone el reusltado , no el calculo interno

    public String getComprador() { return comprador; }
    public double getValorTotal() { return valorTotal; }
    public List<Item> getItems(){ return List.copyOf(items);    }

    /*public void setComprador(String comprador) { this.comprador = comprador; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
    public void agrega(Item item){
        if (item.getValor() < 1000) this.valorTotal += item.getValor();
        else this.valorTotal += item.getValor() *0.95;
    }*/
}