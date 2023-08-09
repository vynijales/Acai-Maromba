package classes;
import classes.Produto;
import classes.Adicional;

public class Pedido {
    private Produto principal;
    private Adicional[] adicionais;
    private boolean status;
    private double valor;

    public Pedido(Produto principal, Adicional[] adicionals) {
        setPrincipal(principal);
        setAdicionals(adicionals);
        this.status = false;
    }
    public void setPrincipal(Produto principal) {
        this.principal = principal;
    }
    public void setAdicionals(Adicional[] adicionais) {
        this.adicionais = adicionais;
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
}
