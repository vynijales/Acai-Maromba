import classes.Cliente;
import classes.Funcionario;

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
        print("=======================================");

        Funcionario funcionario1 = new Funcionario("Pedro", "700.526.054-69", "12345678", false);
        print(funcionario1.getNome());
        print(funcionario1.getCpf());
        print(funcionario1.getSenha());
        print(Boolean.toString(funcionario1.getIsAdmin()));
    }
}