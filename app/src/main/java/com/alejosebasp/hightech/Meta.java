package com.alejosebasp.hightech;

public class Meta {

    private int id_img;
    private String nombre;
    private double valor1, valor2;
    private int avance;

    public Meta(int id_img, String nombre, double valor1, double valor2, int avance) {
        this.id_img = id_img;
        this.nombre = nombre;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.avance = avance;
    }

    public int getId_img() {
        return id_img;
    }

    public void setId_img(int id_img) {
        this.id_img = id_img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }
}
