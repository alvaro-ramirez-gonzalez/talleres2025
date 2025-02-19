// Ejemplo de sobrescritura incorrecta
class Animal {
    // Método en la clase base
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase derivada con firma incorrecta
class Perro extends Animal {
    // Intento de sobrescritura con firma incorrecta
    // public void hacerSonido(String sonido) {  // Esto causa error de compilación
    //     System.out.println("El perro hace un sonido: " + sonido);
    // }

    // Sobrescritura correcta sin parámetros
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace un ladrido.");
    }
}

// Sobrescritura sin @Override
class Gato extends Animal {
    public void hacerSonido() {
        // Aunque funciona, no es correcto y no se ve claramente que es una sobrescritura
        System.out.println("El gato hace un maullido.");
    }
}

// Clase de prueba
public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Perro p = new Perro();
        Gato g = new Gato();
        
        // Usamos los métodos
        a.hacerSonido();  // "El animal hace un sonido."
        p.hacerSonido();  // "El perro hace un ladrido."
        g.hacerSonido();  // "El gato hace un maullido."
    }
}
