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
@Table(name = "compra_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompraStatus.findAll", query = "SELECT c FROM CompraStatus c")
    , @NamedQuery(name = "CompraStatus.findByCompraStatusId", query = "SELECT c FROM CompraStatus c WHERE c.compraStatusId = :compraStatusId")
    , @NamedQuery(name = "CompraStatus.findByCompraStatusTipo", query = "SELECT c FROM CompraStatus c WHERE c.compraStatusTipo = :compraStatusTipo")
    , @NamedQuery(name = "CompraStatus.findByCompraStatusUpdate", query = "SELECT c FROM CompraStatus c WHERE c.compraStatusUpdate = :compraStatusUpdate")
    , @NamedQuery(name = "CompraStatus.findByCompraStatusFlag", query = "SELECT c FROM CompraStatus c WHERE c.compraStatusFlag = :compraStatusFlag")})
public class CompraStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compra_status_id")
    private Integer compraStatusId;
    @Size(max = 45)
    @Column(name = "compra_status_tipo")
    private String compraStatusTipo;
    @Column(name = "compra_status_update")
    @Temporal(TemporalType.DATE)
    private Date compraStatusUpdate;
    @Column(name = "compra_status_flag")
    private Integer compraStatusFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compraStatusCompraStatusId")
    private List<Compra> compraList;

    public CompraStatus() {
    }

    public CompraStatus(Integer compraStatusId) {
        this.compraStatusId = compraStatusId;
    }

    public Integer getCompraStatusId() {
        return compraStatusId;
    }

    public void setCompraStatusId(Integer compraStatusId) {
        this.compraStatusId = compraStatusId;
    }

    public String getCompraStatusTipo() {
        return compraStatusTipo;
    }

    public void setCompraStatusTipo(String compraStatusTipo) {
        this.compraStatusTipo = compraStatusTipo;
    }

    public Date getCompraStatusUpdate() {
        return compraStatusUpdate;
    }

    public void setCompraStatusUpdate(Date compraStatusUpdate) {
        this.compraStatusUpdate = compraStatusUpdate;
    }

    public Integer getCompraStatusFlag() {
        return compraStatusFlag;
    }

    public void setCompraStatusFlag(Integer compraStatusFlag) {
        this.compraStatusFlag = compraStatusFlag;
    }

    @XmlTransient
    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraStatusId != null ? compraStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraStatus)) {
            return false;
        }
        CompraStatus other = (CompraStatus) object;
        if ((this.compraStatusId == null && other.compraStatusId != null) || (this.compraStatusId != null && !this.compraStatusId.equals(other.compraStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.CompraStatus[ compraStatusId=" + compraStatusId + " ]";
    }
    
}
