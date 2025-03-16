import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private int agencia;
    private String nomeCliente;
    private double saldo;


    public void solicitarDados() {
        Scanner scanner = new Scanner(System.in);


        numero = solicitarNumeroInteiro("Digite o número da conta: ", scanner);


        agencia = solicitarAgencia("Digite o número da agência: ", scanner);


        boolean nomeValido = false;
        while (!nomeValido) {
            System.out.print("Digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();


            if (nomeCliente.matches("[a-zA-ZáéíóúÁÉÍÓÚãõâêîôûàèìòùçÇ\\s]+")) {
                nomeValido = true;
            } else {
                System.out.println("Nome inválido! Por favor, insira apenas letras e espaços.");
            }
        }


        saldo = solicitarNumeroDecimal("Digite o saldo inicial da conta: ", scanner);
    }


    private int solicitarNumeroInteiro(String mensagem, Scanner scanner) {
        int numero = 0;
        boolean numeroValido = false;

        while (!numeroValido) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                scanner.nextLine();
                numeroValido = true;
            } else {
                System.out.println("Entrada inválida! Por favor, insira o número correto.");
                scanner.next();
            }
        }
        return numero;
    }


    private double solicitarNumeroDecimal(String mensagem, Scanner scanner) {
        double numero = 0;
        boolean numeroValido = false;

        while (!numeroValido) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                scanner.nextLine();
                numeroValido = true;
            } else {
                System.out.println("Entrada inválida! Por favor, insira o número correto.");
                scanner.next();
            }
        }
        return numero;
    }


    private int solicitarAgencia(String mensagem, Scanner scanner) {
        int agencia = 0;
        boolean agenciaValida = false;

        while (!agenciaValida) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                agencia = scanner.nextInt();
                scanner.nextLine();
                agenciaValida = true;
            } else {
                System.out.println("Entrada inválida! A agência deve conter apenas números.");
                scanner.next();
            }
        }
        return agencia;
    }


    public void exibirDados() {
        System.out.println("\n--- Dados da Conta ---");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);
    }


    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        conta.solicitarDados();
        conta.exibirDados();


        System.out.println("\nConta criada com sucesso!");
    }
}