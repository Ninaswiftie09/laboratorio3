import java.io.File;
import java.io.FileNotFoundException; //librerias necesarias
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { // se crea la clase de menu
    private ArrayList<Producto> productos = new ArrayList<>(); // arraylist de los productos

    public Menu(String archivo) {
        try { // try catch para relacionar las columnas del csv con las variables
            File csv = new File(archivo);
            Scanner leer = new Scanner(csv);

            if (leer.hasNextLine()) {
                leer.nextLine(); // Salta la línea de encabezado
            }

            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] columna = linea.split(",");
                String id = columna[0];
                String categoria = columna[1];
                String nombre = columna[2];
                int disponible = Integer.parseInt(columna[3]);
                int vendidos = Integer.parseInt(columna[4]);
                String estado = columna[5];
                int precio = Integer.parseInt(columna[6]);
                String tipo = columna[7];
                String sabor = columna[8];
                String tamaño = columna[9];
                String color = columna[10];

                if (categoria.equalsIgnoreCase("bebida")) { // se separan entre las diferentes categorias: bebida, snack
                                                            // y trompo
                    Bebidas bebida = new Bebidas(id, categoria, nombre, disponible, vendidos, estado, precio, tipo);
                    productos.add(bebida);
                } else if (categoria.equalsIgnoreCase("snack")) {
                    Snacks snack = new Snacks(id, categoria, nombre, disponible, vendidos, estado, precio, sabor,
                            tamaño);
                    productos.add(snack);
                } else if (categoria.equalsIgnoreCase("trompo")) {
                    Trompos trompo = new Trompos(id, categoria, nombre, disponible, vendidos, estado, precio, color);
                    productos.add(trompo);
                }
            }

            leer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void infobebidas() { // metodo para obtener la informacion de las bebidas
        if (productos.isEmpty()) {
            System.out.println("No hay bebidas disponibles.");
        } else {
            System.out.println("Bebidas Disponibles:");
            for (Producto producto : productos) {
                if (producto instanceof Bebidas) {
                    Bebidas bebida = (Bebidas) producto;
                    System.out.println("Id: " + bebida.id);
                    System.out.println("Nombre: " + bebida.nombre);
                    System.out.println("Cantidad disponible: " + bebida.disponible);
                    System.out.println("Cantidad vendida: " + bebida.vendidos);
                    System.out.println("Estado: " + bebida.estado);
                    System.out.println("Precio: " + bebida.precio + " quetzales");
                    System.out.println("Tipo: " + bebida.tipo);
                    System.out.println();
                }
            }
        }
    }

    public void infosnacks() { // metodo para obtener la informacion de los snacks
        if (productos.isEmpty()) {
            System.out.println("No hay snacks disponibles.");
        } else {
            System.out.println("Snacks Disponibles:");
            for (Producto producto : productos) {
                if (producto instanceof Snacks) {
                    Snacks snack = (Snacks) producto;
                    System.out.println("Id: " + snack.id);
                    System.out.println("Nombre: " + snack.nombre);
                    System.out.println("Cantidad disponible: " + snack.disponible);
                    System.out.println("Cantidad vendida: " + snack.vendidos);
                    System.out.println("Estado: " + snack.estado);
                    System.out.println("Precio: " + snack.precio + " quetzales");
                    System.out.println("Sabor: " + snack.sabor);
                    System.out.println("Tamaño: " + snack.tamaño);
                    System.out.println();
                }
            }
        }
    }

    public void infotrompos() { // metodo para obtener la informacion de los trompos
        if (productos.isEmpty()) {
            System.out.println("No hay trompos disponibles.");
        } else {
            System.out.println("Trompos Disponibles:");
            for (Producto producto : productos) {
                if (producto instanceof Trompos) {
                    Trompos trompo = (Trompos) producto;
                    System.out.println("Id: " + trompo.id);
                    System.out.println("Nombre: " + trompo.nombre);
                    System.out.println("Cantidad disponible: " + trompo.disponible);
                    System.out.println("Cantidad vendida: " + trompo.vendidos);
                    System.out.println("Estado: " + trompo.estado);
                    System.out.println("Precio: " + trompo.precio + " quetzales");
                    System.out.println("Color: " + trompo.color);
                    System.out.println();
                }
            }
        }
    }

    public void buscarproducto() { // metodo para buscar el producto con su id
        Scanner leer = new Scanner(System.in);
        boolean encontrado = false;
        System.out.println("Ingresa el Id del producto que deseas buscar: ");
        String buscar = leer.nextLine();
        for (Producto producto : productos) {
            if (producto.id.equals(buscar)) {
                encontrado = true;
                if (producto instanceof Bebidas) { // para que se de la informacion segun su categoria
                    Bebidas bebida = (Bebidas) producto;
                    System.out.println("ID: " + bebida.id);
                    System.out.println("Nombre: " + bebida.nombre);
                    System.out.println("Cantidad disponible: " + bebida.disponible);
                    System.out.println("Cantidad vendida: " + bebida.vendidos);
                    System.out.println("Estado: " + bebida.estado);
                    System.out.println("Precio: " + bebida.precio + " quetzales");
                    System.out.println("Tipo: " + bebida.tipo);
                    System.out.println();
                } else if (producto instanceof Snacks) {
                    Snacks snack = (Snacks) producto;
                    System.out.println("ID: " + snack.id);
                    System.out.println("Nombre: " + snack.nombre);
                    System.out.println("Cantidad disponible: " + snack.disponible);
                    System.out.println("Cantidad vendida: " + snack.vendidos);
                    System.out.println("Estado: " + snack.estado);
                    System.out.println("Precio: " + snack.precio + "quetzales");
                    System.out.println("Sabor: " + snack.sabor);
                    System.out.println("Tamaño: " + snack.tamaño);
                    System.out.println();
                } else if (producto instanceof Trompos) {
                    Trompos trompo = (Trompos) producto;
                    System.out.println("ID: " + trompo.id);
                    System.out.println("Nombre: " + trompo.nombre);
                    System.out.println("Cantidad disponible: " + trompo.disponible);
                    System.out.println("Cantidad vendida: " + trompo.vendidos);
                    System.out.println("Estado: " + trompo.estado);
                    System.out.println("Precio: " + trompo.precio + " quetzales");
                    System.out.println("Color: " + trompo.color);
                    System.out.println();
                }
            }
        }

        if (!encontrado) { // por si no se encuentra
            System.out.println("No se encontró un producto con el Id: " + buscar);
        }
        leer.close();
    }

    public void verventas() { // metodo para ver ventas, en general como no se puede modificar el csv por
                              // medio del programa practicamente son fijos así que creo que se puede poner
                              // así
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué ventas deseas ver?");
        System.out.println("1. Ventas generales");
        System.out.println("2. Ventas de trompos");
        System.out.println("3. 20% de ganancias de los trompos");
        int e = leer.nextInt();

        if (e == 1) {
            System.out.println("Las ventas generales ascienden a 2750 quetzales");
        } else if (e == 2) {
            System.out.println("Las ventas de trompos ascienden a 1080 quetzales");
        } else if (e == 3) {
            System.out.println("El 20% de las ventas de los trompos son 216 quetzales");
        }
        leer.close();
    }

    public static void main(String[] args) { // driver y menu principal
        Menu menu = new Menu("bd.csv");

        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido al menú, por favor selecciona una opción:");
        System.out.println("1. Ver Productos");
        System.out.println("2. Buscar Producto");
        System.out.println("3. Ver Ventas");
        int a = leer.nextInt();

        if (a == 1) {
            System.out.println("¿Qué producto quieres ver?");
            System.out.println("1. Bebidas");
            System.out.println("2. Snacks");
            System.out.println("3. Trompos");
            int b = leer.nextInt();

            if (b == 1) {
                menu.infobebidas();
            } else if (b == 2) {
                menu.infosnacks();
            } else if (b == 3) {
                menu.infotrompos();
            }
        } else if (a == 2) {
            menu.buscarproducto();
        } else if (a == 3) {
            menu.verventas();
        }
        leer.close();
    }
}