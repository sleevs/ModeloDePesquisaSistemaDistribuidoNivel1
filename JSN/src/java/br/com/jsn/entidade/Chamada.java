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
import javax.persistence.Lob;
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
@Table(name = "chamada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chamada.findAll", query = "SELECT c FROM Chamada c")
    , @NamedQuery(name = "Chamada.findByChamadaId", query = "SELECT c FROM Chamada c WHERE c.chamadaId = :chamadaId")
    , @NamedQuery(name = "Chamada.findByChamadaData", query = "SELECT c FROM Chamada c WHERE c.chamadaData = :chamadaData")
    , @NamedQuery(name = "Chamada.findByChamadaTipo", query = "SELECT c FROM Chamada c WHERE c.chamadaTipo = :chamadaTipo")
    , @NamedQuery(name = "Chamada.findByChamadaCategoria", query = "SELECT c FROM Chamada c WHERE c.chamadaCategoria = :chamadaCategoria")
    , @NamedQuery(name = "Chamada.findByChamadaOcorrencia", query = "SELECT c FROM Chamada c WHERE c.chamadaOcorrencia = :chamadaOcorrencia")})
public class Chamada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "chamada_id")
    private Integer chamadaId;
    @Column(name = "chamada_data")
    @Temporal(TemporalType.DATE)
    private Date chamadaData;
    @Size(max = 45)
    @Column(name = "chamada_tipo")
    private String chamadaTipo;
    @Size(max = 45)
    @Column(name = "chamada_categoria")
    private String chamadaCategoria;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "chamada_descricao")
    private String chamadaDescricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "chamada_ocorrencia")
    private Double chamadaOcorrencia;
    @JoinColumn(name = "chamada_status_chamada_status_id", referencedColumnName = "chamada_status_id")
    @ManyToOne(optional = false)
    private ChamadaStatus chamadaStatusChamadaStatusId;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;
    @JoinColumn(name = "solucao_problema_solucao_problema_id", referencedColumnName = "solucao_problema_id")
    @ManyToOne
    private SolucaoProblema solucaoProblemaSolucaoProblemaId;

    public Chamada() {
    }

    public Chamada(Integer chamadaId) {
        this.chamadaId = chamadaId;
    }

    public Integer getChamadaId() {
        return chamadaId;
    }

    public void setChamadaId(Integer chamadaId) {
        this.chamadaId = chamadaId;
    }

    public Date getChamadaData() {
        return chamadaData;
    }

    public void setChamadaData(Date chamadaData) {
        this.chamadaData = chamadaData;
    }

    public String getChamadaTipo() {
        return chamadaTipo;
    }

    public void setChamadaTipo(String chamadaTipo) {
        this.chamadaTipo = chamadaTipo;
    }

    public String getChamadaCategoria() {
        return chamadaCategoria;
    }

    public void setChamadaCategoria(String chamadaCategoria) {
        this.chamadaCategoria = chamadaCategoria;
    }

    public String getChamadaDescricao() {
        return chamadaDescricao;
    }

    public void setChamadaDescricao(String chamadaDescricao) {
        this.chamadaDescricao = chamadaDescricao;
    }

    public Double getChamadaOcorrencia() {
        return chamadaOcorrencia;
    }

    public void setChamadaOcorrencia(Double chamadaOcorrencia) {
        this.chamadaOcorrencia = chamadaOcorrencia;
    }

    public ChamadaStatus getChamadaStatusChamadaStatusId() {
        return chamadaStatusChamadaStatusId;
    }

    public void setChamadaStatusChamadaStatusId(ChamadaStatus chamadaStatusChamadaStatusId) {
        this.chamadaStatusChamadaStatusId = chamadaStatusChamadaStatusId;
    }

    public Conta getContaConta() {
        return contaConta;
    }

    public void setContaConta(Conta contaConta) {
        this.contaConta = contaConta;
    }

    public SolucaoProblema getSolucaoProblemaSolucaoProblemaId() {
        return solucaoProblemaSolucaoProblemaId;
    }

    public void setSolucaoProblemaSolucaoProblemaId(SolucaoProblema solucaoProblemaSolucaoProblemaId) {
        this.solucaoProblemaSolucaoProblemaId = solucaoProblemaSolucaoProblemaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chamadaId != null ? chamadaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamada)) {
            return false;
        }
        Chamada other = (Chamada) object;
        if ((this.chamadaId == null && other.chamadaId != null) || (this.chamadaId != null && !this.chamadaId.equals(other.chamadaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Chamada[ chamadaId=" + chamadaId + " ]";
    }
    
}
