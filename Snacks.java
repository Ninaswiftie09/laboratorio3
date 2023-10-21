class Snacks extends Producto { // se crea la clase con herencia de producto
    String sabor; // datos basicos de la categoria
    String tamaño;

    public Snacks(String id, String categoria, String nombre, int disponible, int vendidos, String estado, int precio,
            String sabor, String tamaño) { // se crea y llama al constructor
        super(id, categoria, nombre, disponible, vendidos, estado, precio);
        this.sabor = sabor;
        this.tamaño = tamaño;
    }
}