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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "assinatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assinatura.findAll", query = "SELECT a FROM Assinatura a")
    , @NamedQuery(name = "Assinatura.findByAssinaturaId", query = "SELECT a FROM Assinatura a WHERE a.assinaturaId = :assinaturaId")
    , @NamedQuery(name = "Assinatura.findByAssinaturaData", query = "SELECT a FROM Assinatura a WHERE a.assinaturaData = :assinaturaData")
    , @NamedQuery(name = "Assinatura.findByAssinaturaValidade", query = "SELECT a FROM Assinatura a WHERE a.assinaturaValidade = :assinaturaValidade")
    , @NamedQuery(name = "Assinatura.findByAssinaturaValor", query = "SELECT a FROM Assinatura a WHERE a.assinaturaValor = :assinaturaValor")
    , @NamedQuery(name = "Assinatura.findByAssinaturaDesconto", query = "SELECT a FROM Assinatura a WHERE a.assinaturaDesconto = :assinaturaDesconto")
    , @NamedQuery(name = "Assinatura.findByAssinaturaValortotal", query = "SELECT a FROM Assinatura a WHERE a.assinaturaValortotal = :assinaturaValortotal")
    , @NamedQuery(name = "Assinatura.findByAssinaturaNome", query = "SELECT a FROM Assinatura a WHERE a.assinaturaNome = :assinaturaNome")
    , @NamedQuery(name = "Assinatura.findByAssinaturaTipo", query = "SELECT a FROM Assinatura a WHERE a.assinaturaTipo = :assinaturaTipo")
    , @NamedQuery(name = "Assinatura.findByAssinaturaCategoria", query = "SELECT a FROM Assinatura a WHERE a.assinaturaCategoria = :assinaturaCategoria")})
public class Assinatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "assinatura_id")
    private Integer assinaturaId;
    @Column(name = "assinatura_data")
    @Temporal(TemporalType.DATE)
    private Date assinaturaData;
    @Column(name = "assinatura_validade")
    @Temporal(TemporalType.DATE)
    private Date assinaturaValidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "assinatura_valor")
    private Double assinaturaValor;
    @Column(name = "assinatura_desconto")
    private Double assinaturaDesconto;
    @Column(name = "assinatura_valortotal")
    private Double assinaturaValortotal;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "assinatura_contrato")
    private String assinaturaContrato;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "assinatura_termos")
    private String assinaturaTermos;
    @Size(max = 45)
    @Column(name = "assinatura_nome")
    private String assinaturaNome;
    @Size(max = 45)
    @Column(name = "assinatura_tipo")
    private String assinaturaTipo;
    @Size(max = 45)
    @Column(name = "assinatura_categoria")
    private String assinaturaCategoria;
    @Lob
    @Size(max = 16777215)
    @Column(name = "assinatura_descricao")
    private String assinaturaDescricao;
    @JoinColumn(name = "assinatura_status_assinatura_status_id", referencedColumnName = "assinatura_status_id")
    @ManyToOne(optional = false)
    private AssinaturaStatus assinaturaStatusAssinaturaStatusId;
    @JoinColumn(name = "plano_plano_id", referencedColumnName = "plano_id")
    @ManyToOne(optional = false)
    private Plano planoPlanoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assinaturaAssinaturaId")
    private List<Conta> contaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assinaturaAssinaturaId")
    private List<AssinaturaPagamento> assinaturaPagamentoList;

    public Assinatura() {
    }

    public Assinatura(Integer assinaturaId) {
        this.assinaturaId = assinaturaId;
    }

    public Integer getAssinaturaId() {
        return assinaturaId;
    }

    public void setAssinaturaId(Integer assinaturaId) {
        this.assinaturaId = assinaturaId;
    }

    public Date getAssinaturaData() {
        return assinaturaData;
    }

    public void setAssinaturaData(Date assinaturaData) {
        this.assinaturaData = assinaturaData;
    }

    public Date getAssinaturaValidade() {
        return assinaturaValidade;
    }

    public void setAssinaturaValidade(Date assinaturaValidade) {
        this.assinaturaValidade = assinaturaValidade;
    }

    public Double getAssinaturaValor() {
        return assinaturaValor;
    }

    public void setAssinaturaValor(Double assinaturaValor) {
        this.assinaturaValor = assinaturaValor;
    }

    public Double getAssinaturaDesconto() {
        return assinaturaDesconto;
    }

    public void setAssinaturaDesconto(Double assinaturaDesconto) {
        this.assinaturaDesconto = assinaturaDesconto;
    }

    public Double getAssinaturaValortotal() {
        return assinaturaValortotal;
    }

    public void setAssinaturaValortotal(Double assinaturaValortotal) {
        this.assinaturaValortotal = assinaturaValortotal;
    }

    public String getAssinaturaContrato() {
        return assinaturaContrato;
    }

    public void setAssinaturaContrato(String assinaturaContrato) {
        this.assinaturaContrato = assinaturaContrato;
    }

    public String getAssinaturaTermos() {
        return assinaturaTermos;
    }

    public void setAssinaturaTermos(String assinaturaTermos) {
        this.assinaturaTermos = assinaturaTermos;
    }

    public String getAssinaturaNome() {
        return assinaturaNome;
    }

    public void setAssinaturaNome(String assinaturaNome) {
        this.assinaturaNome = assinaturaNome;
    }

    public String getAssinaturaTipo() {
        return assinaturaTipo;
    }

    public void setAssinaturaTipo(String assinaturaTipo) {
        this.assinaturaTipo = assinaturaTipo;
    }

    public String getAssinaturaCategoria() {
        return assinaturaCategoria;
    }

    public void setAssinaturaCategoria(String assinaturaCategoria) {
        this.assinaturaCategoria = assinaturaCategoria;
    }

    public String getAssinaturaDescricao() {
        return assinaturaDescricao;
    }

    public void setAssinaturaDescricao(String assinaturaDescricao) {
        this.assinaturaDescricao = assinaturaDescricao;
    }

    public AssinaturaStatus getAssinaturaStatusAssinaturaStatusId() {
        return assinaturaStatusAssinaturaStatusId;
    }

    public void setAssinaturaStatusAssinaturaStatusId(AssinaturaStatus assinaturaStatusAssinaturaStatusId) {
        this.assinaturaStatusAssinaturaStatusId = assinaturaStatusAssinaturaStatusId;
    }

    public Plano getPlanoPlanoId() {
        return planoPlanoId;
    }

    public void setPlanoPlanoId(Plano planoPlanoId) {
        this.planoPlanoId = planoPlanoId;
    }

    @XmlTransient
    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    @XmlTransient
    public List<AssinaturaPagamento> getAssinaturaPagamentoList() {
        return assinaturaPagamentoList;
    }

    public void setAssinaturaPagamentoList(List<AssinaturaPagamento> assinaturaPagamentoList) {
        this.assinaturaPagamentoList = assinaturaPagamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assinaturaId != null ? assinaturaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assinatura)) {
            return false;
        }
        Assinatura other = (Assinatura) object;
        if ((this.assinaturaId == null && other.assinaturaId != null) || (this.assinaturaId != null && !this.assinaturaId.equals(other.assinaturaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Assinatura[ assinaturaId=" + assinaturaId + " ]";
    }
    
}
