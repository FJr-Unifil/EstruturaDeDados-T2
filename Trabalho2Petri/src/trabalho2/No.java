package trabalho2;

public class No<T>{
    private T conteudo;
    private No<T> proximo;
    private No<T> anterior;

    public No(No<T> anterior, T conteudo, No<T> proximo) {
    	this.anterior = anterior;
        this.conteudo = conteudo;
        this.proximo = proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    public No<T> getAnterior() {
    	return anterior;
    }
    
    public void setAnterior(No<T> anterior) {
    	this.anterior = anterior;
    }
    
}