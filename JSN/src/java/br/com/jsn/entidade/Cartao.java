/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "cartao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartao.findAll", query = "SELECT c FROM Cartao c")
    , @NamedQuery(name = "Cartao.findByCartaoId", query = "SELECT c FROM Cartao c WHERE c.cartaoId = :cartaoId")
    , @NamedQuery(name = "Cartao.findByCartaoNome", query = "SELECT c FROM Cartao c WHERE c.cartaoNome = :cartaoNome")
    , @NamedQuery(name = "Cartao.findByCartaoValidade", query = "SELECT c FROM Cartao c WHERE c.cartaoValidade = :cartaoValidade")
    , @NamedQuery(name = "Cartao.findByCartaoSecurity", query = "SELECT c FROM Cartao c WHERE c.cartaoSecurity = :cartaoSecurity")
    , @NamedQuery(name = "Cartao.findByCartaoNumero", query = "SELECT c FROM Cartao c WHERE c.cartaoNumero = :cartaoNumero")
    , @NamedQuery(name = "Cartao.findByCartaoAgencia", query = "SELECT c FROM Cartao c WHERE c.cartaoAgencia = :cartaoAgencia")
    , @NamedQuery(name = "Cartao.findByCartaoBandeira", query = "SELECT c FROM Cartao c WHERE c.cartaoBandeira = :cartaoBandeira")
    , @NamedQuery(name = "Cartao.findByCartaoTipo", query = "SELECT c FROM Cartao c WHERE c.cartaoTipo = :cartaoTipo")})
public class Cartao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cartao_id")
    private Integer cartaoId;
    @Size(max = 45)
    @Column(name = "cartao_nome")
    private String cartaoNome;
    @Size(max = 45)
    @Column(name = "cartao_validade")
    private String cartaoValidade;
    @Size(max = 45)
    @Column(name = "cartao_security")
    private String cartaoSecurity;
    @Size(max = 45)
    @Column(name = "cartao_numero")
    private String cartaoNumero;
    @Size(max = 45)
    @Column(name = "cartao_agencia")
    private String cartaoAgencia;
    @Size(max = 45)
    @Column(name = "cartao_bandeira")
    private String cartaoBandeira;
    @Size(max = 45)
    @Column(name = "cartao_tipo")
    private String cartaoTipo;
    @OneToMany(mappedBy = "cartaoCartaoId")
    private List<FormaPagamento> formaPagamentoList;

    public Cartao() {
    }

    public Cartao(Integer cartaoId) {
        this.cartaoId = cartaoId;
    }

    public Integer getCartaoId() {
        return cartaoId;
    }

    public void setCartaoId(Integer cartaoId) {
        this.cartaoId = cartaoId;
    }

    public String getCartaoNome() {
        return cartaoNome;
    }

    public void setCartaoNome(String cartaoNome) {
        this.cartaoNome = cartaoNome;
    }

    public String getCartaoValidade() {
        return cartaoValidade;
    }

    public void setCartaoValidade(String cartaoValidade) {
        this.cartaoValidade = cartaoValidade;
    }

    public String getCartaoSecurity() {
        return cartaoSecurity;
    }

    public void setCartaoSecurity(String cartaoSecurity) {
        this.cartaoSecurity = cartaoSecurity;
    }

    public String getCartaoNumero() {
        return cartaoNumero;
    }

    public void setCartaoNumero(String cartaoNumero) {
        this.cartaoNumero = cartaoNumero;
    }

    public String getCartaoAgencia() {
        return cartaoAgencia;
    }

    public void setCartaoAgencia(String cartaoAgencia) {
        this.cartaoAgencia = cartaoAgencia;
    }

    public String getCartaoBandeira() {
        return cartaoBandeira;
    }

    public void setCartaoBandeira(String cartaoBandeira) {
        this.cartaoBandeira = cartaoBandeira;
    }

    public String getCartaoTipo() {
        return cartaoTipo;
    }

    public void setCartaoTipo(String cartaoTipo) {
        this.cartaoTipo = cartaoTipo;
    }

    @XmlTransient
    public List<FormaPagamento> getFormaPagamentoList() {
        return formaPagamentoList;
    }

    public void setFormaPagamentoList(List<FormaPagamento> formaPagamentoList) {
        this.formaPagamentoList = formaPagamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartaoId != null ? cartaoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartao)) {
            return false;
        }
        Cartao other = (Cartao) object;
        if ((this.cartaoId == null && other.cartaoId != null) || (this.cartaoId != null && !this.cartaoId.equals(other.cartaoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Cartao[ cartaoId=" + cartaoId + " ]";
    }
    
}
