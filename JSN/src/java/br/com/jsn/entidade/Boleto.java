/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "boleto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleto.findAll", query = "SELECT b FROM Boleto b")
    , @NamedQuery(name = "Boleto.findByBoletoId", query = "SELECT b FROM Boleto b WHERE b.boletoId = :boletoId")
    , @NamedQuery(name = "Boleto.findByBoletoNumero", query = "SELECT b FROM Boleto b WHERE b.boletoNumero = :boletoNumero")
    , @NamedQuery(name = "Boleto.findByBoletoAgencia", query = "SELECT b FROM Boleto b WHERE b.boletoAgencia = :boletoAgencia")
    , @NamedQuery(name = "Boleto.findByBoletoCodigo", query = "SELECT b FROM Boleto b WHERE b.boletoCodigo = :boletoCodigo")
    , @NamedQuery(name = "Boleto.findByBoletoVencimento", query = "SELECT b FROM Boleto b WHERE b.boletoVencimento = :boletoVencimento")
    , @NamedQuery(name = "Boleto.findByBoletoData", query = "SELECT b FROM Boleto b WHERE b.boletoData = :boletoData")})
public class Boleto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "boleto_id")
    private Integer boletoId;
    @Size(max = 150)
    @Column(name = "boleto_numero")
    private String boletoNumero;
    @Size(max = 45)
    @Column(name = "boleto_agencia")
    private String boletoAgencia;
    @Size(max = 200)
    @Column(name = "boleto_codigo")
    private String boletoCodigo;
    @Column(name = "boleto_vencimento")
    @Temporal(TemporalType.DATE)
    private Date boletoVencimento;
    @Column(name = "boleto_data")
    @Temporal(TemporalType.DATE)
    private Date boletoData;
    @OneToMany(mappedBy = "boletoBoletoId")
    private List<FormaPagamento> formaPagamentoList;

    public Boleto() {
    }

    public Boleto(Integer boletoId) {
        this.boletoId = boletoId;
    }

    public Integer getBoletoId() {
        return boletoId;
    }

    public void setBoletoId(Integer boletoId) {
        this.boletoId = boletoId;
    }

    public String getBoletoNumero() {
        return boletoNumero;
    }

    public void setBoletoNumero(String boletoNumero) {
        this.boletoNumero = boletoNumero;
    }

    public String getBoletoAgencia() {
        return boletoAgencia;
    }

    public void setBoletoAgencia(String boletoAgencia) {
        this.boletoAgencia = boletoAgencia;
    }

    public String getBoletoCodigo() {
        return boletoCodigo;
    }

    public void setBoletoCodigo(String boletoCodigo) {
        this.boletoCodigo = boletoCodigo;
    }

    public Date getBoletoVencimento() {
        return boletoVencimento;
    }

    public void setBoletoVencimento(Date boletoVencimento) {
        this.boletoVencimento = boletoVencimento;
    }

    public Date getBoletoData() {
        return boletoData;
    }

    public void setBoletoData(Date boletoData) {
        this.boletoData = boletoData;
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
        hash += (boletoId != null ? boletoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleto)) {
            return false;
        }
        Boleto other = (Boleto) object;
        if ((this.boletoId == null && other.boletoId != null) || (this.boletoId != null && !this.boletoId.equals(other.boletoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Boleto[ boletoId=" + boletoId + " ]";
    }
    
}
