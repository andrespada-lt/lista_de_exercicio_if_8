package com.mycompany.lista_de_exercicio_if_8;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        String nome;
        int age;
        nome = (JOptionPane.showInputDialog("insira seu nome: "));
        age = Integer.parseInt(JOptionPane.showInputDialog("insira a sua idade: "));
        if (age > 15 && age < 25){
        JOptionPane.showMessageDialog(null,"aceita " + nome);
         }else{
            JOptionPane.showMessageDialog(null,"não aceita " + nome);
        }
    }
}
