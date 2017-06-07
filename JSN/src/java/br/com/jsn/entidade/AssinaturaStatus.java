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
@Table(name = "assinatura_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssinaturaStatus.findAll", query = "SELECT a FROM AssinaturaStatus a")
    , @NamedQuery(name = "AssinaturaStatus.findByAssinaturaStatusId", query = "SELECT a FROM AssinaturaStatus a WHERE a.assinaturaStatusId = :assinaturaStatusId")
    , @NamedQuery(name = "AssinaturaStatus.findByAssinaturaStatusUpdate", query = "SELECT a FROM AssinaturaStatus a WHERE a.assinaturaStatusUpdate = :assinaturaStatusUpdate")
    , @NamedQuery(name = "AssinaturaStatus.findByAssinaturaStatusFlag", query = "SELECT a FROM AssinaturaStatus a WHERE a.assinaturaStatusFlag = :assinaturaStatusFlag")
    , @NamedQuery(name = "AssinaturaStatus.findByAssinaturaStatusTipo", query = "SELECT a FROM AssinaturaStatus a WHERE a.assinaturaStatusTipo = :assinaturaStatusTipo")})
public class AssinaturaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "assinatura_status_id")
    private Integer assinaturaStatusId;
    @Column(name = "assinatura_status_update")
    @Temporal(TemporalType.DATE)
    private Date assinaturaStatusUpdate;
    @Column(name = "assinatura_status_flag")
    private Integer assinaturaStatusFlag;
    @Size(max = 45)
    @Column(name = "assinatura_status_tipo")
    private String assinaturaStatusTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assinaturaStatusAssinaturaStatusId")
    private List<Assinatura> assinaturaList;

    public AssinaturaStatus() {
    }

    public AssinaturaStatus(Integer assinaturaStatusId) {
        this.assinaturaStatusId = assinaturaStatusId;
    }

    public Integer getAssinaturaStatusId() {
        return assinaturaStatusId;
    }

    public void setAssinaturaStatusId(Integer assinaturaStatusId) {
        this.assinaturaStatusId = assinaturaStatusId;
    }

    public Date getAssinaturaStatusUpdate() {
        return assinaturaStatusUpdate;
    }

    public void setAssinaturaStatusUpdate(Date assinaturaStatusUpdate) {
        this.assinaturaStatusUpdate = assinaturaStatusUpdate;
    }

    public Integer getAssinaturaStatusFlag() {
        return assinaturaStatusFlag;
    }

    public void setAssinaturaStatusFlag(Integer assinaturaStatusFlag) {
        this.assinaturaStatusFlag = assinaturaStatusFlag;
    }

    public String getAssinaturaStatusTipo() {
        return assinaturaStatusTipo;
    }

    public void setAssinaturaStatusTipo(String assinaturaStatusTipo) {
        this.assinaturaStatusTipo = assinaturaStatusTipo;
    }

    @XmlTransient
    public List<Assinatura> getAssinaturaList() {
        return assinaturaList;
    }

    public void setAssinaturaList(List<Assinatura> assinaturaList) {
        this.assinaturaList = assinaturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assinaturaStatusId != null ? assinaturaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssinaturaStatus)) {
            return false;
        }
        AssinaturaStatus other = (AssinaturaStatus) object;
        if ((this.assinaturaStatusId == null && other.assinaturaStatusId != null) || (this.assinaturaStatusId != null && !this.assinaturaStatusId.equals(other.assinaturaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.AssinaturaStatus[ assinaturaStatusId=" + assinaturaStatusId + " ]";
    }
    
}
