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
@Table(name = "corrida_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorridaStatus.findAll", query = "SELECT c FROM CorridaStatus c")
    , @NamedQuery(name = "CorridaStatus.findByCorridaStatusId", query = "SELECT c FROM CorridaStatus c WHERE c.corridaStatusId = :corridaStatusId")
    , @NamedQuery(name = "CorridaStatus.findByCorridaStatusUpdate", query = "SELECT c FROM CorridaStatus c WHERE c.corridaStatusUpdate = :corridaStatusUpdate")
    , @NamedQuery(name = "CorridaStatus.findByCorridaStatusFlag", query = "SELECT c FROM CorridaStatus c WHERE c.corridaStatusFlag = :corridaStatusFlag")
    , @NamedQuery(name = "CorridaStatus.findByCorridaStatusTipo", query = "SELECT c FROM CorridaStatus c WHERE c.corridaStatusTipo = :corridaStatusTipo")
    , @NamedQuery(name = "CorridaStatus.findByCorridaStatusLatitude", query = "SELECT c FROM CorridaStatus c WHERE c.corridaStatusLatitude = :corridaStatusLatitude")
    , @NamedQuery(name = "CorridaStatus.findByServicoProdutoLongetude", query = "SELECT c FROM CorridaStatus c WHERE c.servicoProdutoLongetude = :servicoProdutoLongetude")})
public class CorridaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "corrida_status_id")
    private Integer corridaStatusId;
    @Column(name = "corrida_status_update")
    @Temporal(TemporalType.DATE)
    private Date corridaStatusUpdate;
    @Size(max = 45)
    @Column(name = "corrida_status_flag")
    private String corridaStatusFlag;
    @Size(max = 45)
    @Column(name = "corrida_status_tipo")
    private String corridaStatusTipo;
    @Size(max = 45)
    @Column(name = "corrida_status_latitude")
    private String corridaStatusLatitude;
    @Size(max = 45)
    @Column(name = "servico_produto_longetude")
    private String servicoProdutoLongetude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "corridaStatusCorridaStatusId")
    private List<Corrida> corridaList;

    public CorridaStatus() {
    }

    public CorridaStatus(Integer corridaStatusId) {
        this.corridaStatusId = corridaStatusId;
    }

    public Integer getCorridaStatusId() {
        return corridaStatusId;
    }

    public void setCorridaStatusId(Integer corridaStatusId) {
        this.corridaStatusId = corridaStatusId;
    }

    public Date getCorridaStatusUpdate() {
        return corridaStatusUpdate;
    }

    public void setCorridaStatusUpdate(Date corridaStatusUpdate) {
        this.corridaStatusUpdate = corridaStatusUpdate;
    }

    public String getCorridaStatusFlag() {
        return corridaStatusFlag;
    }

    public void setCorridaStatusFlag(String corridaStatusFlag) {
        this.corridaStatusFlag = corridaStatusFlag;
    }

    public String getCorridaStatusTipo() {
        return corridaStatusTipo;
    }

    public void setCorridaStatusTipo(String corridaStatusTipo) {
        this.corridaStatusTipo = corridaStatusTipo;
    }

    public String getCorridaStatusLatitude() {
        return corridaStatusLatitude;
    }

    public void setCorridaStatusLatitude(String corridaStatusLatitude) {
        this.corridaStatusLatitude = corridaStatusLatitude;
    }

    public String getServicoProdutoLongetude() {
        return servicoProdutoLongetude;
    }

    public void setServicoProdutoLongetude(String servicoProdutoLongetude) {
        this.servicoProdutoLongetude = servicoProdutoLongetude;
    }

    @XmlTransient
    public List<Corrida> getCorridaList() {
        return corridaList;
    }

    public void setCorridaList(List<Corrida> corridaList) {
        this.corridaList = corridaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (corridaStatusId != null ? corridaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorridaStatus)) {
            return false;
        }
        CorridaStatus other = (CorridaStatus) object;
        if ((this.corridaStatusId == null && other.corridaStatusId != null) || (this.corridaStatusId != null && !this.corridaStatusId.equals(other.corridaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.CorridaStatus[ corridaStatusId=" + corridaStatusId + " ]";
    }
    
}
