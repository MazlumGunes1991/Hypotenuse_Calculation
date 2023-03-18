import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int verticalEdge1,verticalEdge2;
        double hypotenuseEdge;

        System.out.print("1. Enter the perpendicular value: ");
        verticalEdge1 = input.nextInt();

        System.out.print("2. Enter the perpendicular value:");
        verticalEdge2 = input.nextInt();

        hypotenuseEdge = Math.sqrt(Math.pow(verticalEdge1,2) + Math.pow(verticalEdge2,2));
        System.out.println("Hypotenuse value: " + hypotenuseEdge);
    }
}