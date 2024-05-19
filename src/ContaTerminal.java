import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

Scanner Input = new Scanner(System.in);

int numeroConta; 
String agencia;
String nomeDoCliente;
double saldo;

System.out.println("Insira o número da sua conta:");
numeroConta = Input.nextInt();

System.out.printf("Por favor, digite o número da Agência:");
agencia = Input.next();

System.out.print("Digite seu nome:");
nomeDoCliente = Input.next();

System.out.println("Saldo:");
saldo = Input.nextDouble();

System.out.println(ImprimirQuestionario ( nomeDoCliente, agencia, numeroConta, saldo));
    }

    public static String ImprimirQuestionario (String nomeDoCliente, String agencia, int numeroConta , double saldo  ) {
String Menssagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque", nomeDoCliente,agencia, numeroConta, saldo);
return Menssagem;
    }
}