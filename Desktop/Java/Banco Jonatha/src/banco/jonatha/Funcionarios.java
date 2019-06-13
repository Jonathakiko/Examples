/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.jonatha;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alu201813844
 */
public class Funcionarios extends Pessoa implements Cadastro {

    static int vSenha;
    private String cargo;
    private int senha;
    private double salario;
        
    public Funcionarios(String cep, String cidade, String estado, String rua, int numCasa, String nome, int CPF, 
    int idade, String genero, String cargo, int senha, double salario) {
        
        super(cep, cidade, estado, rua, numCasa, nome, CPF, idade, genero);
        this.cargo = cargo;
        this.senha = senha;
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
        
    protected boolean validarSenha(int vSenha) {
        Scanner ler = new Scanner (System.in);
        boolean erro;
        do{
            erro=false;
            try{
                System.out.println("Informe sua senha: ");
                vSenha = ler.nextInt();
                return vSenha == getSenha();
            }catch(InputMismatchException ime){
                erro=true;
                System.out.println();
                System.out.println("Somente numeros.");
                break;
            }
        }while(erro=true);          
        return false;
    }
        
    @Override
    public void Cadastrar(){
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe nome: ");
        setNome(ler.nextLine()); 
        ler.nextLine();
        System.out.println("Informe cargo: ");
        setCargo(ler.nextLine());
        System.out.println("Informe salario: ");
        setSalario(ler.nextDouble());
        ler.nextLine();
        System.out.println("Informe genero: ");
        setGenero(ler.nextLine()); 
        System.out.println("Informe Senha: ");
        setSenha(ler.nextInt());
        System.out.println();
        System.out.println("FUNCIONARIO CADASTRADO");
        
    }
    
    @Override
    public void Listar(){
        System.out.println(getNome());
        System.out.println(getCargo());
        System.out.println(getSalario());
        System.out.println(getGenero());
        System.out.println();
    }
    
    protected void mudarSenha(){
        Scanner ler = new Scanner (System.in);
        
        int newPsw1;
        int newPsw2;
        
        System.out.println("Informe nova senha:");
        newPsw1 = ler.nextInt();
        System.out.println("Informe novamente nova senha:");
        newPsw2 = ler.nextInt();
        if(newPsw1 != newPsw2){
            System.out.println("Senhas não conferem.");
            return;
        }else{
            setSenha(newPsw1);
            System.out.println("Senha alterada com sucesso.");
        }               
    }
}
