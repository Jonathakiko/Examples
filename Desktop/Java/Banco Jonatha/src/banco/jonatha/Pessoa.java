/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.jonatha;

/**
 *
 * @author alu201813844
 */
abstract class Pessoa extends Endereco {
    private String nome;
    private int CPF;
    private int idade;
    private String genero;

    public Pessoa(String cep, String cidade, String estado, String rua, 
    int numCasa, String nome, int CPF, int idade, String genero){
        
        super(cep, cidade, estado, rua, numCasa);
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.genero = genero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }


           
}