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
abstract class Endereco {
    private String cep;
    private String cidade;
    private String estado;
    private String rua;
    private int numCasa;
   
    Endereco(String cep, String cidade, String estado, String rua,int numCasa){
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.rua = rua;
        this.numCasa = numCasa;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numCasa
     */
    public int getNumCasa() {
        return numCasa;
    }

    /**
     * @param numCasa the numCasa to set
     */
    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

}
