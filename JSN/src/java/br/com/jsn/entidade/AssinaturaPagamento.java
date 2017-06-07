/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "assinatura_pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssinaturaPagamento.findAll", query = "SELECT a FROM AssinaturaPagamento a")
    , @NamedQuery(name = "AssinaturaPagamento.findByAssinaturaPagamentoId", query = "SELECT a FROM AssinaturaPagamento a WHERE a.assinaturaPagamentoId = :assinaturaPagamentoId")
    , @NamedQuery(name = "AssinaturaPagamento.findByAssinaturaPagamentoFlag", query = "SELECT a FROM AssinaturaPagamento a WHERE a.assinaturaPagamentoFlag = :assinaturaPagamentoFlag")
    , @NamedQuery(name = "AssinaturaPagamento.findByAssinaturaPagamentoValor", query = "SELECT a FROM AssinaturaPagamento a WHERE a.assinaturaPagamentoValor = :assinaturaPagamentoValor")
    , @NamedQuery(name = "AssinaturaPagamento.findByAssinaturaPagamentoTarifa", query = "SELECT a FROM AssinaturaPagamento a WHERE a.assinaturaPagamentoTarifa = :assinaturaPagamentoTarifa")
    , @NamedQuery(name = "AssinaturaPagamento.findByAssinaturaPagamentoTotal", query = "SELECT a FROM AssinaturaPagamento a WHERE a.assinaturaPagamentoTotal = :assinaturaPagamentoTotal")
    , @NamedQuery(name = "AssinaturaPagamento.findByAssinaturaPagamentoDesconto", query = "SELECT a FROM AssinaturaPagamento a WHERE a.assinaturaPagamentoDesconto = :assinaturaPagamentoDesconto")})
public class AssinaturaPagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "assinatura_pagamento_id")
    private Integer assinaturaPagamentoId;
    @Size(max = 45)
    @Column(name = "assinatura_pagamento_flag")
    private String assinaturaPagamentoFlag;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "assinatura_pagamento_valor")
    private Double assinaturaPagamentoValor;
    @Column(name = "assinatura_pagamento_tarifa")
    private Double assinaturaPagamentoTarifa;
    @Column(name = "assinatura_pagamento_total")
    private Double assinaturaPagamentoTotal;
    @Column(name = "assinatura_pagamento_desconto")
    private Double assinaturaPagamentoDesconto;
    @JoinColumn(name = "assinatura_assinatura_id", referencedColumnName = "assinatura_id")
    @ManyToOne(optional = false)
    private Assinatura assinaturaAssinaturaId;

    public AssinaturaPagamento() {
    }

    public AssinaturaPagamento(Integer assinaturaPagamentoId) {
        this.assinaturaPagamentoId = assinaturaPagamentoId;
    }

    public Integer getAssinaturaPagamentoId() {
        return assinaturaPagamentoId;
    }

    public void setAssinaturaPagamentoId(Integer assinaturaPagamentoId) {
        this.assinaturaPagamentoId = assinaturaPagamentoId;
    }

    public String getAssinaturaPagamentoFlag() {
        return assinaturaPagamentoFlag;
    }

    public void setAssinaturaPagamentoFlag(String assinaturaPagamentoFlag) {
        this.assinaturaPagamentoFlag = assinaturaPagamentoFlag;
    }

    public Double getAssinaturaPagamentoValor() {
        return assinaturaPagamentoValor;
    }

    public void setAssinaturaPagamentoValor(Double assinaturaPagamentoValor) {
        this.assinaturaPagamentoValor = assinaturaPagamentoValor;
    }

    public Double getAssinaturaPagamentoTarifa() {
        return assinaturaPagamentoTarifa;
    }

    public void setAssinaturaPagamentoTarifa(Double assinaturaPagamentoTarifa) {
        this.assinaturaPagamentoTarifa = assinaturaPagamentoTarifa;
    }

    public Double getAssinaturaPagamentoTotal() {
        return assinaturaPagamentoTotal;
    }

    public void setAssinaturaPagamentoTotal(Double assinaturaPagamentoTotal) {
        this.assinaturaPagamentoTotal = assinaturaPagamentoTotal;
    }

    public Double getAssinaturaPagamentoDesconto() {
        return assinaturaPagamentoDesconto;
    }

    public void setAssinaturaPagamentoDesconto(Double assinaturaPagamentoDesconto) {
        this.assinaturaPagamentoDesconto = assinaturaPagamentoDesconto;
    }

    public Assinatura getAssinaturaAssinaturaId() {
        return assinaturaAssinaturaId;
    }

    public void setAssinaturaAssinaturaId(Assinatura assinaturaAssinaturaId) {
        this.assinaturaAssinaturaId = assinaturaAssinaturaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assinaturaPagamentoId != null ? assinaturaPagamentoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssinaturaPagamento)) {
            return false;
        }
        AssinaturaPagamento other = (AssinaturaPagamento) object;
        if ((this.assinaturaPagamentoId == null && other.assinaturaPagamentoId != null) || (this.assinaturaPagamentoId != null && !this.assinaturaPagamentoId.equals(other.assinaturaPagamentoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.AssinaturaPagamento[ assinaturaPagamentoId=" + assinaturaPagamentoId + " ]";
    }
    
}
