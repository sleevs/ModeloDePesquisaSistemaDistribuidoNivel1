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
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c")
    , @NamedQuery(name = "Contrato.findByContratoId", query = "SELECT c FROM Contrato c WHERE c.contratoId = :contratoId")
    , @NamedQuery(name = "Contrato.findByContratoTipo", query = "SELECT c FROM Contrato c WHERE c.contratoTipo = :contratoTipo")
    , @NamedQuery(name = "Contrato.findByContratoData", query = "SELECT c FROM Contrato c WHERE c.contratoData = :contratoData")
    , @NamedQuery(name = "Contrato.findByContratoDescricao", query = "SELECT c FROM Contrato c WHERE c.contratoDescricao = :contratoDescricao")
    , @NamedQuery(name = "Contrato.findByContratoFlag", query = "SELECT c FROM Contrato c WHERE c.contratoFlag = :contratoFlag")
    , @NamedQuery(name = "Contrato.findByContratoStatus", query = "SELECT c FROM Contrato c WHERE c.contratoStatus = :contratoStatus")})
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "contrato_id")
    private Integer contratoId;
    @Size(max = 45)
    @Column(name = "contrato_tipo")
    private String contratoTipo;
    @Column(name = "contrato_data")
    @Temporal(TemporalType.DATE)
    private Date contratoData;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "contrato_anexo")
    private String contratoAnexo;
    @Size(max = 45)
    @Column(name = "contrato_descricao")
    private String contratoDescricao;
    @Size(max = 45)
    @Column(name = "contrato_flag")
    private String contratoFlag;
    @Size(max = 45)
    @Column(name = "contrato_status")
    private String contratoStatus;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;

    public Contrato() {
    }

    public Contrato(Integer contratoId) {
        this.contratoId = contratoId;
    }

    public Integer getContratoId() {
        return contratoId;
    }

    public void setContratoId(Integer contratoId) {
        this.contratoId = contratoId;
    }

    public String getContratoTipo() {
        return contratoTipo;
    }

    public void setContratoTipo(String contratoTipo) {
        this.contratoTipo = contratoTipo;
    }

    public Date getContratoData() {
        return contratoData;
    }

    public void setContratoData(Date contratoData) {
        this.contratoData = contratoData;
    }

    public String getContratoAnexo() {
        return contratoAnexo;
    }

    public void setContratoAnexo(String contratoAnexo) {
        this.contratoAnexo = contratoAnexo;
    }

    public String getContratoDescricao() {
        return contratoDescricao;
    }

    public void setContratoDescricao(String contratoDescricao) {
        this.contratoDescricao = contratoDescricao;
    }

    public String getContratoFlag() {
        return contratoFlag;
    }

    public void setContratoFlag(String contratoFlag) {
        this.contratoFlag = contratoFlag;
    }

    public String getContratoStatus() {
        return contratoStatus;
    }

    public void setContratoStatus(String contratoStatus) {
        this.contratoStatus = contratoStatus;
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
        hash += (contratoId != null ? contratoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.contratoId == null && other.contratoId != null) || (this.contratoId != null && !this.contratoId.equals(other.contratoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Contrato[ contratoId=" + contratoId + " ]";
    }
    
}
