package Console;

import Pratos.Factory.LasanhaFactory;
import Pratos.Factory.NhoqueFactory;
import Pratos.Factory.PizzaFactory;
import Pratos.Factory.PratoFactory;
import Pratos.ModoPreparo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Menu Principal
                System.out.println("=== Menu de Preparação de Pratos ===");
                System.out.println("1. Preparar Pizza");
                System.out.println("2. Preparar Lasanha");
                System.out.println("3. Preparar Nhoque");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                int escolhaPrato = Integer.parseInt(scanner.nextLine());

                if (escolhaPrato == 4) {
                    System.out.println("Encerrando o programa. Até mais!");
                    continuar = false;
                    break;
                }

                // Validação da escolha do prato
                if (escolhaPrato < 1 || escolhaPrato > 3) {
                    System.out.println("Opção inválida, escolha novamente.\n");
                    continue;
                }

                // Menu de Modos de Preparo
                System.out.println("=== Modos de Preparo ===");
                System.out.println("1. Forno a Lenha");
                System.out.println("2. Fogão");
                System.out.print("Escolha o modo de preparo: ");

                int escolhaModoPreparo = Integer.parseInt(scanner.nextLine());

                // Validação do modo de preparo
                ModoPreparo modoPreparo;
                if (escolhaModoPreparo == 1) {
                    modoPreparo = ModoPreparo.FORNO_A_LENHA;
                } else if (escolhaModoPreparo == 2) {
                    modoPreparo = ModoPreparo.FOGAO;
                } else {
                    System.out.println("Opção inválida, escolha novamente.\n");
                    continue;
                }

                // Criação do prato com base na escolha
                PratoFactory pratoFactory;
                switch (escolhaPrato) {
                    case 1:
                        pratoFactory = new PizzaFactory();
                        break;
                    case 2:
                        pratoFactory = new LasanhaFactory();
                        break;
                    case 3:
                        pratoFactory = new NhoqueFactory();
                        break;
                    default:
                        // Esta parte nunca será alcançada devido à validação anterior
                        System.out.println("Opção inválida, escolha novamente.\n");
                        continue;
                }

                // Preparo do prato
                pratoFactory.prepararPrato(modoPreparo);
                System.out.println("Prato preparado com sucesso!\n");

            } catch (NumberFormatException e) {
                // Trata entradas não numéricas
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.\n");
            } catch (Exception e) {
                // Trata qualquer outro erro inesperado
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
