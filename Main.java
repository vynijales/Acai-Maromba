import classes.Cliente;

public class Main{

    public static void print(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Cliente matheus = new Cliente("Matheus", "Juvenal Lamartine", "70052605469");
        
        print(matheus.getNome());
        print(matheus.getCpf());
        print(matheus.getEndereco());

        matheus.setCPF("70052605467");
        matheus.setNome("Ma");
        matheus.setEndereco("Rua Juvenal Lamartine, 1587");

        print(matheus.getNome());
        print(matheus.getCpf());
        print(matheus.getEndereco());

        System.out.println(Cliente.getTotalClientes());
    }
}