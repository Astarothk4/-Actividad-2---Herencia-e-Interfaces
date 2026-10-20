
package com.mycompany.actividad2figuras;
import java.util.Locale;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimirFigura() {
        return String.format(
                Locale.US,
                "Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f",
                radio, calcularArea(), calcularPerimetro()
        );
    }
}
