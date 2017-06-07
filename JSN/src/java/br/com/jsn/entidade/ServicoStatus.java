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
@Table(name = "servico_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServicoStatus.findAll", query = "SELECT s FROM ServicoStatus s")
    , @NamedQuery(name = "ServicoStatus.findByContaStatusId", query = "SELECT s FROM ServicoStatus s WHERE s.contaStatusId = :contaStatusId")
    , @NamedQuery(name = "ServicoStatus.findByContaStatusTipo", query = "SELECT s FROM ServicoStatus s WHERE s.contaStatusTipo = :contaStatusTipo")
    , @NamedQuery(name = "ServicoStatus.findByContaStatusUpdate", query = "SELECT s FROM ServicoStatus s WHERE s.contaStatusUpdate = :contaStatusUpdate")
    , @NamedQuery(name = "ServicoStatus.findByServicoStatusFlag", query = "SELECT s FROM ServicoStatus s WHERE s.servicoStatusFlag = :servicoStatusFlag")})
public class ServicoStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "conta_status_id")
    private Integer contaStatusId;
    @Size(max = 45)
    @Column(name = "conta_status_tipo")
    private String contaStatusTipo;
    @Column(name = "conta_status_update")
    @Temporal(TemporalType.DATE)
    private Date contaStatusUpdate;
    @Size(max = 45)
    @Column(name = "servico_status_flag")
    private String servicoStatusFlag;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;

    public ServicoStatus() {
    }

    public ServicoStatus(Integer contaStatusId) {
        this.contaStatusId = contaStatusId;
    }

    public Integer getContaStatusId() {
        return contaStatusId;
    }

    public void setContaStatusId(Integer contaStatusId) {
        this.contaStatusId = contaStatusId;
    }

    public String getContaStatusTipo() {
        return contaStatusTipo;
    }

    public void setContaStatusTipo(String contaStatusTipo) {
        this.contaStatusTipo = contaStatusTipo;
    }

    public Date getContaStatusUpdate() {
        return contaStatusUpdate;
    }

    public void setContaStatusUpdate(Date contaStatusUpdate) {
        this.contaStatusUpdate = contaStatusUpdate;
    }

    public String getServicoStatusFlag() {
        return servicoStatusFlag;
    }

    public void setServicoStatusFlag(String servicoStatusFlag) {
        this.servicoStatusFlag = servicoStatusFlag;
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
        hash += (contaStatusId != null ? contaStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicoStatus)) {
            return false;
        }
        ServicoStatus other = (ServicoStatus) object;
        if ((this.contaStatusId == null && other.contaStatusId != null) || (this.contaStatusId != null && !this.contaStatusId.equals(other.contaStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.ServicoStatus[ contaStatusId=" + contaStatusId + " ]";
    }
    
}
