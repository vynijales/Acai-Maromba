package classes;

import java.lang.reflect.Array;

public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    private static int totalProdutos;
    private static Produto[] produtos;

    public Produto(String nome, int quantidade, double valor) {
        setNome(nome);
        setQuantidade(quantidade);
        setValor(valor);
        totalProdutos++;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 3) {
            this.nome = nome;
        }
    }
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }
    public void setValor(double valor) {
        if (valor >= 0.00) {
            this.valor = valor;
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public double getValor() {
        return this.valor;
    }
    public static int getTotalProdutos(){
        return totalProdutos;
    }
    public static int listarProdutos(){
        return Array.getLength(Produto.produtos); // Provisório
    }
}
