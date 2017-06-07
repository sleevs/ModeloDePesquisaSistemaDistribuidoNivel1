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
@Table(name = "plano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plano.findAll", query = "SELECT p FROM Plano p")
    , @NamedQuery(name = "Plano.findByPlanoId", query = "SELECT p FROM Plano p WHERE p.planoId = :planoId")
    , @NamedQuery(name = "Plano.findByPlanoNome", query = "SELECT p FROM Plano p WHERE p.planoNome = :planoNome")
    , @NamedQuery(name = "Plano.findByPlanoTipo", query = "SELECT p FROM Plano p WHERE p.planoTipo = :planoTipo")
    , @NamedQuery(name = "Plano.findByPlanoStatus", query = "SELECT p FROM Plano p WHERE p.planoStatus = :planoStatus")
    , @NamedQuery(name = "Plano.findByPlanoCategoria", query = "SELECT p FROM Plano p WHERE p.planoCategoria = :planoCategoria")
    , @NamedQuery(name = "Plano.findByPlanoFlag", query = "SELECT p FROM Plano p WHERE p.planoFlag = :planoFlag")})
public class Plano implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plano_id")
    private Integer planoId;
    @Size(max = 45)
    @Column(name = "plano_nome")
    private String planoNome;
    @Size(max = 45)
    @Column(name = "plano_tipo")
    private String planoTipo;
    @Size(max = 45)
    @Column(name = "plano_status")
    private String planoStatus;
    @Size(max = 45)
    @Column(name = "plano_categoria")
    private String planoCategoria;
    @Size(max = 45)
    @Column(name = "plano_flag")
    private String planoFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planoPlanoId")
    private List<Assinatura> assinaturaList;

    public Plano() {
    }

    public Plano(Integer planoId) {
        this.planoId = planoId;
    }

    public Integer getPlanoId() {
        return planoId;
    }

    public void setPlanoId(Integer planoId) {
        this.planoId = planoId;
    }

    public String getPlanoNome() {
        return planoNome;
    }

    public void setPlanoNome(String planoNome) {
        this.planoNome = planoNome;
    }

    public String getPlanoTipo() {
        return planoTipo;
    }

    public void setPlanoTipo(String planoTipo) {
        this.planoTipo = planoTipo;
    }

    public String getPlanoStatus() {
        return planoStatus;
    }

    public void setPlanoStatus(String planoStatus) {
        this.planoStatus = planoStatus;
    }

    public String getPlanoCategoria() {
        return planoCategoria;
    }

    public void setPlanoCategoria(String planoCategoria) {
        this.planoCategoria = planoCategoria;
    }

    public String getPlanoFlag() {
        return planoFlag;
    }

    public void setPlanoFlag(String planoFlag) {
        this.planoFlag = planoFlag;
    }

    @XmlTransient
    public List<Assinatura> getAssinaturaList() {
        return assinaturaList;
    }

    public void setAssinaturaList(List<Assinatura> assinaturaList) {
        this.assinaturaList = assinaturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planoId != null ? planoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plano)) {
            return false;
        }
        Plano other = (Plano) object;
        if ((this.planoId == null && other.planoId != null) || (this.planoId != null && !this.planoId.equals(other.planoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Plano[ planoId=" + planoId + " ]";
    }
    
}
