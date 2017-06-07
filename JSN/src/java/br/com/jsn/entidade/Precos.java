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
import javax.persistence.CascadeType;
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
@Table(name = "precos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Precos.findAll", query = "SELECT p FROM Precos p")
    , @NamedQuery(name = "Precos.findByPrecoId", query = "SELECT p FROM Precos p WHERE p.precoId = :precoId")
    , @NamedQuery(name = "Precos.findByPrecoTipo", query = "SELECT p FROM Precos p WHERE p.precoTipo = :precoTipo")
    , @NamedQuery(name = "Precos.findByPrecoHora", query = "SELECT p FROM Precos p WHERE p.precoHora = :precoHora")
    , @NamedQuery(name = "Precos.findByPrecoDia", query = "SELECT p FROM Precos p WHERE p.precoDia = :precoDia")
    , @NamedQuery(name = "Precos.findByPrecoMes", query = "SELECT p FROM Precos p WHERE p.precoMes = :precoMes")
    , @NamedQuery(name = "Precos.findByPrecoSemana", query = "SELECT p FROM Precos p WHERE p.precoSemana = :precoSemana")
    , @NamedQuery(name = "Precos.findByPrecoValor", query = "SELECT p FROM Precos p WHERE p.precoValor = :precoValor")
    , @NamedQuery(name = "Precos.findByPrecoDesconto", query = "SELECT p FROM Precos p WHERE p.precoDesconto = :precoDesconto")
    , @NamedQuery(name = "Precos.findByPrecoTarifa", query = "SELECT p FROM Precos p WHERE p.precoTarifa = :precoTarifa")
    , @NamedQuery(name = "Precos.findByPrecoTotal", query = "SELECT p FROM Precos p WHERE p.precoTotal = :precoTotal")
    , @NamedQuery(name = "Precos.findByPrecoDescricao", query = "SELECT p FROM Precos p WHERE p.precoDescricao = :precoDescricao")
    , @NamedQuery(name = "Precos.findByPrecoCategoria", query = "SELECT p FROM Precos p WHERE p.precoCategoria = :precoCategoria")
    , @NamedQuery(name = "Precos.findByPrecosData", query = "SELECT p FROM Precos p WHERE p.precosData = :precosData")})
public class Precos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "preco_id")
    private Integer precoId;
    @Size(max = 45)
    @Column(name = "preco_tipo")
    private String precoTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_hora")
    private Double precoHora;
    @Column(name = "preco__dia")
    private Double precoDia;
    @Column(name = "preco_mes")
    private Double precoMes;
    @Column(name = "preco__semana")
    private Double precoSemana;
    @Column(name = "preco_valor")
    private Double precoValor;
    @Column(name = "preco_desconto")
    private Double precoDesconto;
    @Column(name = "preco_tarifa")
    private Double precoTarifa;
    @Column(name = "preco__total")
    private Double precoTotal;
    @Size(max = 45)
    @Column(name = "preco_descricao")
    private String precoDescricao;
    @Size(max = 45)
    @Column(name = "preco_categoria")
    private String precoCategoria;
    @Column(name = "precos_data")
    @Temporal(TemporalType.DATE)
    private Date precosData;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "precosPrecoId")
    private List<Hospedagem> hospedagemList;

    public Precos() {
    }

    public Precos(Integer precoId) {
        this.precoId = precoId;
    }

    public Integer getPrecoId() {
        return precoId;
    }

    public void setPrecoId(Integer precoId) {
        this.precoId = precoId;
    }

    public String getPrecoTipo() {
        return precoTipo;
    }

    public void setPrecoTipo(String precoTipo) {
        this.precoTipo = precoTipo;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }

    public Double getPrecoMes() {
        return precoMes;
    }

    public void setPrecoMes(Double precoMes) {
        this.precoMes = precoMes;
    }

    public Double getPrecoSemana() {
        return precoSemana;
    }

    public void setPrecoSemana(Double precoSemana) {
        this.precoSemana = precoSemana;
    }

    public Double getPrecoValor() {
        return precoValor;
    }

    public void setPrecoValor(Double precoValor) {
        this.precoValor = precoValor;
    }

    public Double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(Double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }

    public Double getPrecoTarifa() {
        return precoTarifa;
    }

    public void setPrecoTarifa(Double precoTarifa) {
        this.precoTarifa = precoTarifa;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getPrecoDescricao() {
        return precoDescricao;
    }

    public void setPrecoDescricao(String precoDescricao) {
        this.precoDescricao = precoDescricao;
    }

    public String getPrecoCategoria() {
        return precoCategoria;
    }

    public void setPrecoCategoria(String precoCategoria) {
        this.precoCategoria = precoCategoria;
    }

    public Date getPrecosData() {
        return precosData;
    }

    public void setPrecosData(Date precosData) {
        this.precosData = precosData;
    }

    @XmlTransient
    public List<Hospedagem> getHospedagemList() {
        return hospedagemList;
    }

    public void setHospedagemList(List<Hospedagem> hospedagemList) {
        this.hospedagemList = hospedagemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (precoId != null ? precoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precos)) {
            return false;
        }
        Precos other = (Precos) object;
        if ((this.precoId == null && other.precoId != null) || (this.precoId != null && !this.precoId.equals(other.precoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Precos[ precoId=" + precoId + " ]";
    }
    
}
