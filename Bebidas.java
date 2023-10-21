class Bebidas extends Producto { // se crea la clase con herencia de producto
    String tipo; // dato basico de la categoria

    public Bebidas(String id, String categoria, String nombre, int disponible, int vendidos, String estado, int precio,
            String tipo) { // se hace el constructor
        super(id, categoria, nombre, disponible, vendidos, estado, precio);
        this.tipo = tipo;
    }

}
