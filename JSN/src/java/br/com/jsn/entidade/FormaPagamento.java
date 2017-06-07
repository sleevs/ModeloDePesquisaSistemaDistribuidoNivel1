/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "forma_pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormaPagamento.findAll", query = "SELECT f FROM FormaPagamento f")
    , @NamedQuery(name = "FormaPagamento.findByFormaPagamentoId", query = "SELECT f FROM FormaPagamento f WHERE f.formaPagamentoId = :formaPagamentoId")
    , @NamedQuery(name = "FormaPagamento.findByFormaPagamentoData", query = "SELECT f FROM FormaPagamento f WHERE f.formaPagamentoData = :formaPagamentoData")
    , @NamedQuery(name = "FormaPagamento.findByFormaPagamentoTipo", query = "SELECT f FROM FormaPagamento f WHERE f.formaPagamentoTipo = :formaPagamentoTipo")})
public class FormaPagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "forma_pagamento_id")
    private Integer formaPagamentoId;
    @Column(name = "forma_pagamento_data")
    @Temporal(TemporalType.DATE)
    private Date formaPagamentoData;
    @Size(max = 45)
    @Column(name = "forma_pagamento_tipo")
    private String formaPagamentoTipo;
    @JoinColumn(name = "boleto_boleto_id", referencedColumnName = "boleto_id")
    @ManyToOne
    private Boleto boletoBoletoId;
    @JoinColumn(name = "cartao_cartao_id", referencedColumnName = "cartao_id")
    @ManyToOne
    private Cartao cartaoCartaoId;
    @JoinColumn(name = "conta_conta_id", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaContaId;
    @JoinColumn(name = "moeda_moeda_id", referencedColumnName = "moeda_id")
    @ManyToOne
    private Moeda moedaMoedaId;

    public FormaPagamento() {
    }

    public FormaPagamento(Integer formaPagamentoId) {
        this.formaPagamentoId = formaPagamentoId;
    }

    public Integer getFormaPagamentoId() {
        return formaPagamentoId;
    }

    public void setFormaPagamentoId(Integer formaPagamentoId) {
        this.formaPagamentoId = formaPagamentoId;
    }

    public Date getFormaPagamentoData() {
        return formaPagamentoData;
    }

    public void setFormaPagamentoData(Date formaPagamentoData) {
        this.formaPagamentoData = formaPagamentoData;
    }

    public String getFormaPagamentoTipo() {
        return formaPagamentoTipo;
    }

    public void setFormaPagamentoTipo(String formaPagamentoTipo) {
        this.formaPagamentoTipo = formaPagamentoTipo;
    }

    public Boleto getBoletoBoletoId() {
        return boletoBoletoId;
    }

    public void setBoletoBoletoId(Boleto boletoBoletoId) {
        this.boletoBoletoId = boletoBoletoId;
    }

    public Cartao getCartaoCartaoId() {
        return cartaoCartaoId;
    }

    public void setCartaoCartaoId(Cartao cartaoCartaoId) {
        this.cartaoCartaoId = cartaoCartaoId;
    }

    public Conta getContaContaId() {
        return contaContaId;
    }

    public void setContaContaId(Conta contaContaId) {
        this.contaContaId = contaContaId;
    }

    public Moeda getMoedaMoedaId() {
        return moedaMoedaId;
    }

    public void setMoedaMoedaId(Moeda moedaMoedaId) {
        this.moedaMoedaId = moedaMoedaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formaPagamentoId != null ? formaPagamentoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormaPagamento)) {
            return false;
        }
        FormaPagamento other = (FormaPagamento) object;
        if ((this.formaPagamentoId == null && other.formaPagamentoId != null) || (this.formaPagamentoId != null && !this.formaPagamentoId.equals(other.formaPagamentoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.FormaPagamento[ formaPagamentoId=" + formaPagamentoId + " ]";
    }
    
}
