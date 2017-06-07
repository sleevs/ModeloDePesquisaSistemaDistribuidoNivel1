/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "membro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Membro.findAll", query = "SELECT m FROM Membro m")
    , @NamedQuery(name = "Membro.findByMembroId", query = "SELECT m FROM Membro m WHERE m.membroId = :membroId")
    , @NamedQuery(name = "Membro.findByMembroData", query = "SELECT m FROM Membro m WHERE m.membroData = :membroData")
    , @NamedQuery(name = "Membro.findByMembroTipo", query = "SELECT m FROM Membro m WHERE m.membroTipo = :membroTipo")
    , @NamedQuery(name = "Membro.findByMembroStatus", query = "SELECT m FROM Membro m WHERE m.membroStatus = :membroStatus")
    , @NamedQuery(name = "Membro.findByMembroFlag", query = "SELECT m FROM Membro m WHERE m.membroFlag = :membroFlag")})
public class Membro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "membro_id")
    private Integer membroId;
    @Column(name = "membro_data")
    @Temporal(TemporalType.DATE)
    private Date membroData;
    @Size(max = 45)
    @Column(name = "membro_tipo")
    private String membroTipo;
    @Size(max = 45)
    @Column(name = "membro_status")
    private String membroStatus;
    @Column(name = "membro_flag")
    private Integer membroFlag;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;
    @JoinColumn(name = "social_social_id", referencedColumnName = "social_id")
    @ManyToOne(optional = false)
    private Social socialSocialId;

    public Membro() {
    }

    public Membro(Integer membroId) {
        this.membroId = membroId;
    }

    public Integer getMembroId() {
        return membroId;
    }

    public void setMembroId(Integer membroId) {
        this.membroId = membroId;
    }

    public Date getMembroData() {
        return membroData;
    }

    public void setMembroData(Date membroData) {
        this.membroData = membroData;
    }

    public String getMembroTipo() {
        return membroTipo;
    }

    public void setMembroTipo(String membroTipo) {
        this.membroTipo = membroTipo;
    }

    public String getMembroStatus() {
        return membroStatus;
    }

    public void setMembroStatus(String membroStatus) {
        this.membroStatus = membroStatus;
    }

    public Integer getMembroFlag() {
        return membroFlag;
    }

    public void setMembroFlag(Integer membroFlag) {
        this.membroFlag = membroFlag;
    }

    public Conta getContaConta() {
        return contaConta;
    }

    public void setContaConta(Conta contaConta) {
        this.contaConta = contaConta;
    }

    public Social getSocialSocialId() {
        return socialSocialId;
    }

    public void setSocialSocialId(Social socialSocialId) {
        this.socialSocialId = socialSocialId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (membroId != null ? membroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membro)) {
            return false;
        }
        Membro other = (Membro) object;
        if ((this.membroId == null && other.membroId != null) || (this.membroId != null && !this.membroId.equals(other.membroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Membro[ membroId=" + membroId + " ]";
    }
    
}
