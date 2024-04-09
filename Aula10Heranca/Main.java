public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador();

        programador.setNome("Eduardo");
        programador.setCpf("01234567890");
        programador.setSalario(20000);
        programador.setLinguagem("C++");

        Designer designer = new Designer();

        designer.setNome("Julia");
        designer.setCpf("09876543210");
        designer.setSalario(40000);
        designer.setSoftwareEdicao("Photoshop");
        
        System.out.println("Nome Programador: " + programador.getNome());
        System.out.println("CPF Programador: " + programador.getCpf());
        System.out.println("Salario Programador: " + programador.getSalario());
        System.out.println("Linguagem Programador: " + programador.getLinguagem());
        System.out.println();
        System.out.println("Nome Designer: " + designer.getNome());
        System.out.println("CPF Designer: " + designer.getCpf());
        System.out.println("Salario Designer: " + designer.getSalario());
        System.out.println("Software Designer: " + designer.getSoftwareEdicao());
        
    }
}