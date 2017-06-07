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
import javax.persistence.Lob;
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
@Table(name = "compartilhar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compartilhar.findAll", query = "SELECT c FROM Compartilhar c")
    , @NamedQuery(name = "Compartilhar.findByCompartilharId", query = "SELECT c FROM Compartilhar c WHERE c.compartilharId = :compartilharId")
    , @NamedQuery(name = "Compartilhar.findByCompartilharData", query = "SELECT c FROM Compartilhar c WHERE c.compartilharData = :compartilharData")
    , @NamedQuery(name = "Compartilhar.findByCompartilharDescricao", query = "SELECT c FROM Compartilhar c WHERE c.compartilharDescricao = :compartilharDescricao")
    , @NamedQuery(name = "Compartilhar.findByCompartilharFlag", query = "SELECT c FROM Compartilhar c WHERE c.compartilharFlag = :compartilharFlag")
    , @NamedQuery(name = "Compartilhar.findByCompartilharStatus", query = "SELECT c FROM Compartilhar c WHERE c.compartilharStatus = :compartilharStatus")})
public class Compartilhar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compartilhar_id")
    private Integer compartilharId;
    @Column(name = "compartilhar_data")
    @Temporal(TemporalType.DATE)
    private Date compartilharData;
    @Size(max = 45)
    @Column(name = "compartilhar_descricao")
    private String compartilharDescricao;
    @Size(max = 45)
    @Column(name = "compartilhar_flag")
    private String compartilharFlag;
    @Size(max = 45)
    @Column(name = "compartilhar_status")
    private String compartilharStatus;
    @Lob
    @Size(max = 65535)
    @Column(name = "compartilhar_imagem")
    private String compartilharImagem;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;
    @JoinColumn(name = "social_social_id", referencedColumnName = "social_id")
    @ManyToOne(optional = false)
    private Social socialSocialId;

    public Compartilhar() {
    }

    public Compartilhar(Integer compartilharId) {
        this.compartilharId = compartilharId;
    }

    public Integer getCompartilharId() {
        return compartilharId;
    }

    public void setCompartilharId(Integer compartilharId) {
        this.compartilharId = compartilharId;
    }

    public Date getCompartilharData() {
        return compartilharData;
    }

    public void setCompartilharData(Date compartilharData) {
        this.compartilharData = compartilharData;
    }

    public String getCompartilharDescricao() {
        return compartilharDescricao;
    }

    public void setCompartilharDescricao(String compartilharDescricao) {
        this.compartilharDescricao = compartilharDescricao;
    }

    public String getCompartilharFlag() {
        return compartilharFlag;
    }

    public void setCompartilharFlag(String compartilharFlag) {
        this.compartilharFlag = compartilharFlag;
    }

    public String getCompartilharStatus() {
        return compartilharStatus;
    }

    public void setCompartilharStatus(String compartilharStatus) {
        this.compartilharStatus = compartilharStatus;
    }

    public String getCompartilharImagem() {
        return compartilharImagem;
    }

    public void setCompartilharImagem(String compartilharImagem) {
        this.compartilharImagem = compartilharImagem;
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
        hash += (compartilharId != null ? compartilharId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compartilhar)) {
            return false;
        }
        Compartilhar other = (Compartilhar) object;
        if ((this.compartilharId == null && other.compartilharId != null) || (this.compartilharId != null && !this.compartilharId.equals(other.compartilharId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Compartilhar[ compartilharId=" + compartilharId + " ]";
    }
    
}
