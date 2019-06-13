/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.jonatha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author alu201813844
 */
public class BancoJonatha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Collection <Atendente> Aten = new ArrayList();        
        Collection <Gerente> Ger = new ArrayList(); 
        Collection <Clientes> Clt = new ArrayList();
        
        Gerente g = new Gerente("5646-4654", "Porto Alegre", "RS", "Nao informado", 137, "Geraldo",86564456, 36, "Nao informado", "Gerente", 123456, 5000.00);
        Ger.add(g);
        
        System.out.println("Primeiro, cadastre um gerente.");
        
        g.Cadastrar();
        
        for(Gerente x : Ger){  
            System.out.println(x.getNome());
            System.out.println(x.getSenha());
            System.out.println(x.getCargo());
            System.out.println();
        }
        
        int menu;       
        int submenu1;
        int submenu2;
        int submenu3;
         
        Scanner ler = new Scanner (System.in);
       
        do{
            System.out.println("MENU DO BANCO.");
            System.out.println();
            System.out.println("1.MENU GERENTE");
            System.out.println("2.MENU ATENDENTE");
            System.out.println("3.MENU CLIENTE");
            System.out.println("4.SAIR.");
            menu = ler.nextInt();
        
            switch(menu){
                        
                case 1:                        
                        for(Gerente x : Ger){                        
                            if(x.validarSenha(Gerente.vSenha)){                                                                   
                                do{ 
                                                      
                                    System.out.println("MENU DO GERENTE.");
                                    System.out.println();
                                    System.out.println("1.Cadastrar Atendentes.");
                                    System.out.println("2.Listar Atendentes.");
                                    System.out.println("3.Listar Clientes.");
                                    System.out.println("4.Mudar senha(Gerente).");
                                    System.out.println("5.Voltar.");
                                    submenu1 = ler.nextInt();
                    
                                    switch(submenu1){
                                        case 1: 
                                                Atendente a = new Atendente("5646-4654", "Porto Alegre", "RS", "Nao informado", 137, "Nao informado",86564456, 36, 
                                                "Nao informado", "Atendente", 123456, 2500.00);
                                                a.Cadastrar();
                                                Aten.add(a);                                                                                                  
                                        break; 

                                        case 2: if(Aten.isEmpty()){
                                                    System.out.println();
                                                    System.out.println("Lista vazia.");
                                                    System.out.println();
                                                }else{
                                                    for(Atendente y : Aten){
                                                        y.Listar();
                                                    }
                                                }    
                                        break;

                                        case 3:if(Clt.isEmpty()){
                                                    System.out.println();
                                                    System.out.println("Lista vazia.");
                                                    System.out.println();
                                                }else{
                                                    for(Clientes z : Clt){
                                                        z.Listar();
                                                    }
                                                }    
                                        break;  

                                        case 4: if(x.validarSenha(Gerente.vSenha)){
                                                    x.mudarSenha();
                                                }else{
                                                    System.out.println();
                                                    System.out.println("Senha Invalida");
                                                    System.out.println();
                                                }   
                                        break;  

                                        case 5:
                                        break;

                                        default:System.out.println("OPÇÃO INVÁLIDA.");
                                                System.out.println();
                                            
                                        break;
                                    } 
                                }while(submenu1 !=5);                           
                            }else{
                                System.out.println();
                                System.out.println("Senha Invalida");
                                System.out.println();
                            }    
                                break;    
                        }
                break;
                
                case 2: for(Atendente y : Aten){
                            if(y.validarSenha(Atendente.vSenha)){     
                                do{
                                    System.out.println("MENU DO ATENDENTE.");
                                    System.out.println();
                                    System.out.println("1.Cadastrar Clientes.");
                                    System.out.println("2.Listar Clientes.");
                                    System.out.println("3.Depositar (Cliente)");
                                    System.out.println("4.Sacar (Cliente).");
                                    System.out.println("5.Fechar conta");
                                    System.out.println("6.Reabrir conta");
                                    System.out.println("7.Mudar senha(Funcionario).");
                                    System.out.println("8.Voltar.");
                                    submenu2 = ler.nextInt();

                                    switch(submenu2){
                                        case 1: 
                                                Clientes c = new Clientes("5646-4654", "Porto Alegre", "RS", "Nao informado", 137, 
                                                "Nao informado",86564456, 36, "Nao informado","cc", 123456789, 100.00);
                                                 c.Cadastrar();
                                                 Clt.add(c);
                                        break; 

                                        case 2: if(Clt.isEmpty()){
                                                    System.out.println();
                                                    System.out.println("Lista vazia.");
                                                    System.out.println();
                                                }else{
                                                    for(Clientes z : Clt){
                                                        z.Listar();
                                                    }
                                                }    
                                        break;

                                        case 3: for(Clientes z : Clt){
                                                    z.Depositar();
                                                }
                                                       
                                        break;  

                                        case 4: for(Clientes z : Clt){
                                                    z.Sacar();
                                                }
                                        break;  

                                        case 5: for(Clientes z : Clt){
                                                    z.fecharConta();
                                                }
                                        break;

                                        case 6: for(Clientes z : Clt){
                                                    z.reabrirConta();
                                                }
                                        break;

                                        case 7: if(y.validarSenha(Clientes.vSenha)){
                                                    y.mudarSenha();
                                                }else{
                                                    System.out.println();
                                                    System.out.println("Senha Invalida");
                                                    System.out.println();
                                                }
                                        break;
                                        
                                        case 8:
                                        break;

                                        default:System.out.println("OPÇÃO INVÁLIDA.");
                                                System.out.println();
                                        break;                      
                                    }
                                }while(submenu2 != 8);    
                            }
                        }    
                break;
                
                case 3: for(Clientes c : Clt){
                            if(c.validarSenha(Clientes.vSenha)){   
                                do{
                                    System.out.println("MENU DO CLIENTE.");
                                    System.out.println();
                                    System.out.println("1.Consultar saldo");
                                    System.out.println("2.Depositar");
                                    System.out.println("3.Sacar");
                                    System.out.println("4.Mudar senha(Cliente)");
                                    System.out.println("5.Voltar.");
                                    submenu3 = ler.nextInt();

                                    switch(submenu3){
                                        case 1: for(Clientes z : Clt){
                                                    z.Consultar();
                                                }
                                        break; 

                                        case 2: for(Clientes z : Clt){
                                                    z.Depositar();
                                                }
                                        break;

                                        case 3: for(Clientes z : Clt){
                                                    z.Sacar();
                                                }
                                        break;  

                                        case 4:
                                                if(c.validarSenha(Clientes.vSenha)){
                                                    c.mudarSenha();
                                                }else{
                                                    System.out.println();
                                                    System.out.println("Senha Invalida");
                                                    System.out.println();
                                                }

                                        break;  

                                        case 5:
                                        break;

                                        default:System.out.println("OPÇÃO INVÁLIDA.");
                                                System.out.println();
                                        break;  
                                    }
                                }while(submenu3 != 5);
                            }
                        }    
                break;
                
                case 4:
                break;
                
                default:System.out.println("OPÇÃO INVÁLIDA.");
                        System.out.println();
                break;                    
            }    
        }while(menu != 4);     
    }   
}
