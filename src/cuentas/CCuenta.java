package cuentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Javier Marcos
 * @version 1.0
 *
 * /**
 * Representa una cuenta bancaria con operaciones simples como ingresar y
 * retirar efectivo.
 *
 */
public class CCuenta {

    /**
     * El nombre del titular de la cuenta.
     */
    private String nombre;
    /**
     * El número de cuenta.
     */
    private String cuenta;
    /**
     * El saldo de la cuenta.
     */
    private double saldo;
    /**
     * El tipo de interes asociado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor por defecto. Inicializa una nueva cuenta bancaria con los
     * valores por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parametros. Inicializa una nueva cuenta bancaria con los
     * valores especificados.
     *
     * @param nom El nombre del titular de la cuenta.
     * @param cue El numero de cuenta.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interes asociado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta bancaria.
     *
     * @return El saldo actual de la cuenta bancaria.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Realiza un ingreso de la cantidad de efectivo indicado en la cuenta
     * bancaria.
     *
     * @param cantidad La cantidad de efectivo a ingresar
     * @throws Exception que lanza si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Realiza una retirada de efectivo por la cantidad indicada de la cuenta
     * bancaria.
     *
     * @param cantidad La cantidad de efectivo a retirar.
     * @throws Exception si la cantidad indicada es negativa o si no hay saldo
     * suficiente en la cuenta bancaria.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    // Getters y setters para encapsulcion.
    /**
     * Devuelve el nombre del titular de la cuenta.
     *
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece/Modifica el nombre del titular de la cuenta.
     *
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el numero de cuenta bancaria.
     *
     * @return La cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece/Modifica el numero de la cuenta bancaria.
     *
     * @param cuenta La cuenta bancaria
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta.
     *
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece/Modifica el saldo de la cuenta.
     *
     * @param saldo El saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés asociado a la cuenta.
     * 
     * @return El tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece/Modifica el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
