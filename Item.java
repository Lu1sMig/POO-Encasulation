package encapsulacion;

public class Item {
    private String nombre;
    private double valor;

    public Item(String nombre, double valor){
        //valida que nombre no sea vacio y que valor sea positivo
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del item no puede estar vacío.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("El precio del item debe ser mayor que cero.");
        }
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() { return nombre; }
    public double getValor() { return valor;  }
}
