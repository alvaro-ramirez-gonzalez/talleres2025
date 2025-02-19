class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorro";
    }

    // Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número de Cuenta=" + numeroCuenta + ", Saldo=" + saldo + ", Tipo de Cuenta=" + tipoCuenta + "]";
    }
}
