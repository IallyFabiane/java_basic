package com.geometria.quadrilateros.quadrado;

public class Quadrado {

    double lado;

    public Quadrado (double lado) {
        this.lado = lado;
    }

    public double areaQuadrado () {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}' + " Área: "+
                areaQuadrado()
                ;
    }
}
