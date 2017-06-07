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
@Table(name = "servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servico.findAll", query = "SELECT s FROM Servico s")
    , @NamedQuery(name = "Servico.findByServicoId", query = "SELECT s FROM Servico s WHERE s.servicoId = :servicoId")
    , @NamedQuery(name = "Servico.findByServicoNome", query = "SELECT s FROM Servico s WHERE s.servicoNome = :servicoNome")
    , @NamedQuery(name = "Servico.findByServicoTipo", query = "SELECT s FROM Servico s WHERE s.servicoTipo = :servicoTipo")
    , @NamedQuery(name = "Servico.findByServicoCategoria", query = "SELECT s FROM Servico s WHERE s.servicoCategoria = :servicoCategoria")
    , @NamedQuery(name = "Servico.findByServicoData", query = "SELECT s FROM Servico s WHERE s.servicoData = :servicoData")
    , @NamedQuery(name = "Servico.findByServicoValor", query = "SELECT s FROM Servico s WHERE s.servicoValor = :servicoValor")
    , @NamedQuery(name = "Servico.findByServicoTotal", query = "SELECT s FROM Servico s WHERE s.servicoTotal = :servicoTotal")
    , @NamedQuery(name = "Servico.findByServicoTarifa", query = "SELECT s FROM Servico s WHERE s.servicoTarifa = :servicoTarifa")
    , @NamedQuery(name = "Servico.findByServicoDesconto", query = "SELECT s FROM Servico s WHERE s.servicoDesconto = :servicoDesconto")})
public class Servico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "servico_id")
    private Integer servicoId;
    @Size(max = 45)
    @Column(name = "servico_nome")
    private String servicoNome;
    @Size(max = 45)
    @Column(name = "servico_tipo")
    private String servicoTipo;
    @Size(max = 45)
    @Column(name = "servico_categoria")
    private String servicoCategoria;
    @Column(name = "servico_data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date servicoData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "servico_valor")
    private Double servicoValor;
    @Column(name = "servico_total")
    private Double servicoTotal;
    @Column(name = "servico_tarifa")
    private Double servicoTarifa;
    @Size(max = 45)
    @Column(name = "servico_desconto")
    private String servicoDesconto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<ServicoTarefa> servicoTarefaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<Contrato> contratoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<Pagamento> pagamentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<ServicoStatus> servicoStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<CompraServico> compraServicoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<CorridaServico> corridaServicoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<Qualificar> qualificarList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<EntregaServico> entregaServicoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoServicoId")
    private List<HospedagemServico> hospedagemServicoList;
    @JoinColumn(name = "anuncio_anuncio_id", referencedColumnName = "anuncio_id")
    @ManyToOne(optional = false)
    private Anuncio anuncioAnuncioId;

    public Servico() {
    }

    public Servico(Integer servicoId) {
        this.servicoId = servicoId;
    }

    public Integer getServicoId() {
        return servicoId;
    }

    public void setServicoId(Integer servicoId) {
        this.servicoId = servicoId;
    }

    public String getServicoNome() {
        return servicoNome;
    }

    public void setServicoNome(String servicoNome) {
        this.servicoNome = servicoNome;
    }

    public String getServicoTipo() {
        return servicoTipo;
    }

    public void setServicoTipo(String servicoTipo) {
        this.servicoTipo = servicoTipo;
    }

    public String getServicoCategoria() {
        return servicoCategoria;
    }

    public void setServicoCategoria(String servicoCategoria) {
        this.servicoCategoria = servicoCategoria;
    }

    public Date getServicoData() {
        return servicoData;
    }

    public void setServicoData(Date servicoData) {
        this.servicoData = servicoData;
    }

    public Double getServicoValor() {
        return servicoValor;
    }

    public void setServicoValor(Double servicoValor) {
        this.servicoValor = servicoValor;
    }

    public Double getServicoTotal() {
        return servicoTotal;
    }

    public void setServicoTotal(Double servicoTotal) {
        this.servicoTotal = servicoTotal;
    }

    public Double getServicoTarifa() {
        return servicoTarifa;
    }

    public void setServicoTarifa(Double servicoTarifa) {
        this.servicoTarifa = servicoTarifa;
    }

    public String getServicoDesconto() {
        return servicoDesconto;
    }

    public void setServicoDesconto(String servicoDesconto) {
        this.servicoDesconto = servicoDesconto;
    }

    @XmlTransient
    public List<ServicoTarefa> getServicoTarefaList() {
        return servicoTarefaList;
    }

    public void setServicoTarefaList(List<ServicoTarefa> servicoTarefaList) {
        this.servicoTarefaList = servicoTarefaList;
    }

    @XmlTransient
    public List<Contrato> getContratoList() {
        return contratoList;
    }

    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

    @XmlTransient
    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
    }

    @XmlTransient
    public List<ServicoStatus> getServicoStatusList() {
        return servicoStatusList;
    }

    public void setServicoStatusList(List<ServicoStatus> servicoStatusList) {
        this.servicoStatusList = servicoStatusList;
    }

    @XmlTransient
    public List<CompraServico> getCompraServicoList() {
        return compraServicoList;
    }

    public void setCompraServicoList(List<CompraServico> compraServicoList) {
        this.compraServicoList = compraServicoList;
    }

    @XmlTransient
    public List<CorridaServico> getCorridaServicoList() {
        return corridaServicoList;
    }

    public void setCorridaServicoList(List<CorridaServico> corridaServicoList) {
        this.corridaServicoList = corridaServicoList;
    }

    @XmlTransient
    public List<Qualificar> getQualificarList() {
        return qualificarList;
    }

    public void setQualificarList(List<Qualificar> qualificarList) {
        this.qualificarList = qualificarList;
    }

    @XmlTransient
    public List<EntregaServico> getEntregaServicoList() {
        return entregaServicoList;
    }

    public void setEntregaServicoList(List<EntregaServico> entregaServicoList) {
        this.entregaServicoList = entregaServicoList;
    }

    @XmlTransient
    public List<HospedagemServico> getHospedagemServicoList() {
        return hospedagemServicoList;
    }

    public void setHospedagemServicoList(List<HospedagemServico> hospedagemServicoList) {
        this.hospedagemServicoList = hospedagemServicoList;
    }

    public Anuncio getAnuncioAnuncioId() {
        return anuncioAnuncioId;
    }

    public void setAnuncioAnuncioId(Anuncio anuncioAnuncioId) {
        this.anuncioAnuncioId = anuncioAnuncioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servicoId != null ? servicoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servico)) {
            return false;
        }
        Servico other = (Servico) object;
        if ((this.servicoId == null && other.servicoId != null) || (this.servicoId != null && !this.servicoId.equals(other.servicoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Servico[ servicoId=" + servicoId + " ]";
    }
    
}
