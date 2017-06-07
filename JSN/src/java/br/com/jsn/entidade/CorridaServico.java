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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "corrida_servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorridaServico.findAll", query = "SELECT c FROM CorridaServico c")
    , @NamedQuery(name = "CorridaServico.findByCorridaServicoId", query = "SELECT c FROM CorridaServico c WHERE c.corridaServicoId = :corridaServicoId")
    , @NamedQuery(name = "CorridaServico.findByCorridaServicoData", query = "SELECT c FROM CorridaServico c WHERE c.corridaServicoData = :corridaServicoData")
    , @NamedQuery(name = "CorridaServico.findByCorridaServicoFlag", query = "SELECT c FROM CorridaServico c WHERE c.corridaServicoFlag = :corridaServicoFlag")})
public class CorridaServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "corrida_servico_id")
    private Integer corridaServicoId;
    @Column(name = "corrida_servico_data")
    @Temporal(TemporalType.DATE)
    private Date corridaServicoData;
    @Column(name = "corrida_servico_flag")
    private Integer corridaServicoFlag;
    @JoinColumn(name = "corrida_corrida_id", referencedColumnName = "corrida_id")
    @ManyToOne(optional = false)
    private Corrida corridaCorridaId;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;

    public CorridaServico() {
    }

    public CorridaServico(Integer corridaServicoId) {
        this.corridaServicoId = corridaServicoId;
    }

    public Integer getCorridaServicoId() {
        return corridaServicoId;
    }

    public void setCorridaServicoId(Integer corridaServicoId) {
        this.corridaServicoId = corridaServicoId;
    }

    public Date getCorridaServicoData() {
        return corridaServicoData;
    }

    public void setCorridaServicoData(Date corridaServicoData) {
        this.corridaServicoData = corridaServicoData;
    }

    public Integer getCorridaServicoFlag() {
        return corridaServicoFlag;
    }

    public void setCorridaServicoFlag(Integer corridaServicoFlag) {
        this.corridaServicoFlag = corridaServicoFlag;
    }

    public Corrida getCorridaCorridaId() {
        return corridaCorridaId;
    }

    public void setCorridaCorridaId(Corrida corridaCorridaId) {
        this.corridaCorridaId = corridaCorridaId;
    }

    public Servico getServicoServicoId() {
        return servicoServicoId;
    }

    public void setServicoServicoId(Servico servicoServicoId) {
        this.servicoServicoId = servicoServicoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (corridaServicoId != null ? corridaServicoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorridaServico)) {
            return false;
        }
        CorridaServico other = (CorridaServico) object;
        if ((this.corridaServicoId == null && other.corridaServicoId != null) || (this.corridaServicoId != null && !this.corridaServicoId.equals(other.corridaServicoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.CorridaServico[ corridaServicoId=" + corridaServicoId + " ]";
    }
    
}
