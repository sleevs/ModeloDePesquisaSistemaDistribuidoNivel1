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
@Table(name = "entrega_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntregaStatus.findAll", query = "SELECT e FROM EntregaStatus e")
    , @NamedQuery(name = "EntregaStatus.findByEntregaServicoId", query = "SELECT e FROM EntregaStatus e WHERE e.entregaServicoId = :entregaServicoId")
    , @NamedQuery(name = "EntregaStatus.findByEntregaServicoUpdate", query = "SELECT e FROM EntregaStatus e WHERE e.entregaServicoUpdate = :entregaServicoUpdate")
    , @NamedQuery(name = "EntregaStatus.findByEntregaServicoFlag", query = "SELECT e FROM EntregaStatus e WHERE e.entregaServicoFlag = :entregaServicoFlag")
    , @NamedQuery(name = "EntregaStatus.findByEntregaStatusTipo", query = "SELECT e FROM EntregaStatus e WHERE e.entregaStatusTipo = :entregaStatusTipo")
    , @NamedQuery(name = "EntregaStatus.findByEntregaStatusLatitude", query = "SELECT e FROM EntregaStatus e WHERE e.entregaStatusLatitude = :entregaStatusLatitude")
    , @NamedQuery(name = "EntregaStatus.findByEntregaStatusLongitude", query = "SELECT e FROM EntregaStatus e WHERE e.entregaStatusLongitude = :entregaStatusLongitude")})
public class EntregaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entrega_servico_id")
    private Integer entregaServicoId;
    @Column(name = "entrega_servico_update")
    @Temporal(TemporalType.DATE)
    private Date entregaServicoUpdate;
    @Column(name = "entrega_servico_flag")
    private Integer entregaServicoFlag;
    @Size(max = 45)
    @Column(name = "entrega_status_tipo")
    private String entregaStatusTipo;
    @Size(max = 45)
    @Column(name = "entrega_status_latitude")
    private String entregaStatusLatitude;
    @Size(max = 45)
    @Column(name = "entrega_status_longitude")
    private String entregaStatusLongitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entregaStatusEntregaServicoId")
    private List<Entrega> entregaList;

    public EntregaStatus() {
    }

    public EntregaStatus(Integer entregaServicoId) {
        this.entregaServicoId = entregaServicoId;
    }

    public Integer getEntregaServicoId() {
        return entregaServicoId;
    }

    public void setEntregaServicoId(Integer entregaServicoId) {
        this.entregaServicoId = entregaServicoId;
    }

    public Date getEntregaServicoUpdate() {
        return entregaServicoUpdate;
    }

    public void setEntregaServicoUpdate(Date entregaServicoUpdate) {
        this.entregaServicoUpdate = entregaServicoUpdate;
    }

    public Integer getEntregaServicoFlag() {
        return entregaServicoFlag;
    }

    public void setEntregaServicoFlag(Integer entregaServicoFlag) {
        this.entregaServicoFlag = entregaServicoFlag;
    }

    public String getEntregaStatusTipo() {
        return entregaStatusTipo;
    }

    public void setEntregaStatusTipo(String entregaStatusTipo) {
        this.entregaStatusTipo = entregaStatusTipo;
    }

    public String getEntregaStatusLatitude() {
        return entregaStatusLatitude;
    }

    public void setEntregaStatusLatitude(String entregaStatusLatitude) {
        this.entregaStatusLatitude = entregaStatusLatitude;
    }

    public String getEntregaStatusLongitude() {
        return entregaStatusLongitude;
    }

    public void setEntregaStatusLongitude(String entregaStatusLongitude) {
        this.entregaStatusLongitude = entregaStatusLongitude;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entregaServicoId != null ? entregaServicoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntregaStatus)) {
            return false;
        }
        EntregaStatus other = (EntregaStatus) object;
        if ((this.entregaServicoId == null && other.entregaServicoId != null) || (this.entregaServicoId != null && !this.entregaServicoId.equals(other.entregaServicoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.EntregaStatus[ entregaServicoId=" + entregaServicoId + " ]";
    }
    
}
