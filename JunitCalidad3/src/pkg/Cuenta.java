package pkg;

public class Cuenta {
    private int numero;
    private int saldo;

    public Cuenta(int numero, int saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void ingresar(int cantidad) {
        if (cantidad > 0)
            saldo += cantidad;
    }
    public boolean reintegrar(int cantidad) {
        if (saldo - cantidad <= -500) {
            System.out.println("Fondos insuficientes (saldo " + saldo + "€) en la cuenta " + numero + " para el reintegro de " + cantidad + "€");
            return false;
        }
        saldo -= cantidad;
        return true;
    }
}
