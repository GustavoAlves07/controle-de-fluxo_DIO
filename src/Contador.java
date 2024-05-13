import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro valor");

        int userInputOne = scanner.nextInt();

        System.out.println("Digite o segundo valor");

        int userInputTwo = scanner.nextInt();


        try {
            contadorIteracoes(userInputOne, userInputTwo);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Ocorreu um erro em sua função " + e);
        }


    }

    static void contadorIteracoes(int firstNumber, int secondNumber) throws ParametrosInvalidosException {
        if (firstNumber < secondNumber) {
           throw  new ParametrosInvalidosException();
        } else {


            int contador = 0;
            int contagemTotal = firstNumber - secondNumber;

            while (contador != contagemTotal) {
                contador++;

                System.out.println("Imprimindo o numero " + contador);


            }
        }
    }


}