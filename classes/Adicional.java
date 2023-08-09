package classes;

import java.lang.reflect.Array;

public class Adicional {
    private String nome;
    private int quantidade;
    private double valor;
    private static int totalAdicionais;
    private static Adicional[] adicionais;

    public Adicional() {
        setNome(nome);
        setQuantidade(quantidade);
        setValor(valor);
        totalAdicionais++;
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
    public int getTotalAdicionais(){
        return totalAdicionais;
    }
    public static int listarAdicionais(){
        return Array.getLength(Adicional.adicionais); // Provisório
    }
}
