
package com.mycompany.actividad2figuras;
import java.util.Locale;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        super(ancho, alto);
    }

    @Override
    public double calcularArea() {
        return (double) ancho * alto / 2;
    }

    @Override
    public double calcularPerimetro() {
        return ancho + alto
                + Math.sqrt((double) ancho * ancho
                + (double) alto * alto);
    }

    @Override
    public String imprimirFigura() {
        return String.format(
                Locale.US,
                "Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",
                alto, ancho, calcularArea(), calcularPerimetro()
        );
    }
}
