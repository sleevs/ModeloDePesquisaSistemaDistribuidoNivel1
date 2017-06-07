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
@Table(name = "anuncio_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnuncioStatus.findAll", query = "SELECT a FROM AnuncioStatus a")
    , @NamedQuery(name = "AnuncioStatus.findByAnuncioStatusId", query = "SELECT a FROM AnuncioStatus a WHERE a.anuncioStatusId = :anuncioStatusId")
    , @NamedQuery(name = "AnuncioStatus.findByAnuncioStatusTipo", query = "SELECT a FROM AnuncioStatus a WHERE a.anuncioStatusTipo = :anuncioStatusTipo")
    , @NamedQuery(name = "AnuncioStatus.findByAnuncioStatusUpdate", query = "SELECT a FROM AnuncioStatus a WHERE a.anuncioStatusUpdate = :anuncioStatusUpdate")
    , @NamedQuery(name = "AnuncioStatus.findByAnuncioStatusFlag", query = "SELECT a FROM AnuncioStatus a WHERE a.anuncioStatusFlag = :anuncioStatusFlag")})
public class AnuncioStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "anuncio_status_id")
    private Integer anuncioStatusId;
    @Size(max = 45)
    @Column(name = "anuncio_status_tipo")
    private String anuncioStatusTipo;
    @Column(name = "anuncio_status_update")
    @Temporal(TemporalType.DATE)
    private Date anuncioStatusUpdate;
    @Column(name = "anuncio_status_flag")
    private Integer anuncioStatusFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anuncioStatusAnuncioStatusId")
    private List<Anuncio> anuncioList;

    public AnuncioStatus() {
    }

    public AnuncioStatus(Integer anuncioStatusId) {
        this.anuncioStatusId = anuncioStatusId;
    }

    public Integer getAnuncioStatusId() {
        return anuncioStatusId;
    }

    public void setAnuncioStatusId(Integer anuncioStatusId) {
        this.anuncioStatusId = anuncioStatusId;
    }

    public String getAnuncioStatusTipo() {
        return anuncioStatusTipo;
    }

    public void setAnuncioStatusTipo(String anuncioStatusTipo) {
        this.anuncioStatusTipo = anuncioStatusTipo;
    }

    public Date getAnuncioStatusUpdate() {
        return anuncioStatusUpdate;
    }

    public void setAnuncioStatusUpdate(Date anuncioStatusUpdate) {
        this.anuncioStatusUpdate = anuncioStatusUpdate;
    }

    public Integer getAnuncioStatusFlag() {
        return anuncioStatusFlag;
    }

    public void setAnuncioStatusFlag(Integer anuncioStatusFlag) {
        this.anuncioStatusFlag = anuncioStatusFlag;
    }

    @XmlTransient
    public List<Anuncio> getAnuncioList() {
        return anuncioList;
    }

    public void setAnuncioList(List<Anuncio> anuncioList) {
        this.anuncioList = anuncioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (anuncioStatusId != null ? anuncioStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnuncioStatus)) {
            return false;
        }
        AnuncioStatus other = (AnuncioStatus) object;
        if ((this.anuncioStatusId == null && other.anuncioStatusId != null) || (this.anuncioStatusId != null && !this.anuncioStatusId.equals(other.anuncioStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.AnuncioStatus[ anuncioStatusId=" + anuncioStatusId + " ]";
    }
    
}
