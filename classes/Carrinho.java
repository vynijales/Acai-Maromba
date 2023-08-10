package classes;
import java.time.LocalDate;

import classes.Cliente;
import classes.Pedido;

public class Carrinho {
    private Cliente cliente;
    private Pedido[] pedidos;
    private Adicional[] adicionais;
    private double valorTotal;
    private LocalDate data;
    private boolean status;

    public Carrinho(Cliente cliente, Pedido[] pedidos, Adicional[] adicionais, double valorTotal, LocalDate data, boolean status) {
    }
    public void setCliente(Cliente cliente) {
        if (cliente != null) {this.cliente = cliente;}
    }
    public void setPedidos(Pedido[] pedidos) {
        if (pedidos != null) {this.pedidos = pedidos;} 
    }
    public void setAdicionais(Adicional[] adicionais) {
        if (adicionais != null) {this.adicionais = adicionais;} 
    }
    public void setValorTotal(double valorTotal) {
        if (valorTotal >= 0.00) {this.valorTotal = valorTotal;}     
    }
    public void setData(LocalDate data) {
        this.data = data; // Não sei como manipular data ainda, portanto não colocarei condicionais
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    public Pedido[] getPedidos() {
        return this.pedidos;
    }
    public Adicional[] getAdicionais() {
        return this.adicionais;
    }
    public double getValorTotal() {
        return this.valorTotal;
    }
    public LocalDate getDate() {
        return this.data;
    }
    public boolean getStatus() {
        return this.status;
    }

}
