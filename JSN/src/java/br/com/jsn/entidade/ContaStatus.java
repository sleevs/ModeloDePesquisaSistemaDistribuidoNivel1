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
@Table(name = "conta_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContaStatus.findAll", query = "SELECT c FROM ContaStatus c")
    , @NamedQuery(name = "ContaStatus.findByContaStatusId", query = "SELECT c FROM ContaStatus c WHERE c.contaStatusId = :contaStatusId")
    , @NamedQuery(name = "ContaStatus.findByContaStatusFlag", query = "SELECT c FROM ContaStatus c WHERE c.contaStatusFlag = :contaStatusFlag")
    , @NamedQuery(name = "ContaStatus.findByContaStatusTipo", query = "SELECT c FROM ContaStatus c WHERE c.contaStatusTipo = :contaStatusTipo")
    , @NamedQuery(name = "ContaStatus.findByContaStatusUpdate", query = "SELECT c FROM ContaStatus c WHERE c.contaStatusUpdate = :contaStatusUpdate")
    , @NamedQuery(name = "ContaStatus.findByContaStatusLongetude", query = "SELECT c FROM ContaStatus c WHERE c.contaStatusLongetude = :contaStatusLongetude")
    , @NamedQuery(name = "ContaStatus.findByContaStatusLatitude", query = "SELECT c FROM ContaStatus c WHERE c.contaStatusLatitude = :contaStatusLatitude")})
public class ContaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "conta_status_id")
    private Integer contaStatusId;
    @Column(name = "conta_status_flag")
    private Integer contaStatusFlag;
    @Size(max = 45)
    @Column(name = "conta_status_tipo")
    private String contaStatusTipo;
    @Column(name = "conta_status_update")
    @Temporal(TemporalType.DATE)
    private Date contaStatusUpdate;
    @Size(max = 45)
    @Column(name = "conta_status_longetude")
    private String contaStatusLongetude;
    @Size(max = 45)
    @Column(name = "conta_status_latitude")
    private String contaStatusLatitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaStatusContaStatusId")
    private List<Conta> contaList;

    public ContaStatus() {
    }

    public ContaStatus(Integer contaStatusId) {
        this.contaStatusId = contaStatusId;
    }

    public Integer getContaStatusId() {
        return contaStatusId;
    }

    public void setContaStatusId(Integer contaStatusId) {
        this.contaStatusId = contaStatusId;
    }

    public Integer getContaStatusFlag() {
        return contaStatusFlag;
    }

    public void setContaStatusFlag(Integer contaStatusFlag) {
        this.contaStatusFlag = contaStatusFlag;
    }

    public String getContaStatusTipo() {
        return contaStatusTipo;
    }

    public void setContaStatusTipo(String contaStatusTipo) {
        this.contaStatusTipo = contaStatusTipo;
    }

    public Date getContaStatusUpdate() {
        return contaStatusUpdate;
    }

    public void setContaStatusUpdate(Date contaStatusUpdate) {
        this.contaStatusUpdate = contaStatusUpdate;
    }

    public String getContaStatusLongetude() {
        return contaStatusLongetude;
    }

    public void setContaStatusLongetude(String contaStatusLongetude) {
        this.contaStatusLongetude = contaStatusLongetude;
    }

    public String getContaStatusLatitude() {
        return contaStatusLatitude;
    }

    public void setContaStatusLatitude(String contaStatusLatitude) {
        this.contaStatusLatitude = contaStatusLatitude;
    }

    @XmlTransient
    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contaStatusId != null ? contaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContaStatus)) {
            return false;
        }
        ContaStatus other = (ContaStatus) object;
        if ((this.contaStatusId == null && other.contaStatusId != null) || (this.contaStatusId != null && !this.contaStatusId.equals(other.contaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.ContaStatus[ contaStatusId=" + contaStatusId + " ]";
    }
    
}
