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
@Table(name = "tarefa_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TarefaStatus.findAll", query = "SELECT t FROM TarefaStatus t")
    , @NamedQuery(name = "TarefaStatus.findByTarefaStatusId", query = "SELECT t FROM TarefaStatus t WHERE t.tarefaStatusId = :tarefaStatusId")
    , @NamedQuery(name = "TarefaStatus.findByTarefaStatusUpdate", query = "SELECT t FROM TarefaStatus t WHERE t.tarefaStatusUpdate = :tarefaStatusUpdate")
    , @NamedQuery(name = "TarefaStatus.findByTarefaStatusTipo", query = "SELECT t FROM TarefaStatus t WHERE t.tarefaStatusTipo = :tarefaStatusTipo")})
public class TarefaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tarefa_status_id")
    private Integer tarefaStatusId;
    @Column(name = "tarefa_status_update")
    @Temporal(TemporalType.DATE)
    private Date tarefaStatusUpdate;
    @Size(max = 45)
    @Column(name = "tarefa_status_tipo")
    private String tarefaStatusTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarefaStatusTarefaStatusId")
    private List<Tarefa> tarefaList;

    public TarefaStatus() {
    }

    public TarefaStatus(Integer tarefaStatusId) {
        this.tarefaStatusId = tarefaStatusId;
    }

    public Integer getTarefaStatusId() {
        return tarefaStatusId;
    }

    public void setTarefaStatusId(Integer tarefaStatusId) {
        this.tarefaStatusId = tarefaStatusId;
    }

    public Date getTarefaStatusUpdate() {
        return tarefaStatusUpdate;
    }

    public void setTarefaStatusUpdate(Date tarefaStatusUpdate) {
        this.tarefaStatusUpdate = tarefaStatusUpdate;
    }

    public String getTarefaStatusTipo() {
        return tarefaStatusTipo;
    }

    public void setTarefaStatusTipo(String tarefaStatusTipo) {
        this.tarefaStatusTipo = tarefaStatusTipo;
    }

    @XmlTransient
    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarefaStatusId != null ? tarefaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarefaStatus)) {
            return false;
        }
        TarefaStatus other = (TarefaStatus) object;
        if ((this.tarefaStatusId == null && other.tarefaStatusId != null) || (this.tarefaStatusId != null && !this.tarefaStatusId.equals(other.tarefaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.TarefaStatus[ tarefaStatusId=" + tarefaStatusId + " ]";
    }
    
}
