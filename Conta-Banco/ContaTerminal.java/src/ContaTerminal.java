import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
     
        double saldo = gerarSaldoAleatorio();
        
      
        scanner.nextLine(); 
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
       
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
      
        scanner.close();
    }
    
  
    public static double gerarSaldoAleatorio() {
        Random rand = new Random();
        return rand.nextDouble() * 10000; // o saldo varia de 0 a 10000
    }
}
