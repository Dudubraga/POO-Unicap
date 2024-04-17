public class Designer extends Funcionarios {
    private String softwareEdicao;
    
    public Designer(String nome, double salario, String softwareEdicao) {
        super(nome, salario);
        this.softwareEdicao = softwareEdicao;
    }

    public double calcularBonificacao(){
        double bonificacao = this.getSalario() * 0.1;
        return bonificacao;
    }
    
    public String getSoftwareEdicao() {
        return softwareEdicao;
    }
    public void setSoftwareEdicao(String softwareEdicao) {
        this.softwareEdicao = softwareEdicao;
    }
}
