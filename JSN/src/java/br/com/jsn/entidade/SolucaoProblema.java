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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "solucao_problema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolucaoProblema.findAll", query = "SELECT s FROM SolucaoProblema s")
    , @NamedQuery(name = "SolucaoProblema.findBySolucaoProblemaId", query = "SELECT s FROM SolucaoProblema s WHERE s.solucaoProblemaId = :solucaoProblemaId")
    , @NamedQuery(name = "SolucaoProblema.findBySolucaoProblemacoFlag", query = "SELECT s FROM SolucaoProblema s WHERE s.solucaoProblemacoFlag = :solucaoProblemacoFlag")
    , @NamedQuery(name = "SolucaoProblema.findBySolucaoProblemaData", query = "SELECT s FROM SolucaoProblema s WHERE s.solucaoProblemaData = :solucaoProblemaData")
    , @NamedQuery(name = "SolucaoProblema.findBySolucaoProblemaUpdate", query = "SELECT s FROM SolucaoProblema s WHERE s.solucaoProblemaUpdate = :solucaoProblemaUpdate")})
public class SolucaoProblema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "solucao_problema_id")
    private Integer solucaoProblemaId;
    @Column(name = "solucao_problemaco_flag")
    private Integer solucaoProblemacoFlag;
    @Column(name = "solucao_problema_data")
    @Temporal(TemporalType.DATE)
    private Date solucaoProblemaData;
    @Column(name = "solucao_problema_update")
    @Temporal(TemporalType.DATE)
    private Date solucaoProblemaUpdate;
    @OneToMany(mappedBy = "solucaoProblemaSolucaoProblemaId")
    private List<Chamada> chamadaList;
    @JoinColumn(name = "problema_problema", referencedColumnName = "problema")
    @ManyToOne
    private Problema problemaProblema;
    @JoinColumn(name = "solucao_solucao_id", referencedColumnName = "solucao_id")
    @ManyToOne
    private Solucao solucaoSolucaoId;

    public SolucaoProblema() {
    }

    public SolucaoProblema(Integer solucaoProblemaId) {
        this.solucaoProblemaId = solucaoProblemaId;
    }

    public Integer getSolucaoProblemaId() {
        return solucaoProblemaId;
    }

    public void setSolucaoProblemaId(Integer solucaoProblemaId) {
        this.solucaoProblemaId = solucaoProblemaId;
    }

    public Integer getSolucaoProblemacoFlag() {
        return solucaoProblemacoFlag;
    }

    public void setSolucaoProblemacoFlag(Integer solucaoProblemacoFlag) {
        this.solucaoProblemacoFlag = solucaoProblemacoFlag;
    }

    public Date getSolucaoProblemaData() {
        return solucaoProblemaData;
    }

    public void setSolucaoProblemaData(Date solucaoProblemaData) {
        this.solucaoProblemaData = solucaoProblemaData;
    }

    public Date getSolucaoProblemaUpdate() {
        return solucaoProblemaUpdate;
    }

    public void setSolucaoProblemaUpdate(Date solucaoProblemaUpdate) {
        this.solucaoProblemaUpdate = solucaoProblemaUpdate;
    }

    @XmlTransient
    public List<Chamada> getChamadaList() {
        return chamadaList;
    }

    public void setChamadaList(List<Chamada> chamadaList) {
        this.chamadaList = chamadaList;
    }

    public Problema getProblemaProblema() {
        return problemaProblema;
    }

    public void setProblemaProblema(Problema problemaProblema) {
        this.problemaProblema = problemaProblema;
    }

    public Solucao getSolucaoSolucaoId() {
        return solucaoSolucaoId;
    }

    public void setSolucaoSolucaoId(Solucao solucaoSolucaoId) {
        this.solucaoSolucaoId = solucaoSolucaoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solucaoProblemaId != null ? solucaoProblemaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolucaoProblema)) {
            return false;
        }
        SolucaoProblema other = (SolucaoProblema) object;
        if ((this.solucaoProblemaId == null && other.solucaoProblemaId != null) || (this.solucaoProblemaId != null && !this.solucaoProblemaId.equals(other.solucaoProblemaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.SolucaoProblema[ solucaoProblemaId=" + solucaoProblemaId + " ]";
    }
    
}
