package cuentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Javier Marcos Marcos
 * @version 1.0
 *
 * Clase que representa el punto de entrada la aplicacion. Contiene el método
 * main que ejecuta el programa.
 *
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2300);
    }

    /**
     * Realiza la operativa en la cuenta, ingreso y retirada de efectivo.
     *
     * @param cantidad La cantidad de dinero con la que se va a operar en la
     * cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        /**
         * Representa la cuenta bancaria sobre la que realizar las operaciones.
         */

        CCuenta cuenta1;

        /**
         * Representa el saldo actual de la cuenta.
         */
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
            /**
             * Manejo de la excepcion que ocurre durante la operación.
             *
             * @param e La excepción que lanza.
             */
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            /**
             * Manejo de la excepcion que ocurre durante la operación.
             *
             * @param e La excepción que lanza.
             */
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

}
