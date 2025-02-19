public class CuentaBancaria {
    // Propiedad privada: numeroCuenta
    private String numeroCuenta;
    
    // Propiedad privada: saldo
    private double saldo;
    
    // Propiedad pública: tipoCuenta
    public String tipoCuenta;

    // Método getter y setter para saldo
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo.");
        } else {
            this.saldo = saldo;
        }
    }
    
    // Método para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
    
    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }
}

