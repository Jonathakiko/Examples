/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.jonatha;

import java.util.Scanner;

/**
 *
 * @author alu201813844
 */
public class Gerente extends Funcionarios implements Cadastro {
           
    public Gerente(String cep, String cidade, String estado, String rua, int numCasa, String nome, int CPF, int idade, String sexo, String cargo, int senha, double salario) {
        super(cep, cidade, estado, rua, numCasa, nome, CPF, idade, sexo, cargo, senha, salario);
    }
    
    @Override
    public void Cadastrar(){
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe nome: ");
        setNome(ler.nextLine()); 
        System.out.println("Informe genero: ");
        setGenero(ler.nextLine()); 
        System.out.println("Informe Senha: ");
        setSenha(ler.nextInt());
        System.out.println();
        System.out.println("FUNCIONARIO CADASTRADO");
        System.out.println();
        
    }
}
