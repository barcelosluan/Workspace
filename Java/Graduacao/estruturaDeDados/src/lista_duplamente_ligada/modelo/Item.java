package lista_duplamente_ligada.modelo;

public class Item {

    private String nome;
    private int quantidade;

    public Item(String nome) {
        this.nome = nome;
        quantidade = 0;
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
