/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo.negocio.basica;

/**
 *
 * @author victor
 */
public class Produto {
    private Integer idProduto;
    private Integer IdFornecedor;
    private String nome;
    private Integer qtd;
            

    /**
     * @return the idProduto
     */
    public Integer getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the IdFornecedor
     */
    public Integer getIdFornecedor() {
        return IdFornecedor;
    }

    /**
     * @param IdFornecedor the IdFornecedor to set
     */
    public void setIdFornecedor(Integer IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
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
    
    public Boolean isValido(){
        if(nome == null)
            return false;
        else
            return true;
    }

    /**
     * @return the qtd
     */
    public Integer getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
}
