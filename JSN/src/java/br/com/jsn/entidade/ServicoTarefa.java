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
@Table(name = "servico_tarefa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServicoTarefa.findAll", query = "SELECT s FROM ServicoTarefa s")
    , @NamedQuery(name = "ServicoTarefa.findByServicoTarefaId", query = "SELECT s FROM ServicoTarefa s WHERE s.servicoTarefaId = :servicoTarefaId")
    , @NamedQuery(name = "ServicoTarefa.findByServicoTarefaData", query = "SELECT s FROM ServicoTarefa s WHERE s.servicoTarefaData = :servicoTarefaData")
    , @NamedQuery(name = "ServicoTarefa.findByServicoTarefaFlag", query = "SELECT s FROM ServicoTarefa s WHERE s.servicoTarefaFlag = :servicoTarefaFlag")})
public class ServicoTarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "servico_tarefa_id")
    private Integer servicoTarefaId;
    @Column(name = "servico_tarefa_data")
    @Temporal(TemporalType.DATE)
    private Date servicoTarefaData;
    @Size(max = 45)
    @Column(name = "servico_tarefa_flag")
    private String servicoTarefaFlag;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;
    @JoinColumn(name = "tarefa_tarefa_id", referencedColumnName = "tarefa_id")
    @ManyToOne(optional = false)
    private Tarefa tarefaTarefaId;

    public ServicoTarefa() {
    }

    public ServicoTarefa(Integer servicoTarefaId) {
        this.servicoTarefaId = servicoTarefaId;
    }

    public Integer getServicoTarefaId() {
        return servicoTarefaId;
    }

    public void setServicoTarefaId(Integer servicoTarefaId) {
        this.servicoTarefaId = servicoTarefaId;
    }

    public Date getServicoTarefaData() {
        return servicoTarefaData;
    }

    public void setServicoTarefaData(Date servicoTarefaData) {
        this.servicoTarefaData = servicoTarefaData;
    }

    public String getServicoTarefaFlag() {
        return servicoTarefaFlag;
    }

    public void setServicoTarefaFlag(String servicoTarefaFlag) {
        this.servicoTarefaFlag = servicoTarefaFlag;
    }

    public Servico getServicoServicoId() {
        return servicoServicoId;
    }

    public void setServicoServicoId(Servico servicoServicoId) {
        this.servicoServicoId = servicoServicoId;
    }

    public Tarefa getTarefaTarefaId() {
        return tarefaTarefaId;
    }

    public void setTarefaTarefaId(Tarefa tarefaTarefaId) {
        this.tarefaTarefaId = tarefaTarefaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servicoTarefaId != null ? servicoTarefaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicoTarefa)) {
            return false;
        }
        ServicoTarefa other = (ServicoTarefa) object;
        if ((this.servicoTarefaId == null && other.servicoTarefaId != null) || (this.servicoTarefaId != null && !this.servicoTarefaId.equals(other.servicoTarefaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.ServicoTarefa[ servicoTarefaId=" + servicoTarefaId + " ]";
    }
    
}
