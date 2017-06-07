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
@Table(name = "corrida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corrida.findAll", query = "SELECT c FROM Corrida c")
    , @NamedQuery(name = "Corrida.findByCorridaId", query = "SELECT c FROM Corrida c WHERE c.corridaId = :corridaId")
    , @NamedQuery(name = "Corrida.findByCorridaData", query = "SELECT c FROM Corrida c WHERE c.corridaData = :corridaData")
    , @NamedQuery(name = "Corrida.findByCorridaValor", query = "SELECT c FROM Corrida c WHERE c.corridaValor = :corridaValor")
    , @NamedQuery(name = "Corrida.findByCorridaDistancia", query = "SELECT c FROM Corrida c WHERE c.corridaDistancia = :corridaDistancia")
    , @NamedQuery(name = "Corrida.findByCorridaTempo", query = "SELECT c FROM Corrida c WHERE c.corridaTempo = :corridaTempo")
    , @NamedQuery(name = "Corrida.findByCorridaTipo", query = "SELECT c FROM Corrida c WHERE c.corridaTipo = :corridaTipo")
    , @NamedQuery(name = "Corrida.findByCorridaCategoria", query = "SELECT c FROM Corrida c WHERE c.corridaCategoria = :corridaCategoria")})
public class Corrida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "corrida_id")
    private Integer corridaId;
    @Column(name = "corrida_data")
    @Temporal(TemporalType.DATE)
    private Date corridaData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "corrida_valor")
    private Double corridaValor;
    @Column(name = "corrida_distancia")
    private Double corridaDistancia;
    @Column(name = "corrida_tempo")
    private Integer corridaTempo;
    @Size(max = 45)
    @Column(name = "corrida_tipo")
    private String corridaTipo;
    @Size(max = 45)
    @Column(name = "corrida_categoria")
    private String corridaCategoria;
    @JoinColumn(name = "corrida_status_corrida_status_id", referencedColumnName = "corrida_status_id")
    @ManyToOne(optional = false)
    private CorridaStatus corridaStatusCorridaStatusId;
    @JoinColumn(name = "destino_destino_id", referencedColumnName = "destino_id")
    @ManyToOne(optional = false)
    private Destino destinoDestinoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "corridaCorridaId")
    private List<CorridaServico> corridaServicoList;

    public Corrida() {
    }

    public Corrida(Integer corridaId) {
        this.corridaId = corridaId;
    }

    public Integer getCorridaId() {
        return corridaId;
    }

    public void setCorridaId(Integer corridaId) {
        this.corridaId = corridaId;
    }

    public Date getCorridaData() {
        return corridaData;
    }

    public void setCorridaData(Date corridaData) {
        this.corridaData = corridaData;
    }

    public Double getCorridaValor() {
        return corridaValor;
    }

    public void setCorridaValor(Double corridaValor) {
        this.corridaValor = corridaValor;
    }

    public Double getCorridaDistancia() {
        return corridaDistancia;
    }

    public void setCorridaDistancia(Double corridaDistancia) {
        this.corridaDistancia = corridaDistancia;
    }

    public Integer getCorridaTempo() {
        return corridaTempo;
    }

    public void setCorridaTempo(Integer corridaTempo) {
        this.corridaTempo = corridaTempo;
    }

    public String getCorridaTipo() {
        return corridaTipo;
    }

    public void setCorridaTipo(String corridaTipo) {
        this.corridaTipo = corridaTipo;
    }

    public String getCorridaCategoria() {
        return corridaCategoria;
    }

    public void setCorridaCategoria(String corridaCategoria) {
        this.corridaCategoria = corridaCategoria;
    }

    public CorridaStatus getCorridaStatusCorridaStatusId() {
        return corridaStatusCorridaStatusId;
    }

    public void setCorridaStatusCorridaStatusId(CorridaStatus corridaStatusCorridaStatusId) {
        this.corridaStatusCorridaStatusId = corridaStatusCorridaStatusId;
    }

    public Destino getDestinoDestinoId() {
        return destinoDestinoId;
    }

    public void setDestinoDestinoId(Destino destinoDestinoId) {
        this.destinoDestinoId = destinoDestinoId;
    }

    @XmlTransient
    public List<CorridaServico> getCorridaServicoList() {
        return corridaServicoList;
    }

    public void setCorridaServicoList(List<CorridaServico> corridaServicoList) {
        this.corridaServicoList = corridaServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (corridaId != null ? corridaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corrida)) {
            return false;
        }
        Corrida other = (Corrida) object;
        if ((this.corridaId == null && other.corridaId != null) || (this.corridaId != null && !this.corridaId.equals(other.corridaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Corrida[ corridaId=" + corridaId + " ]";
    }
    
}
