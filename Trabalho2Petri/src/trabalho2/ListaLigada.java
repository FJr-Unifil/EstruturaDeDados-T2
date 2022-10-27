
package trabalho2;

public class ListaLigada<T> {
  private No<T> primeiro;
  private int tamanho;
  private int contador = 0;

  public ListaLigada() {
    primeiro = null;
    tamanho = 0;
  }

  public int getTamanho() {
    return tamanho;
  }

  public void adicionaInicio(T conteudo) {
    No<T> novoNo = new No<T>(null, conteudo, null);
    if (tamanho == 0) {
      primeiro = novoNo;
    } else {
      // aqui a primeira coisa que faço é setar o primeiro como proximo (ele vai virar
      // o segundo)
      novoNo.setProximo(primeiro);
      // depois seto anterior como null (pq não tem nenhum nó antes do primeiro)
      novoNo.setAnterior(null);
      primeiro.setAnterior(novoNo);
      // por fim seto o novoNo pra ser o primeiro
      primeiro = novoNo;
    }
    tamanho++;
  }

  public void adicionaFinal(T conteudo) {
    if (tamanho == 0) {
      No<T> novoNo = new No<T>(null, conteudo, null);
      primeiro = novoNo;
    } else {
      No<T> atual = primeiro;
      while (atual.getProximo() != null) {
        atual = atual.getProximo();
      }
      No<T> novoNo = new No<T>(atual, conteudo, null);
      atual.setProximo(novoNo);
    }
    tamanho++;
  }

  public void removeInicio() {
    if (tamanho == 0) {
      System.out.println("Não é possível remover um elemento que não existe");
    } else if (tamanho == 1){
      primeiro.setProximo(null);
      primeiro.setConteudo(null);
      tamanho--;
      System.out.println("Você removeu o começo da lista.");
    } else {
      No<T> atual = primeiro.getProximo();
      primeiro.setProximo(null);
      primeiro.setConteudo(null);
      atual.setAnterior(null);
      primeiro = atual;
      tamanho--;
      System.out.println("Você removeu o começo da lista.");
    }
  }

  public void removeFinal() {
    if (tamanho == 0) {
      System.out.println("Não é possível remover um elemento que não existe");
    } else if (tamanho == 1) {
      primeiro.setConteudo(null);
      primeiro.setProximo(null);
      tamanho--;
      System.out.println("Você removeu o final da lista");
    } else {
      No<T> atual = primeiro;
      while (atual.getProximo() != null) {
        atual = atual.getProximo();
      }
      No<T> novoUltimo = atual.getAnterior();
      atual.setAnterior(null);
      atual.setConteudo(null);
      novoUltimo.setProximo(null);
      tamanho--;
      System.out.println("Você removeu o final da lista");
    }
  }

  public void mostraNos(int opcao) {
    if (opcao == 6) {
      if (tamanho != 0) {
        No<T> atual = primeiro;
        contador = 0;
        // atual = atual.getProximo();
        while (atual.getProximo() != null) {
          System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
          atual = atual.getProximo();
          contador++;
        }
        System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
      } else {
        System.out.println("Não existe nenhum elemento na lista.");
      }
    } else if (opcao == 7) {
      if (tamanho != 0) {
        No<T> atual = primeiro;
        contador = 0;
        while (atual.getProximo() != null) {
          atual = atual.getProximo();
          contador++;
        }
        while (atual.getAnterior() != null) {
          System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
          atual = atual.getAnterior();
          contador--;
        }
        System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
      } else {
        System.out.println("Não existe nenhum elemento nessa lista");
      }
    }
  }
}