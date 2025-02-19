// Clase base Persona
class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

// Clase derivada Estudiante
class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}

// Clase derivada Profesor
class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}
