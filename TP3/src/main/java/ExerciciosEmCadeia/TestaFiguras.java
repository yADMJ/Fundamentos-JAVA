package ExerciciosEmCadeia;

public class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 3.0;

        Esfera esfera = new Esfera();
        esfera.raio = 5.0;


        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Volume da esfera: " + esfera.calcularVolume());
    }
}

