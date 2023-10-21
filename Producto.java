//Nombre: Ingrid Nina Alessandra Nájera Marakovits
//Carnet: 231088
//Laboratorio 3, POO
public abstract class Producto { // se crea la clase
    String id; // datos basicos de los produvtos
    String categoria;
    String nombre;
    int disponible;
    int vendidos;
    String estado;
    int precio;

    public Producto(String id, String categoria, String nombre, int disponible, int vendidos, String estado,
            int precio) { // se hace el constructor
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.disponible = disponible;
        this.vendidos = vendidos;
        this.estado = estado;
        this.precio = precio;
    }

}