
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner(System.in)) {
            String nome;
            String agencia;
            int numConta;
            double saldo;

            System.out.print("Digite seu nome: ");
            nome = ler.nextLine();
            System.out.print("Digite a agência: ");
            agencia = ler.nextLine();
            System.out.print("Digite o número da conta: ");
            numConta = ler.nextInt();
            System.out.print("Digite seu saldo: ");
            saldo = ler.nextDouble();

            System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta+ ", e seu saldo de R$ " + saldo + " já está disponível para saque");
        }


    }
}
