package capitulo1;

import java.util.Scanner;

public class Soma {

    // método main inicia a execução da aplicação Java
    public static void main(String[] args)
    {
        // cria um Scanner para obter a entrada da janela de comando
        Scanner entrada = new Scanner(System.in);

        int numero1; // primeiro número a somar
        int numero2; // segundo número a somar
        int soma;    // soma de numero1 e numero2

        System.out.print("Digite o primeiro inteiro: "); // solicitação
        numero1 = entrada.nextInt(); // lê o primeiro número do usuário

        System.out.print("Digite o segundo inteiro: "); // solicitação
        numero2 = entrada.nextInt(); // lê o segundo número do usuário

        soma = numero1 + numero2; // soma os números e armazena o total em soma

        System.out.printf("A soma é %d%n", soma); // exibe a soma
    } // fim do método main
} // fim da classe Soma