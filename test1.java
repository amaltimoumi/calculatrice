import java.util.Scanner;
public class test1 {
public static void main(String[] args) {
try (Scanner Scanner = new Scanner(System.in)) {
    double a, b;
    String operation;
    double resultat;
   
    System.out.println("Entrez le premier nombre :");
    a = Scanner.nextDouble();
   
    System.out.println("Entrez le deuxieme nombre :");
    b = Scanner.nextDouble();
   
    System.out.println("Entrez l'operation a effectuer (+, -, *, /) :");
    operation = Scanner.next();
   
    switch (operation) {
        case "+":
            resultat = calculatrice.addition(a, b);
            break;
        case "-":
            resultat = calculatrice.soustraction(a, b);
            break;
        case "*":
            resultat = calculatrice.multiplication(a, b);
            break;
        case "/":
            try {
                resultat = calculatrice.division(a, b);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                return;
            }
            break;
        default:
            System.out.println("Operation invalide.");
            return;
    }
   
    System.out.println("Resultat : " + resultat);
}
        }
    }

       


