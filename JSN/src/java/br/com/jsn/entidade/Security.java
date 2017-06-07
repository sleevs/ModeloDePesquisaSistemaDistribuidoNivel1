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
@Table(name = "security")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Security.findAll", query = "SELECT s FROM Security s")
    , @NamedQuery(name = "Security.findBySecurityId", query = "SELECT s FROM Security s WHERE s.securityId = :securityId")
    , @NamedQuery(name = "Security.findBySecurityRegra", query = "SELECT s FROM Security s WHERE s.securityRegra = :securityRegra")
    , @NamedQuery(name = "Security.findBySecurityStatus", query = "SELECT s FROM Security s WHERE s.securityStatus = :securityStatus")
    , @NamedQuery(name = "Security.findBySecurityPermissao", query = "SELECT s FROM Security s WHERE s.securityPermissao = :securityPermissao")
    , @NamedQuery(name = "Security.findBySecurityData", query = "SELECT s FROM Security s WHERE s.securityData = :securityData")
    , @NamedQuery(name = "Security.findBySecurityNivel", query = "SELECT s FROM Security s WHERE s.securityNivel = :securityNivel")
    , @NamedQuery(name = "Security.findBySecurityOperacao", query = "SELECT s FROM Security s WHERE s.securityOperacao = :securityOperacao")})
public class Security implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "security_id")
    private Integer securityId;
    @Size(max = 45)
    @Column(name = "security_regra")
    private String securityRegra;
    @Size(max = 45)
    @Column(name = "security_status")
    private String securityStatus;
    @Size(max = 45)
    @Column(name = "security_permissao")
    private String securityPermissao;
    @Column(name = "security_data")
    @Temporal(TemporalType.DATE)
    private Date securityData;
    @Column(name = "security_nivel")
    private Integer securityNivel;
    @Size(max = 45)
    @Column(name = "security_operacao")
    private String securityOperacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "securitySecurityId1")
    private List<SecurityConta> securityContaList;

    public Security() {
    }

    public Security(Integer securityId) {
        this.securityId = securityId;
    }

    public Integer getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Integer securityId) {
        this.securityId = securityId;
    }

    public String getSecurityRegra() {
        return securityRegra;
    }

    public void setSecurityRegra(String securityRegra) {
        this.securityRegra = securityRegra;
    }

    public String getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
    }

    public String getSecurityPermissao() {
        return securityPermissao;
    }

    public void setSecurityPermissao(String securityPermissao) {
        this.securityPermissao = securityPermissao;
    }

    public Date getSecurityData() {
        return securityData;
    }

    public void setSecurityData(Date securityData) {
        this.securityData = securityData;
    }

    public Integer getSecurityNivel() {
        return securityNivel;
    }

    public void setSecurityNivel(Integer securityNivel) {
        this.securityNivel = securityNivel;
    }

    public String getSecurityOperacao() {
        return securityOperacao;
    }

    public void setSecurityOperacao(String securityOperacao) {
        this.securityOperacao = securityOperacao;
    }

    @XmlTransient
    public List<SecurityConta> getSecurityContaList() {
        return securityContaList;
    }

    public void setSecurityContaList(List<SecurityConta> securityContaList) {
        this.securityContaList = securityContaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (securityId != null ? securityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Security)) {
            return false;
        }
        Security other = (Security) object;
        if ((this.securityId == null && other.securityId != null) || (this.securityId != null && !this.securityId.equals(other.securityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Security[ securityId=" + securityId + " ]";
    }
    
}
