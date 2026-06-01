import java.util.Scanner;

public class lista8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== ALGPROG - LISTA 08 =====");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exercicio1(scanner);
                    break;
                case 2:
                    exercicio2(scanner);
                    break;
                case 3:
                    exercicio3(scanner);
                    break;
                case 4:
                    exercicio4(scanner);
                    break;
                case 5:
                    exercicio5(scanner);
                    break;
                case 6:
                    exercicio6(scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Exercício 1
    public static void exercicio1(Scanner scanner) {
        System.out.print("Informe um valor para n: ");
        int n = scanner.nextInt();

        imprimirMesmoNumero(n);
    }

    public static void imprimirMesmoNumero(int n) {
        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(linha + " ");
            }
            System.out.println();
        }
    }

    // Exercício 2
    public static void exercicio2(Scanner scanner) {
        System.out.print("Informe um valor para n: ");
        int n = scanner.nextInt();

        imprimirSequencia(n);
    }

    public static void imprimirSequencia(int n) {
        for (int linha = 1; linha <= n; linha++) {
            for (int numero = 1; numero <= linha; numero++) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }

    // Exercício 3
    public static void exercicio3(Scanner scanner) {
        System.out.print("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double resultado = somarTresNumeros(numero1, numero2, numero3);

        System.out.println("A soma dos três números é: " + resultado);
    }

    public static double somarTresNumeros(double numero1, double numero2, double numero3) {
        return numero1 + numero2 + numero3;
    }

    // Exercício 4
    public static void exercicio4(Scanner scanner) {
        System.out.print("Informe um número: ");
        double numero = scanner.nextDouble();

        char resultado = verificarNumero(numero);

        System.out.println("Resultado: " + resultado);
    }

    public static char verificarNumero(double numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    // Exercício 5
    public static void exercicio5(Scanner scanner) {
        System.out.print("Informe a taxa de imposto em porcentagem: ");
        double taxaImposto = scanner.nextDouble();

        System.out.print("Informe o custo do item: ");
        double custo = scanner.nextDouble();

        double valorFinal = somaImposto(taxaImposto, custo);

        System.out.println("Valor com imposto: R$ " + valorFinal);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }

    // Exercício 6
    public static void exercicio6(Scanner scanner) {
        char repetir;

        do {
            System.out.print("Informe a hora no formato 24 horas: ");
            int hora = scanner.nextInt();

            System.out.print("Informe os minutos: ");
            int minutos = scanner.nextInt();

            if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
                System.out.println("Horário inválido.");
            } else {
                char periodo = identificarPeriodo(hora);
                int horaConvertida = converterHora(hora);

                mostrarHoraConvertida(horaConvertida, minutos, periodo);
            }

            System.out.print("Deseja converter outro horário? (S/N): ");
            repetir = scanner.next().charAt(0);

        } while (repetir == 'S' || repetir == 's');
    }

    public static int converterHora(int hora) {
        if (hora == 0) {
            return 12;
        } else if (hora > 12) {
            return hora - 12;
        } else {
            return hora;
        }
    }

    public static char identificarPeriodo(int hora) {
        if (hora < 12) {
            return 'A';
        } else {
            return 'P';
        }
    }

    public static void mostrarHoraConvertida(int hora, int minutos, char periodo) {
        System.out.print("Horário convertido: ");
        System.out.print(hora + ":");

        if (minutos < 10) {
            System.out.print("0" + minutos);
        } else {
            System.out.print(minutos);
        }

        if (periodo == 'A') {
            System.out.println(" A.M.");
        } else {
            System.out.println(" P.M.");
        }
    }
}