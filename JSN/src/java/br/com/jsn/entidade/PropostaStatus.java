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
@Table(name = "proposta_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropostaStatus.findAll", query = "SELECT p FROM PropostaStatus p")
    , @NamedQuery(name = "PropostaStatus.findByPropostaStatusId", query = "SELECT p FROM PropostaStatus p WHERE p.propostaStatusId = :propostaStatusId")
    , @NamedQuery(name = "PropostaStatus.findByPropostaStatusUpdate", query = "SELECT p FROM PropostaStatus p WHERE p.propostaStatusUpdate = :propostaStatusUpdate")
    , @NamedQuery(name = "PropostaStatus.findByPropostaStatusFlag", query = "SELECT p FROM PropostaStatus p WHERE p.propostaStatusFlag = :propostaStatusFlag")
    , @NamedQuery(name = "PropostaStatus.findByPropostaStatusTipo", query = "SELECT p FROM PropostaStatus p WHERE p.propostaStatusTipo = :propostaStatusTipo")})
public class PropostaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proposta_status_id")
    private Integer propostaStatusId;
    @Column(name = "proposta_status_update")
    @Temporal(TemporalType.DATE)
    private Date propostaStatusUpdate;
    @Column(name = "proposta_status_flag")
    private Integer propostaStatusFlag;
    @Size(max = 45)
    @Column(name = "proposta_status_tipo")
    private String propostaStatusTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propostaStatusPropostaStatusId")
    private List<Proposta> propostaList;

    public PropostaStatus() {
    }

    public PropostaStatus(Integer propostaStatusId) {
        this.propostaStatusId = propostaStatusId;
    }

    public Integer getPropostaStatusId() {
        return propostaStatusId;
    }

    public void setPropostaStatusId(Integer propostaStatusId) {
        this.propostaStatusId = propostaStatusId;
    }

    public Date getPropostaStatusUpdate() {
        return propostaStatusUpdate;
    }

    public void setPropostaStatusUpdate(Date propostaStatusUpdate) {
        this.propostaStatusUpdate = propostaStatusUpdate;
    }

    public Integer getPropostaStatusFlag() {
        return propostaStatusFlag;
    }

    public void setPropostaStatusFlag(Integer propostaStatusFlag) {
        this.propostaStatusFlag = propostaStatusFlag;
    }

    public String getPropostaStatusTipo() {
        return propostaStatusTipo;
    }

    public void setPropostaStatusTipo(String propostaStatusTipo) {
        this.propostaStatusTipo = propostaStatusTipo;
    }

    @XmlTransient
    public List<Proposta> getPropostaList() {
        return propostaList;
    }

    public void setPropostaList(List<Proposta> propostaList) {
        this.propostaList = propostaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propostaStatusId != null ? propostaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropostaStatus)) {
            return false;
        }
        PropostaStatus other = (PropostaStatus) object;
        if ((this.propostaStatusId == null && other.propostaStatusId != null) || (this.propostaStatusId != null && !this.propostaStatusId.equals(other.propostaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.PropostaStatus[ propostaStatusId=" + propostaStatusId + " ]";
    }
    
}
