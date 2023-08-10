package classes;
import classes.Produto;
import classes.Adicional;

public class Pedido {
    private Produto principal;
    private Adicional[] adicionais;
    private boolean status;
    private double valor;
    private static int totalPedidos;

    public Pedido(Produto principal, Adicional[] adicionals) {
        setPrincipal(principal);
        setAdicionals(adicionals);
        this.status = false;
        totalPedidos++;
    }
    public void setPrincipal(Produto principal) {
        if (principal != null) {this.principal = principal;}
    }
    public void setAdicionals(Adicional[] adicionais) {
        if (adicionais != null) {this.adicionais = adicionais;}
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Produto getPrincipal() {
        return this.principal;
    }
    public Adicional[] getAdicionais() {
        return this.adicionais;
    }
    public boolean getStatus() {
        return this.status;
    }
    public double getTotalValor() {
        return this.valor;
    }
    public int getTotalPedidos() {
        return totalPedidos;
    }
}
