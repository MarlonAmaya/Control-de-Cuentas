package com.proyecto.controldecuentas.model;

import java.util.Date;

public class Partida {
    private Integer id;
    private String partidaNombre;
    private Date fecha;
    private String concepto;
    private Cuenta cuentaRetiro;
    private Cuenta cuentaEntrada;
    private double valorInicialRetiro;
    private double valorInicialEntrada;
    private double cantidadMovimiento;

    public Partida(){

    }
    
    public Partida(Integer id, Date fecha, String concepto, Cuenta cuentaRetiro, Cuenta cuentaEntrada,
            double valorInicialRetiro, double valorInicialEntrada, double cantidadMovimiento) {
        this.id = id;
        this.fecha = fecha;
        this.concepto = concepto;
        this.cuentaRetiro = cuentaRetiro;
        this.cuentaEntrada = cuentaEntrada;
        this.valorInicialRetiro = valorInicialRetiro;
        this.valorInicialEntrada = valorInicialEntrada;
        this.cantidadMovimiento = cantidadMovimiento;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public Cuenta getCuentaRetiro() {
        return cuentaRetiro;
    }
    public void setCuentaRetiro(Cuenta cuentaRetiro) {
        this.cuentaRetiro = cuentaRetiro;
    }
    public Cuenta getCuentaEntrada() {
        return cuentaEntrada;
    }
    public void setCuentaEntrada(Cuenta cuentaEntrada) {
        this.cuentaEntrada = cuentaEntrada;
    }
    public double getValorInicialRetiro() {
        return valorInicialRetiro;
    }
    public void setValorInicialRetiro(double valorInicialRetiro) {
        this.valorInicialRetiro = valorInicialRetiro;
    }
    public double getValorInicialEntrada() {
        return valorInicialEntrada;
    }
    public void setValorInicialEntrada(double valorInicialEntrada) {
        this.valorInicialEntrada = valorInicialEntrada;
    }
    public double getCantidadMovimiento() {
        return cantidadMovimiento;
    }
    public void setCantidadMovimiento(double cantidadMovimiento) {
        this.cantidadMovimiento = cantidadMovimiento;
    }
    public String getPartidaNombre() {
        return partidaNombre;
    }
    public void setPartidaNombre(String nombre) {
        this.partidaNombre = nombre;
    }
}
