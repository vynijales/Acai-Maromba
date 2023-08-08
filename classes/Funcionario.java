package classes;
class Funcionario {
    private String nome;
    private String cpf;
    private String senha;
    private boolean isAdmin;
    private static int totalFuncionarios;

    public Funcionario(String nome, String cpf, String senha, boolean isAdmin) {
        setNome(nome);
        setCPF(cpf);
        setSenha(senha);
        setIsAdmin(isAdmin);
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

    private void setSenha(String senha) {
        if (senha != null && senha.length() >= 8) {
            this.senha = senha;
        }
    }
    public void alterarSenha(String senhaAtual, String senhaNova) {
        if (senhaAtual == this.senha) {
            setCPF(senhaNova);
        }
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getSenha() {
        return this.senha;
    }
    public boolean getIsAdmin() {
        return this.isAdmin;
    }
}


