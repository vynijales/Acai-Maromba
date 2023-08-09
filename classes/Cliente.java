package classes;

import java.lang.reflect.Array;

public class Cliente{
    private String nome;
    private String endereco;
    private String cpf;
    private static int totalClientes;
    private static Cliente[] clientes;

    public Cliente(String nome, String endereco, String cpf) {
        setNome(nome);
        setEndereco(endereco);
        setCPF(cpf);
        totalClientes++;
    }
    public void setNome(String nome) {
        if (nome != null && nome.length() >= 3) {
            this.nome = nome;
        }
    }
    public void setCPF(String cpf) {
        if (cpf != null && (cpf.length() == 14 || cpf.length() == 11)) {
            this.cpf = cpf;
        }
    }
    public void setEndereco(String endereco) {
        if (endereco != null && endereco.length() >= 5) {
            this.endereco = endereco;
        } 
    }
    
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public static int getTotalClientes() {
        return totalClientes;
    }; 
    public static int listarClientes(){
        return Array.getLength(Cliente.clientes); // Provisório
    }
}
