// Clase Vehiculo
class Vehiculo {
    // Método moverse en la clase Vehiculo
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase Bicicleta derivada de Vehiculo
class Bicicleta extends Vehiculo {
    // Sobrescritura del método moverse en la clase Bicicleta
    @Override
    public void moverse() {
        System.out.println("La bicicleta está pedaleando.");
    }
}

// Clase de prueba
 class TestVehiculo {
    public static void main(String[] args) {
        // Instanciando objetos de cada clase
        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();

        // Demostrando la sobrescritura de métodos
        vehiculo.moverse(); // Imprime: El vehículo se está moviendo.
        bicicleta.moverse(); // Imprime: La bicicleta está pedaleando.
    }
}
