import java.util.Scanner;

public class AgeValidity {
    public static void main(String[] args) {
        // Declare a variável booleana
        boolean drivingUnderAge = false;
        
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Peça ao usuário para inserir sua idade
        System.out.print("Por favor, informe sua idade: ");
        int idade = scanner.nextInt();
        
        // Verifique se a idade inserida é menor ou igual a 18
        if (idade <= 18) {
            drivingUnderAge = true;
        }
        
        // Imprima o valor de drivingUnderAge
        System.out.println("Driving under age: " + drivingUnderAge);
        
        // Feche o Scanner
        scanner.close();
    }
}