import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        IO.print("Digite o código da conta: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        IO.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        IO.print("Se tiver um valor inicial a depositar, digite 's', caso contrario digite 'n': ");
        double valor = 0;
        char opcao = sc.next().charAt(0);
        if (opcao == 's') {
            IO.print("Digite o valor inicial: ");
            valor = sc.nextDouble();
        } else if (opcao == 'n') {
            IO.println("Continuando...");
        } else {
            IO.println("Erro!");
        }

        Usuario u = new Usuario(nome, codigo, valor);

        IO.println("");
        IO.println("Dados da Conta: ");
        IO.println(u);

        IO.println("");
        IO.print("Entre com o valor de deposito: ");
        u.setValor(sc.nextDouble());
        u.deposito();

        IO.println("");
        IO.println("Dados da Conta: ");
        IO.println(u);

        IO.println("");
        IO.print("Entre com o valor de saque: ");
        u.setValor(sc.nextDouble());
        u.saque();

        IO.println("");
        IO.println("Dados da Conta: ");
        IO.println(u);

        sc.close();
    }
}