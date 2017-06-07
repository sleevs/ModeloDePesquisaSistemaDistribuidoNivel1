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
import javax.persistence.Lob;
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
@Table(name = "atividade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atividade.findAll", query = "SELECT a FROM Atividade a")
    , @NamedQuery(name = "Atividade.findByAtividadeId", query = "SELECT a FROM Atividade a WHERE a.atividadeId = :atividadeId")
    , @NamedQuery(name = "Atividade.findByAtividadeInicio", query = "SELECT a FROM Atividade a WHERE a.atividadeInicio = :atividadeInicio")
    , @NamedQuery(name = "Atividade.findByAtividadeFim", query = "SELECT a FROM Atividade a WHERE a.atividadeFim = :atividadeFim")
    , @NamedQuery(name = "Atividade.findByAtividadeUpdate", query = "SELECT a FROM Atividade a WHERE a.atividadeUpdate = :atividadeUpdate")
    , @NamedQuery(name = "Atividade.findByAtividadeValor", query = "SELECT a FROM Atividade a WHERE a.atividadeValor = :atividadeValor")
    , @NamedQuery(name = "Atividade.findByAtividadeTipo", query = "SELECT a FROM Atividade a WHERE a.atividadeTipo = :atividadeTipo")
    , @NamedQuery(name = "Atividade.findByAtividadeCategoria", query = "SELECT a FROM Atividade a WHERE a.atividadeCategoria = :atividadeCategoria")
    , @NamedQuery(name = "Atividade.findByAtividadeFlag", query = "SELECT a FROM Atividade a WHERE a.atividadeFlag = :atividadeFlag")
    , @NamedQuery(name = "Atividade.findByAtividadeStatus", query = "SELECT a FROM Atividade a WHERE a.atividadeStatus = :atividadeStatus")})
public class Atividade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "atividade_id")
    private Integer atividadeId;
    @Lob
    @Size(max = 16777215)
    @Column(name = "atividade_ordem")
    private String atividadeOrdem;
    @Column(name = "atividade_inicio")
    @Temporal(TemporalType.DATE)
    private Date atividadeInicio;
    @Column(name = "atividade_fim")
    @Temporal(TemporalType.DATE)
    private Date atividadeFim;
    @Column(name = "atividade_update")
    @Temporal(TemporalType.DATE)
    private Date atividadeUpdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "atividade_valor")
    private Double atividadeValor;
    @Size(max = 45)
    @Column(name = "atividade_tipo")
    private String atividadeTipo;
    @Size(max = 45)
    @Column(name = "atividade_categoria")
    private String atividadeCategoria;
    @Column(name = "atividade_flag")
    private Integer atividadeFlag;
    @Size(max = 45)
    @Column(name = "atividade_status")
    private String atividadeStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atividadeAtividadeId")
    private List<Tarefa> tarefaList;

    public Atividade() {
    }

    public Atividade(Integer atividadeId) {
        this.atividadeId = atividadeId;
    }

    public Integer getAtividadeId() {
        return atividadeId;
    }

    public void setAtividadeId(Integer atividadeId) {
        this.atividadeId = atividadeId;
    }

    public String getAtividadeOrdem() {
        return atividadeOrdem;
    }

    public void setAtividadeOrdem(String atividadeOrdem) {
        this.atividadeOrdem = atividadeOrdem;
    }

    public Date getAtividadeInicio() {
        return atividadeInicio;
    }

    public void setAtividadeInicio(Date atividadeInicio) {
        this.atividadeInicio = atividadeInicio;
    }

    public Date getAtividadeFim() {
        return atividadeFim;
    }

    public void setAtividadeFim(Date atividadeFim) {
        this.atividadeFim = atividadeFim;
    }

    public Date getAtividadeUpdate() {
        return atividadeUpdate;
    }

    public void setAtividadeUpdate(Date atividadeUpdate) {
        this.atividadeUpdate = atividadeUpdate;
    }

    public Double getAtividadeValor() {
        return atividadeValor;
    }

    public void setAtividadeValor(Double atividadeValor) {
        this.atividadeValor = atividadeValor;
    }

    public String getAtividadeTipo() {
        return atividadeTipo;
    }

    public void setAtividadeTipo(String atividadeTipo) {
        this.atividadeTipo = atividadeTipo;
    }

    public String getAtividadeCategoria() {
        return atividadeCategoria;
    }

    public void setAtividadeCategoria(String atividadeCategoria) {
        this.atividadeCategoria = atividadeCategoria;
    }

    public Integer getAtividadeFlag() {
        return atividadeFlag;
    }

    public void setAtividadeFlag(Integer atividadeFlag) {
        this.atividadeFlag = atividadeFlag;
    }

    public String getAtividadeStatus() {
        return atividadeStatus;
    }

    public void setAtividadeStatus(String atividadeStatus) {
        this.atividadeStatus = atividadeStatus;
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
        hash += (atividadeId != null ? atividadeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atividade)) {
            return false;
        }
        Atividade other = (Atividade) object;
        if ((this.atividadeId == null && other.atividadeId != null) || (this.atividadeId != null && !this.atividadeId.equals(other.atividadeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Atividade[ atividadeId=" + atividadeId + " ]";
    }
    
}
