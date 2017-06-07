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
@Table(name = "chamada_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChamadaStatus.findAll", query = "SELECT c FROM ChamadaStatus c")
    , @NamedQuery(name = "ChamadaStatus.findByChamadaStatusId", query = "SELECT c FROM ChamadaStatus c WHERE c.chamadaStatusId = :chamadaStatusId")
    , @NamedQuery(name = "ChamadaStatus.findByChamadaStatusTipo", query = "SELECT c FROM ChamadaStatus c WHERE c.chamadaStatusTipo = :chamadaStatusTipo")
    , @NamedQuery(name = "ChamadaStatus.findByChamadaStatusUpdate", query = "SELECT c FROM ChamadaStatus c WHERE c.chamadaStatusUpdate = :chamadaStatusUpdate")
    , @NamedQuery(name = "ChamadaStatus.findByChamadaStatusFlag", query = "SELECT c FROM ChamadaStatus c WHERE c.chamadaStatusFlag = :chamadaStatusFlag")})
public class ChamadaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "chamada_status_id")
    private Integer chamadaStatusId;
    @Size(max = 45)
    @Column(name = "chamada_status_tipo")
    private String chamadaStatusTipo;
    @Column(name = "chamada_status_update")
    @Temporal(TemporalType.DATE)
    private Date chamadaStatusUpdate;
    @Column(name = "chamada_status_flag")
    private Integer chamadaStatusFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chamadaStatusChamadaStatusId")
    private List<Chamada> chamadaList;

    public ChamadaStatus() {
    }

    public ChamadaStatus(Integer chamadaStatusId) {
        this.chamadaStatusId = chamadaStatusId;
    }

    public Integer getChamadaStatusId() {
        return chamadaStatusId;
    }

    public void setChamadaStatusId(Integer chamadaStatusId) {
        this.chamadaStatusId = chamadaStatusId;
    }

    public String getChamadaStatusTipo() {
        return chamadaStatusTipo;
    }

    public void setChamadaStatusTipo(String chamadaStatusTipo) {
        this.chamadaStatusTipo = chamadaStatusTipo;
    }

    public Date getChamadaStatusUpdate() {
        return chamadaStatusUpdate;
    }

    public void setChamadaStatusUpdate(Date chamadaStatusUpdate) {
        this.chamadaStatusUpdate = chamadaStatusUpdate;
    }

    public Integer getChamadaStatusFlag() {
        return chamadaStatusFlag;
    }

    public void setChamadaStatusFlag(Integer chamadaStatusFlag) {
        this.chamadaStatusFlag = chamadaStatusFlag;
    }

    @XmlTransient
    public List<Chamada> getChamadaList() {
        return chamadaList;
    }

    public void setChamadaList(List<Chamada> chamadaList) {
        this.chamadaList = chamadaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chamadaStatusId != null ? chamadaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChamadaStatus)) {
            return false;
        }
        ChamadaStatus other = (ChamadaStatus) object;
        if ((this.chamadaStatusId == null && other.chamadaStatusId != null) || (this.chamadaStatusId != null && !this.chamadaStatusId.equals(other.chamadaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.ChamadaStatus[ chamadaStatusId=" + chamadaStatusId + " ]";
    }
    
}
