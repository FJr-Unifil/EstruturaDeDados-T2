package trabalho2;

import java.util.Scanner;

public class Executor {

  public static void limpaTela() {
    for (int i = 0; i < 5; i++) {
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int opcao;
    int numeroAdicionado;

    Scanner ler = new Scanner(System.in);

    ListaLigada listaLigada = new ListaLigada();

    do {
      System.out.println("+ -------------------------------------------------------------------- +");
      System.out.println("| Olá! Bem-vindo ao menu do trabalho do Fernando. Espero que goste     |");
      System.out.println("| Escolha uma opção:                                                   |");
      System.out.println("| 1 - Adicionar inicio                                                 |");
      System.out.println("| 2 - Adicionar final                                                  |");
      System.out.println("| 3 - Mostrar tamanho da lista                                         |");
      System.out.println("| 4 - Remover inicio                                                   |");
      System.out.println("| 5 - Remover final                                                    |");
      System.out.println("| 6 - Mostrar nos crescente                                            |");
      System.out.println("| 7 - Mostrar nos decrescente                                          |");
      System.out.println("| 9 - Finalizar sessão                                                 |");
      System.out.println("+ -------------------------------------------------------------------- +");
      opcao = ler.nextInt();
      limpaTela();

      switch (opcao) {
        case 1:
          System.out.println("Digite um número que deseja adicionar no inicio: ");
          numeroAdicionado = ler.nextInt();
          listaLigada.adicionaInicio(numeroAdicionado);
          break;

        case 2:
          System.out.println("Digite um número que deseja adicionar no final: ");
          numeroAdicionado = ler.nextInt();
          listaLigada.adicionaFinal(numeroAdicionado);
          break;

        case 3:
          if (listaLigada.getTamanho() == 0) {
            System.out.println("Não existe nenhum nó nessa lista. Tamanho = " + listaLigada.getTamanho());
          } else if (listaLigada.getTamanho() == 1) {
            System.out.println("O tamanho da lista é de: " + listaLigada.getTamanho() + " nó.");
          } else {
            System.out.println("O tamanho da lista é de: " + listaLigada.getTamanho() + " nós.");
          }
          break;

        case 4:
          listaLigada.removeInicio();
          break;

        case 5:
          listaLigada.removeFinal();
          break;

        case 6:
          listaLigada.mostraNos(opcao);
          break;

        case 7:
          listaLigada.mostraNos(opcao);
          break;

        case 9:
          System.out.println("Obrigado pela visita.");
          break;

        default:
          System.out.println("Opção inserida inválida. Favor digite novamente");
          break;

      }
    } while (opcao != 9);
    ler.close();
  }

}