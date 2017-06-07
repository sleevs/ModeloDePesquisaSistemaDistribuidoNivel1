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
@Table(name = "curtir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curtir.findAll", query = "SELECT c FROM Curtir c")
    , @NamedQuery(name = "Curtir.findByCurtirId", query = "SELECT c FROM Curtir c WHERE c.curtirId = :curtirId")
    , @NamedQuery(name = "Curtir.findByCurtirData", query = "SELECT c FROM Curtir c WHERE c.curtirData = :curtirData")
    , @NamedQuery(name = "Curtir.findByCurtirDescricao", query = "SELECT c FROM Curtir c WHERE c.curtirDescricao = :curtirDescricao")
    , @NamedQuery(name = "Curtir.findByCurtirFlag", query = "SELECT c FROM Curtir c WHERE c.curtirFlag = :curtirFlag")})
public class Curtir implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "curtir_id")
    private Integer curtirId;
    @Column(name = "curtir_data")
    @Temporal(TemporalType.DATE)
    private Date curtirData;
    @Size(max = 255)
    @Column(name = "curtir_descricao")
    private String curtirDescricao;
    @Column(name = "curtir_flag")
    private Integer curtirFlag;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;
    @JoinColumn(name = "social_social_id", referencedColumnName = "social_id")
    @ManyToOne(optional = false)
    private Social socialSocialId;

    public Curtir() {
    }

    public Curtir(Integer curtirId) {
        this.curtirId = curtirId;
    }

    public Integer getCurtirId() {
        return curtirId;
    }

    public void setCurtirId(Integer curtirId) {
        this.curtirId = curtirId;
    }

    public Date getCurtirData() {
        return curtirData;
    }

    public void setCurtirData(Date curtirData) {
        this.curtirData = curtirData;
    }

    public String getCurtirDescricao() {
        return curtirDescricao;
    }

    public void setCurtirDescricao(String curtirDescricao) {
        this.curtirDescricao = curtirDescricao;
    }

    public Integer getCurtirFlag() {
        return curtirFlag;
    }

    public void setCurtirFlag(Integer curtirFlag) {
        this.curtirFlag = curtirFlag;
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
        hash += (curtirId != null ? curtirId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curtir)) {
            return false;
        }
        Curtir other = (Curtir) object;
        if ((this.curtirId == null && other.curtirId != null) || (this.curtirId != null && !this.curtirId.equals(other.curtirId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Curtir[ curtirId=" + curtirId + " ]";
    }
    
}
