package br.senai.sp.jandira.imc;
import br.senai.sp.jandira.imc.model.Imc;

import java.awt.*;
import java.time.LocalDate;
import br.senai.sp.jandira.imc.model.Aluno;

import javax.swing.*;sgvcs

public class ImcApp {
    public static void main(String[] args) {

        JFrame tela = new JFrame();
        tela.setSize(500,300);
        tela.setTitle("Calculo de IMC");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);
        JTextField txtNome = new JTextField();
         tela.getContentPane().add(txtNome);
        txtNome.setBounds(10,20,120,30);
        tela.setVisible(true);


        Imc imcMaria = new Imc();

        Aluno joao = new Aluno();
        joao.setNome("João Pereira");
        joao.setDataNascimento(LocalDate.of(1999,5,15));
        joao.setEmail("joao@gmail.com");
        joao.setCelular("(11)59322481");
        joao.setPeso(78);
        joao.setAltura(1.72);

        Imc imcJoao = new Imc(joao);

//        imcMaria.exibirDados();
        imcJoao.exibirDados();

    }
}
