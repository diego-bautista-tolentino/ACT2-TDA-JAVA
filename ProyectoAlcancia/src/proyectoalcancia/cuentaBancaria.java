/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoalcancia;

public abstract class cuentaBancaria {
    protected String titular;
    protected double saldo;

    public cuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double cantidad) {
        if (cantidad > 0) saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) saldo -= cantidad;
    }
}