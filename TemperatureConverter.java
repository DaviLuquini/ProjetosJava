import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double temperature, convertedTemperature;
            char choice;

            System.out.println("Conversor de Temperatura\n");

            System.out.println("Digite a temperatura:");
            temperature = input.nextDouble();

            System.out.println("Digite 'C' para Celsius ou 'F' para Fahrenheit:");
            choice = input.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'c':
                    convertedTemperature = (temperature * 9/5) + 32;
                    System.out.println("A temperatura em Fahrenheit é: " + convertedTemperature);
                    break;
                case 'f':
                    convertedTemperature = (temperature - 32) * 5/9;
                    System.out.println("A temperatura em Celsius é: " + convertedTemperature);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
            input.close();
        }
    }
