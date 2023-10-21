class Trompos extends Producto { // se crea la clase con herencia a productos
    String color; // dato basico de la categoria

    public Trompos(String id, String categoria, String nombre, int disponible, int vendidos, String estado, int precio,
            String color) {
        super(id, categoria, nombre, disponible, vendidos, estado, precio); // se llama al constructor
        this.color = color;
    }
}
