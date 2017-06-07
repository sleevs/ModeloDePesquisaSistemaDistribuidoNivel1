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
import javax.persistence.Lob;
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
@Table(name = "tarefa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarefa.findAll", query = "SELECT t FROM Tarefa t")
    , @NamedQuery(name = "Tarefa.findByTarefaId", query = "SELECT t FROM Tarefa t WHERE t.tarefaId = :tarefaId")
    , @NamedQuery(name = "Tarefa.findByTarefaTipo", query = "SELECT t FROM Tarefa t WHERE t.tarefaTipo = :tarefaTipo")
    , @NamedQuery(name = "Tarefa.findByTarefaValor", query = "SELECT t FROM Tarefa t WHERE t.tarefaValor = :tarefaValor")
    , @NamedQuery(name = "Tarefa.findByTarefaData", query = "SELECT t FROM Tarefa t WHERE t.tarefaData = :tarefaData")
    , @NamedQuery(name = "Tarefa.findByTarefaCategoria", query = "SELECT t FROM Tarefa t WHERE t.tarefaCategoria = :tarefaCategoria")})
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tarefa_id")
    private Integer tarefaId;
    @Size(max = 45)
    @Column(name = "tarefa_tipo")
    private String tarefaTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tarefa_valor")
    private Double tarefaValor;
    @Column(name = "tarefa_data")
    @Temporal(TemporalType.DATE)
    private Date tarefaData;
    @Size(max = 45)
    @Column(name = "tarefa_categoria")
    private String tarefaCategoria;
    @Lob
    @Size(max = 16777215)
    @Column(name = "tarefa_descricao")
    private String tarefaDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarefaTarefaId")
    private List<ServicoTarefa> servicoTarefaList;
    @JoinColumn(name = "atividade_atividade_id", referencedColumnName = "atividade_id")
    @ManyToOne(optional = false)
    private Atividade atividadeAtividadeId;
    @JoinColumn(name = "endereco_endereco_id", referencedColumnName = "endereco_id")
    @ManyToOne(optional = false)
    private Endereco enderecoEnderecoId;
    @JoinColumn(name = "tarefa_status_tarefa_status_id", referencedColumnName = "tarefa_status_id")
    @ManyToOne(optional = false)
    private TarefaStatus tarefaStatusTarefaStatusId;

    public Tarefa() {
    }

    public Tarefa(Integer tarefaId) {
        this.tarefaId = tarefaId;
    }

    public Integer getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(Integer tarefaId) {
        this.tarefaId = tarefaId;
    }

    public String getTarefaTipo() {
        return tarefaTipo;
    }

    public void setTarefaTipo(String tarefaTipo) {
        this.tarefaTipo = tarefaTipo;
    }

    public Double getTarefaValor() {
        return tarefaValor;
    }

    public void setTarefaValor(Double tarefaValor) {
        this.tarefaValor = tarefaValor;
    }

    public Date getTarefaData() {
        return tarefaData;
    }

    public void setTarefaData(Date tarefaData) {
        this.tarefaData = tarefaData;
    }

    public String getTarefaCategoria() {
        return tarefaCategoria;
    }

    public void setTarefaCategoria(String tarefaCategoria) {
        this.tarefaCategoria = tarefaCategoria;
    }

    public String getTarefaDescricao() {
        return tarefaDescricao;
    }

    public void setTarefaDescricao(String tarefaDescricao) {
        this.tarefaDescricao = tarefaDescricao;
    }

    @XmlTransient
    public List<ServicoTarefa> getServicoTarefaList() {
        return servicoTarefaList;
    }

    public void setServicoTarefaList(List<ServicoTarefa> servicoTarefaList) {
        this.servicoTarefaList = servicoTarefaList;
    }

    public Atividade getAtividadeAtividadeId() {
        return atividadeAtividadeId;
    }

    public void setAtividadeAtividadeId(Atividade atividadeAtividadeId) {
        this.atividadeAtividadeId = atividadeAtividadeId;
    }

    public Endereco getEnderecoEnderecoId() {
        return enderecoEnderecoId;
    }

    public void setEnderecoEnderecoId(Endereco enderecoEnderecoId) {
        this.enderecoEnderecoId = enderecoEnderecoId;
    }

    public TarefaStatus getTarefaStatusTarefaStatusId() {
        return tarefaStatusTarefaStatusId;
    }

    public void setTarefaStatusTarefaStatusId(TarefaStatus tarefaStatusTarefaStatusId) {
        this.tarefaStatusTarefaStatusId = tarefaStatusTarefaStatusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarefaId != null ? tarefaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.tarefaId == null && other.tarefaId != null) || (this.tarefaId != null && !this.tarefaId.equals(other.tarefaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Tarefa[ tarefaId=" + tarefaId + " ]";
    }
    
}
