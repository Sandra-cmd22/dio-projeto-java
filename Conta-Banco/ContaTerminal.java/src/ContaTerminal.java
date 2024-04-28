import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        // Solicita ao usuário que insira o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // Gerando um saldo para a nova conta
        double saldo = gerarSaldoAleatorio();
        
        // Limpando o scanner
        scanner.nextLine(); 
        
        // Aqui pede pro usuario inserie os dados da conta
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        // Exibe uma mensagem de recepção
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fecha o Scanner 
        scanner.close();
    }
    
    // Gera um saldo aleatório
    public static double gerarSaldoAleatorio() {
        Random rand = new Random();
        return rand.nextDouble() * 10000; // o saldo varia de 0 a 10000
    }
}
