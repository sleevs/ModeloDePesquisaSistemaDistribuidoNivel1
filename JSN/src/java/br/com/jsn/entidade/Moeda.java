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
@Table(name = "moeda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Moeda.findAll", query = "SELECT m FROM Moeda m")
    , @NamedQuery(name = "Moeda.findByMoedaId", query = "SELECT m FROM Moeda m WHERE m.moedaId = :moedaId")
    , @NamedQuery(name = "Moeda.findByMoedaNome", query = "SELECT m FROM Moeda m WHERE m.moedaNome = :moedaNome")
    , @NamedQuery(name = "Moeda.findByMoedaValor", query = "SELECT m FROM Moeda m WHERE m.moedaValor = :moedaValor")
    , @NamedQuery(name = "Moeda.findByMoedaValorCambio", query = "SELECT m FROM Moeda m WHERE m.moedaValorCambio = :moedaValorCambio")
    , @NamedQuery(name = "Moeda.findByMoedaOrigem", query = "SELECT m FROM Moeda m WHERE m.moedaOrigem = :moedaOrigem")
    , @NamedQuery(name = "Moeda.findByMoedaTarifa", query = "SELECT m FROM Moeda m WHERE m.moedaTarifa = :moedaTarifa")})
public class Moeda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "moeda_id")
    private Integer moedaId;
    @Size(max = 45)
    @Column(name = "moeda_nome")
    private String moedaNome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "moeda_valor")
    private Double moedaValor;
    @Column(name = "moeda_valor_cambio")
    private Double moedaValorCambio;
    @Size(max = 45)
    @Column(name = "moeda_origem")
    private String moedaOrigem;
    @Column(name = "moeda_tarifa")
    private Double moedaTarifa;
    @OneToMany(mappedBy = "moedaMoedaId")
    private List<FormaPagamento> formaPagamentoList;

    public Moeda() {
    }

    public Moeda(Integer moedaId) {
        this.moedaId = moedaId;
    }

    public Integer getMoedaId() {
        return moedaId;
    }

    public void setMoedaId(Integer moedaId) {
        this.moedaId = moedaId;
    }

    public String getMoedaNome() {
        return moedaNome;
    }

    public void setMoedaNome(String moedaNome) {
        this.moedaNome = moedaNome;
    }

    public Double getMoedaValor() {
        return moedaValor;
    }

    public void setMoedaValor(Double moedaValor) {
        this.moedaValor = moedaValor;
    }

    public Double getMoedaValorCambio() {
        return moedaValorCambio;
    }

    public void setMoedaValorCambio(Double moedaValorCambio) {
        this.moedaValorCambio = moedaValorCambio;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public void setMoedaOrigem(String moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }

    public Double getMoedaTarifa() {
        return moedaTarifa;
    }

    public void setMoedaTarifa(Double moedaTarifa) {
        this.moedaTarifa = moedaTarifa;
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
        hash += (moedaId != null ? moedaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moeda)) {
            return false;
        }
        Moeda other = (Moeda) object;
        if ((this.moedaId == null && other.moedaId != null) || (this.moedaId != null && !this.moedaId.equals(other.moedaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Moeda[ moedaId=" + moedaId + " ]";
    }
    
}
