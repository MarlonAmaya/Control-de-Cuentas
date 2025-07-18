package com.proyecto.controldecuentas.model;

public class Cuenta {
    private Integer id;
    private String codigo;
    private String cuentaNombre;
    private double saldo = 0;
    private Cuenta cuentaPadre = null;

    public Cuenta(){

    }

    public Cuenta(Integer id, String codigo, String nombre, double saldo, Cuenta cuentaPadre){
        this.id = id;
        this.codigo = codigo;
        this.cuentaNombre = nombre;
        this.saldo = saldo;
        this.cuentaPadre = cuentaPadre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCuentaNombre() {
        return cuentaNombre;
    }

    public void setCuentaNombre(String nombre) {
        this.cuentaNombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta getCuentaPadre() {
        return cuentaPadre;
    }

    public void setCuentaPadre(Cuenta cuentaPadre) {
        this.cuentaPadre = cuentaPadre;
    }
}
