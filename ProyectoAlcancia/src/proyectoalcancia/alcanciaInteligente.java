/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoalcancia;

//se aplico herencia indicando que extiende a la clase base
public class alcanciaInteligente extends cuentaBancaria {
    private double metaAhorro; 

    public alcanciaInteligente(String titular, double saldoInicial, double metaAhorro) {
        super(titular, saldoInicial); // Llama al constructor de la clase padre
        this.metaAhorro = metaAhorro;
    }

    public double getMetaAhorro() { return metaAhorro; }
    public void setMetaAhorro(double meta) { this.metaAhorro = meta; }

    //metodo de comparacion
    public String revisarProgreso() {
        if (saldo >= metaAhorro) {
            return "¡Felicidades! Meta alcanzada.";
        }
        return "Faltan $" + (metaAhorro - saldo) + " para la meta.";
    }
    //metodo recursivo
    public int calcularDiasFaltantes(double saldoActual, double ahorroDiario) {
        if (saldoActual >= metaAhorro) {
            return 0; // Caso base: ya se alcanzó la meta
        }
        //condicion de avance, suma 1 día y vuelve a llamar al método
        return 1 + calcularDiasFaltantes(saldoActual + ahorroDiario, ahorroDiario);
    }
}