
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int agencyNumber;
        String accountNumber, clientName, customerLastName;
        double balance;

        System.out.println("Olá, bem vindo ao banco FelpsBrands!");
        System.out.println("Para acessar sua conta criada em nosso banco, preciso que você insira dados como:");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("NÚMERO DA AGÊNCIA\nNÚMERO DA CONTA\nNOME\nSOBRENOME\nSALDO ATUAL da sua conta.");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("\nVamos começar a coletar seus dados.\n\nDigite seu nome.");
        System.out.print("SEU PRIMEIRO NOME: ");
        clientName = input.next();

        System.out.println("\nDigite seu sobrenome.");
        System.out.print("SEU SOBRENOME: ");
        input.nextLine();
        customerLastName = input.nextLine();

        System.out.print("\nDigite o número da agência.\nNÚMERO DA AGÊNCIA: ");
        agencyNumber = input.nextInt();

        System.out.print("\nAgora, digite o número da conta.\nNÚMERO DA CONTA: ");
        accountNumber = input.next();

        System.out.print("\nDigite o saldo atual da sua conta.\nSALDO ATUAL: ");
        balance = input.nextDouble();


        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("\nCarregando...\n");
        System.out.println("-------------------------------------------------------------------------------");

        System.out.printf("\nOlá %s %s, obrigado por criar uma conta no banco FelpsBrands!\n", clientName, customerLastName);
        System.out.printf("sua agência é %d, conta %s, e saldo atual da sua conta é de R$ %.2f,que já está disponivel para saque.\n", agencyNumber, accountNumber, balance);

        System.out.printf("\nMuito obrigado %s %s! Seu login está finalizado.\n", clientName, customerLastName);


    }
}