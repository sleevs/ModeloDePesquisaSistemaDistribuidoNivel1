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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "security_conta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecurityConta.findAll", query = "SELECT s FROM SecurityConta s")
    , @NamedQuery(name = "SecurityConta.findBySecuritySecurityId", query = "SELECT s FROM SecurityConta s WHERE s.securitySecurityId = :securitySecurityId")
    , @NamedQuery(name = "SecurityConta.findBySecurityContaData", query = "SELECT s FROM SecurityConta s WHERE s.securityContaData = :securityContaData")
    , @NamedQuery(name = "SecurityConta.findBySecurityContaStatus", query = "SELECT s FROM SecurityConta s WHERE s.securityContaStatus = :securityContaStatus")
    , @NamedQuery(name = "SecurityConta.findBySecurityContaFlag", query = "SELECT s FROM SecurityConta s WHERE s.securityContaFlag = :securityContaFlag")})
public class SecurityConta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "security_security_id")
    private Integer securitySecurityId;
    @Column(name = "security_conta_data")
    @Temporal(TemporalType.DATE)
    private Date securityContaData;
    @Size(max = 45)
    @Column(name = "security_conta_status")
    private String securityContaStatus;
    @Size(max = 45)
    @Column(name = "security_conta_flag")
    private String securityContaFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "securityContaSecuritySecurityId")
    private List<Conta> contaList;
    @JoinColumn(name = "security_security_id1", referencedColumnName = "security_id")
    @ManyToOne(optional = false)
    private Security securitySecurityId1;

    public SecurityConta() {
    }

    public SecurityConta(Integer securitySecurityId) {
        this.securitySecurityId = securitySecurityId;
    }

    public Integer getSecuritySecurityId() {
        return securitySecurityId;
    }

    public void setSecuritySecurityId(Integer securitySecurityId) {
        this.securitySecurityId = securitySecurityId;
    }

    public Date getSecurityContaData() {
        return securityContaData;
    }

    public void setSecurityContaData(Date securityContaData) {
        this.securityContaData = securityContaData;
    }

    public String getSecurityContaStatus() {
        return securityContaStatus;
    }

    public void setSecurityContaStatus(String securityContaStatus) {
        this.securityContaStatus = securityContaStatus;
    }

    public String getSecurityContaFlag() {
        return securityContaFlag;
    }

    public void setSecurityContaFlag(String securityContaFlag) {
        this.securityContaFlag = securityContaFlag;
    }

    @XmlTransient
    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    public Security getSecuritySecurityId1() {
        return securitySecurityId1;
    }

    public void setSecuritySecurityId1(Security securitySecurityId1) {
        this.securitySecurityId1 = securitySecurityId1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (securitySecurityId != null ? securitySecurityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityConta)) {
            return false;
        }
        SecurityConta other = (SecurityConta) object;
        if ((this.securitySecurityId == null && other.securitySecurityId != null) || (this.securitySecurityId != null && !this.securitySecurityId.equals(other.securitySecurityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.SecurityConta[ securitySecurityId=" + securitySecurityId + " ]";
    }
    
}
