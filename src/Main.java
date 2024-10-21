import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Rectangulo[] rectangulos = new Rectangulo[3];
        Circulo[] circulos = new Circulo[3];
        Triangulo[] triangulos = new Triangulo[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa los datos para el Rectángulo " + (i + 1) + ":");
            System.out.print("Base: ");
            double baseRect = scanner.nextDouble();
            System.out.print("Altura: ");
            double alturaRect = scanner.nextDouble();
            rectangulos[i] = new Rectangulo(baseRect, alturaRect);
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa los datos para el Círculo " + (i + 1) + ":");
            System.out.print("Radio: ");
            double radio = scanner.nextDouble();
            circulos[i] = new Circulo(radio);
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa los datos para el Triángulo " + (i + 1) + ":");
            System.out.print("Base: ");
            double baseTri = scanner.nextDouble();
            System.out.print("Altura: ");
            double alturaTri = scanner.nextDouble();
            System.out.print("Lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Lado 3: ");
            double lado3 = scanner.nextDouble();
            triangulos[i] = new Triangulo(baseTri, alturaTri, lado1, lado2, lado3);
        }


        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\nSelecciona una figura para mostrar resultados:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Círculo");
            System.out.println("3. Triángulo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarFiguras(rectangulos, "Rectángulo");
                    break;
                case 2:
                    mostrarFiguras(circulos, "Círculo");
                    break;
                case 3:
                    mostrarFiguras(triangulos, "Triángulo");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opción no es válida.");
            }
        }

        scanner.close();
    }


    public static void mostrarFiguras(Figura[] figuras, String nombreFigura) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelecciona el número del " + nombreFigura + " a mostrar (1-3):");
        int numFigura = scanner.nextInt();

        if (numFigura >= 1 && numFigura <= 3) {
            System.out.println(figuras[numFigura - 1].toString());
        } else {
            System.out.println("El número no es válido.");
        }
    }
}