/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoalcancia;

public class Main {
    public static void main(String[] args) {
        //hace que compile haciendo visible la ventana
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlcancia().setVisible(true);
            }
        });
    }
}
