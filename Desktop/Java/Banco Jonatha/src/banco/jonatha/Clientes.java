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
public class Clientes extends Pessoa implements Cadastro {
    static int vSenha;
    private String tipoConta;
    private int senha;
    private double saldo;
    private boolean status;
    public Clientes(String cep, String cidade, String estado, String rua, int numCasa, 
    String nome, int CPF, int idade, String genero,String tipoConta, int senha, double saldo) {
        
        super(cep, cidade, estado, rua, numCasa, nome, CPF, idade, genero);
        this.tipoConta = tipoConta;
        this.senha = senha;
        this.saldo = saldo;       
    }

    /**
     * @return the tipoConta
     */
    public String getTipoConta() {
        return tipoConta;
    }

    /**
     * @param tipoConta the tipoConta to set
     */
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
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
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
      
    @Override
    public void Cadastrar() {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe nome do cliente:");
        setNome(ler.nextLine()); 
        System.out.println("Informe genero do cliente:");
        setGenero(ler.nextLine());
        System.out.println("Informe senha do cliente: ");
        setSenha(ler.nextInt());
        ler.nextLine();
        System.out.println("Informe tipo de conta[cc ou cp]:");
        setTipoConta(ler.nextLine());
        if(getTipoConta() == "cp"){
            setSaldo(150);
            System.out.println();
            System.out.println("CLIENTE CADASTRADO!");
        }else{
            setSaldo(100);       
            System.out.println();
            System.out.println("CLIENTE CADASTRADO!");
        }    
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
        }else{
            setSenha(newPsw1);
            System.out.println("Senha alterada com sucesso.");
        } 
    }
    
    protected void Consultar(){
        Scanner ler = new Scanner (System.in);
        
        int compSenha;
        
        System.out.println("Informe senha:");
        compSenha = ler.nextInt();
        
        if(compSenha == getSenha()){
            System.out.println("Saldo:"+getSaldo());
        }
       
    }
    
    protected void Depositar(){
        Scanner ler = new Scanner (System.in);
        
        int compSenha;
        
        System.out.println("Informe senha:");
        compSenha = ler.nextInt();
        
        if(compSenha == getSenha()){
            double depositar;
            
            System.out.println("Valor a depositar: ");
            depositar = ler.nextDouble();
            
            setSaldo(getSaldo() + depositar);
        }else
            System.out.println("Senha Invalida.");
    }
    
    protected void Sacar(){
        Scanner ler = new Scanner (System.in);
        
        int compSenha;
        
        System.out.println("Informe senha:");
        compSenha = ler.nextInt();
        
        if(compSenha == getSenha()){
            double sacar;
            
            System.out.println("Valor a depositar: ");
            sacar = ler.nextDouble();
            
            setSaldo(getSaldo() - sacar);
        }else
            System.out.println("Senha Invalida.");
    }
    
    public void fecharConta(){
        Scanner ler = new Scanner (System.in);
        
        String compNome;
        
        System.out.println("Nome do cliente: ");
        compNome = ler.nextLine();
        
        if(compNome == getNome()){
            if(getSaldo() > 0){
                String resposta;
                
                System.out.println("Para fechar a conta voce precisa"
                        + "sacar todo o dinhero."
                        + "voce deseja fazer isto agora?[s/n]");
                resposta = ler.nextLine();
                
                if(resposta == "s"){
                    double sacar;
                
                    sacar = getSaldo();
                    setSaldo(0);
                    setStatus(false);
                    
                    System.out.println("Conta fechada");
                    System.out.println("Voce sacou:" + sacar);
                    
                }else{
                    System.out.println("Voce precisa sacar seu dinheiro manualmente.");
                    System.out.println("Apos o saque, voce pode efetuar o fechamento da conta.");  
                }
            }else if(getSaldo() < 0){
                    System.out.println("Voce precisa quitar sua divida para fechar a conta.");
            }else{
                double sacar;
                
                sacar = getSaldo();
                setSaldo(0);
                setStatus(false);
                
                System.out.println("Conta fechada");
                System.out.println("Voce sacou:" + sacar);
            }        
        }
    }
    
    public  void reabrirConta(){
        Scanner ler = new Scanner (System.in);
        
        String compNome;
        
        System.out.println("Nome do cliente: ");
        compNome = ler.nextLine();
        
        if(compNome.equals(getNome()) && isStatus() == false){
            if(getTipoConta() == "cc"){
                setSaldo(100);
                setStatus(true);
            }else
                setSaldo(150);
                setStatus(true);
            
        }else
            System.out.println("Conta já esta aberta.");
    }
    
    @Override
    public void Listar() {
        System.out.println(getNome());
        System.out.println(getGenero());
        System.out.println(getTipoConta());
        System.out.println(getSaldo());
        System.out.println();
        
    }
    
}
    
         