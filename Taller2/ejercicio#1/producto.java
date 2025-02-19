public class producto {

private String nombre;
private double precio;


//Contructor con parametros 

public producto(String nombre, double precio){

this.nombre = nombre;
this.precio= precio;
    
}

 //Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Precio del producto: " + this.precio);
    }

    // Métodos de acceso (getters)
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        producto producto = new producto("Laptop", 1200.50);
        producto.mostrarProducto();
    }
}


