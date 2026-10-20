package com.mycompany.actividad2figuras;

public class Actividad2Figuras {

    public static void main(String[] args) {
        Figura2D figura = new TrianguloRect(3, 4);
        System.out.println(figura.imprimirFigura());

        System.out.println();

        figura = new Circulo(3);
        System.out.println(figura.imprimirFigura());
    }
}