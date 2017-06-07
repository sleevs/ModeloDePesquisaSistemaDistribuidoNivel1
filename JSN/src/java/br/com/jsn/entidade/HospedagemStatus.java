/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "hospedagem_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HospedagemStatus.findAll", query = "SELECT h FROM HospedagemStatus h")
    , @NamedQuery(name = "HospedagemStatus.findByHospedagemStatusId", query = "SELECT h FROM HospedagemStatus h WHERE h.hospedagemStatusId = :hospedagemStatusId")
    , @NamedQuery(name = "HospedagemStatus.findByHospedagemStatusUpdate", query = "SELECT h FROM HospedagemStatus h WHERE h.hospedagemStatusUpdate = :hospedagemStatusUpdate")
    , @NamedQuery(name = "HospedagemStatus.findByHospedagemStatusTipo", query = "SELECT h FROM HospedagemStatus h WHERE h.hospedagemStatusTipo = :hospedagemStatusTipo")
    , @NamedQuery(name = "HospedagemStatus.findByHospedagemStatusFlag", query = "SELECT h FROM HospedagemStatus h WHERE h.hospedagemStatusFlag = :hospedagemStatusFlag")})
public class HospedagemStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hospedagem_status_id")
    private Integer hospedagemStatusId;
    @Size(max = 45)
    @Column(name = "hospedagem_status_update")
    private String hospedagemStatusUpdate;
    @Size(max = 45)
    @Column(name = "hospedagem_status_tipo")
    private String hospedagemStatusTipo;
    @Size(max = 45)
    @Column(name = "hospedagem_status_flag")
    private String hospedagemStatusFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospedagemStatusHospedagemStatusId")
    private List<Hospedagem> hospedagemList;

    public HospedagemStatus() {
    }

    public HospedagemStatus(Integer hospedagemStatusId) {
        this.hospedagemStatusId = hospedagemStatusId;
    }

    public Integer getHospedagemStatusId() {
        return hospedagemStatusId;
    }

    public void setHospedagemStatusId(Integer hospedagemStatusId) {
        this.hospedagemStatusId = hospedagemStatusId;
    }

    public String getHospedagemStatusUpdate() {
        return hospedagemStatusUpdate;
    }

    public void setHospedagemStatusUpdate(String hospedagemStatusUpdate) {
        this.hospedagemStatusUpdate = hospedagemStatusUpdate;
    }

    public String getHospedagemStatusTipo() {
        return hospedagemStatusTipo;
    }

    public void setHospedagemStatusTipo(String hospedagemStatusTipo) {
        this.hospedagemStatusTipo = hospedagemStatusTipo;
    }

    public String getHospedagemStatusFlag() {
        return hospedagemStatusFlag;
    }

    public void setHospedagemStatusFlag(String hospedagemStatusFlag) {
        this.hospedagemStatusFlag = hospedagemStatusFlag;
    }

    @XmlTransient
    public List<Hospedagem> getHospedagemList() {
        return hospedagemList;
    }

    public void setHospedagemList(List<Hospedagem> hospedagemList) {
        this.hospedagemList = hospedagemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hospedagemStatusId != null ? hospedagemStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HospedagemStatus)) {
            return false;
        }
        HospedagemStatus other = (HospedagemStatus) object;
        if ((this.hospedagemStatusId == null && other.hospedagemStatusId != null) || (this.hospedagemStatusId != null && !this.hospedagemStatusId.equals(other.hospedagemStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.HospedagemStatus[ hospedagemStatusId=" + hospedagemStatusId + " ]";
    }
    
}
