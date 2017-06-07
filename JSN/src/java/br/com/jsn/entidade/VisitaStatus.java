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
@Table(name = "visita_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VisitaStatus.findAll", query = "SELECT v FROM VisitaStatus v")
    , @NamedQuery(name = "VisitaStatus.findByVisitaStatusId", query = "SELECT v FROM VisitaStatus v WHERE v.visitaStatusId = :visitaStatusId")
    , @NamedQuery(name = "VisitaStatus.findByVisitaStatusUpdate", query = "SELECT v FROM VisitaStatus v WHERE v.visitaStatusUpdate = :visitaStatusUpdate")
    , @NamedQuery(name = "VisitaStatus.findByVisitaStatusFlag", query = "SELECT v FROM VisitaStatus v WHERE v.visitaStatusFlag = :visitaStatusFlag")
    , @NamedQuery(name = "VisitaStatus.findByVisitaStatusTipo", query = "SELECT v FROM VisitaStatus v WHERE v.visitaStatusTipo = :visitaStatusTipo")})
public class VisitaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "visita_status_id")
    private Integer visitaStatusId;
    @Column(name = "visita_status_update")
    @Temporal(TemporalType.DATE)
    private Date visitaStatusUpdate;
    @Column(name = "visita_status_flag")
    private Integer visitaStatusFlag;
    @Size(max = 45)
    @Column(name = "visita_status_tipo")
    private String visitaStatusTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visitaStatusVisitaStatusId")
    private List<Visita> visitaList;

    public VisitaStatus() {
    }

    public VisitaStatus(Integer visitaStatusId) {
        this.visitaStatusId = visitaStatusId;
    }

    public Integer getVisitaStatusId() {
        return visitaStatusId;
    }

    public void setVisitaStatusId(Integer visitaStatusId) {
        this.visitaStatusId = visitaStatusId;
    }

    public Date getVisitaStatusUpdate() {
        return visitaStatusUpdate;
    }

    public void setVisitaStatusUpdate(Date visitaStatusUpdate) {
        this.visitaStatusUpdate = visitaStatusUpdate;
    }

    public Integer getVisitaStatusFlag() {
        return visitaStatusFlag;
    }

    public void setVisitaStatusFlag(Integer visitaStatusFlag) {
        this.visitaStatusFlag = visitaStatusFlag;
    }

    public String getVisitaStatusTipo() {
        return visitaStatusTipo;
    }

    public void setVisitaStatusTipo(String visitaStatusTipo) {
        this.visitaStatusTipo = visitaStatusTipo;
    }

    @XmlTransient
    public List<Visita> getVisitaList() {
        return visitaList;
    }

    public void setVisitaList(List<Visita> visitaList) {
        this.visitaList = visitaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitaStatusId != null ? visitaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitaStatus)) {
            return false;
        }
        VisitaStatus other = (VisitaStatus) object;
        if ((this.visitaStatusId == null && other.visitaStatusId != null) || (this.visitaStatusId != null && !this.visitaStatusId.equals(other.visitaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.VisitaStatus[ visitaStatusId=" + visitaStatusId + " ]";
    }
    
}
