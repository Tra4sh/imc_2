package br.senai.sp.jandira.imc.model;

public class Imc {

    private double imc;
    private Aluno aluno;

    public Imc (Aluno aluno){
        this.aluno = aluno;
    }

    public Imc(){
    }

    private void calcularImc(){
        imc = aluno.getPeso() / Math.pow(aluno.getAltura(), 2.0);
    }


    public void definirEstadoImc(){
        String estado = "Calculando resultado...";
    }

    public void exibirDados(){
        System.out.println("------------------------");
        System.out.printf("Dados do aluno: %s\n", aluno.getNome());
        System.out.printf("Nome: %s\n", aluno.getNome());
        System.out.printf("Data: %s\n", aluno.getDataNascimento());
        System.out.printf("Email: %s\n", aluno.getEmail());
        System.out.printf("Celular: %s\n", aluno.getCelular());
        System.out.printf("Peso: %s\n", aluno.getPeso());
        System.out.printf("Altura: %s\n", aluno.getAltura());
        calcularImc();
        System.out.printf("IMC: %s\n", imc);
    }
}
