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
import javax.persistence.Lob;
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
@Table(name = "transporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transporte.findAll", query = "SELECT t FROM Transporte t")
    , @NamedQuery(name = "Transporte.findByTransporteId", query = "SELECT t FROM Transporte t WHERE t.transporteId = :transporteId")
    , @NamedQuery(name = "Transporte.findByTransporteNome", query = "SELECT t FROM Transporte t WHERE t.transporteNome = :transporteNome")
    , @NamedQuery(name = "Transporte.findByTransporteTipo", query = "SELECT t FROM Transporte t WHERE t.transporteTipo = :transporteTipo")
    , @NamedQuery(name = "Transporte.findByTransporteCategoria", query = "SELECT t FROM Transporte t WHERE t.transporteCategoria = :transporteCategoria")
    , @NamedQuery(name = "Transporte.findByTransporteValor", query = "SELECT t FROM Transporte t WHERE t.transporteValor = :transporteValor")
    , @NamedQuery(name = "Transporte.findByTransporteCusto", query = "SELECT t FROM Transporte t WHERE t.transporteCusto = :transporteCusto")
    , @NamedQuery(name = "Transporte.findByTransporteTarifa", query = "SELECT t FROM Transporte t WHERE t.transporteTarifa = :transporteTarifa")
    , @NamedQuery(name = "Transporte.findByTransporteKm", query = "SELECT t FROM Transporte t WHERE t.transporteKm = :transporteKm")
    , @NamedQuery(name = "Transporte.findByTransporteAno", query = "SELECT t FROM Transporte t WHERE t.transporteAno = :transporteAno")
    , @NamedQuery(name = "Transporte.findByTransporteCor", query = "SELECT t FROM Transporte t WHERE t.transporteCor = :transporteCor")
    , @NamedQuery(name = "Transporte.findByTransporteDescricao", query = "SELECT t FROM Transporte t WHERE t.transporteDescricao = :transporteDescricao")})
public class Transporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transporte_id")
    private Integer transporteId;
    @Size(max = 45)
    @Column(name = "transporte_nome")
    private String transporteNome;
    @Size(max = 45)
    @Column(name = "transporte_tipo")
    private String transporteTipo;
    @Size(max = 45)
    @Column(name = "transporte_categoria")
    private String transporteCategoria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "transporte_valor")
    private Double transporteValor;
    @Column(name = "transporte_custo")
    private Double transporteCusto;
    @Column(name = "transporte_tarifa")
    private Double transporteTarifa;
    @Column(name = "transporte_km")
    private Integer transporteKm;
    @Column(name = "transporte_ano")
    @Temporal(TemporalType.DATE)
    private Date transporteAno;
    @Size(max = 45)
    @Column(name = "transporte_cor")
    private String transporteCor;
    @Size(max = 255)
    @Column(name = "transporte_descricao")
    private String transporteDescricao;
    @Lob
    @Size(max = 65535)
    @Column(name = "transporte_imagem")
    private String transporteImagem;

    public Transporte() {
    }

    public Transporte(Integer transporteId) {
        this.transporteId = transporteId;
    }

    public Integer getTransporteId() {
        return transporteId;
    }

    public void setTransporteId(Integer transporteId) {
        this.transporteId = transporteId;
    }

    public String getTransporteNome() {
        return transporteNome;
    }

    public void setTransporteNome(String transporteNome) {
        this.transporteNome = transporteNome;
    }

    public String getTransporteTipo() {
        return transporteTipo;
    }

    public void setTransporteTipo(String transporteTipo) {
        this.transporteTipo = transporteTipo;
    }

    public String getTransporteCategoria() {
        return transporteCategoria;
    }

    public void setTransporteCategoria(String transporteCategoria) {
        this.transporteCategoria = transporteCategoria;
    }

    public Double getTransporteValor() {
        return transporteValor;
    }

    public void setTransporteValor(Double transporteValor) {
        this.transporteValor = transporteValor;
    }

    public Double getTransporteCusto() {
        return transporteCusto;
    }

    public void setTransporteCusto(Double transporteCusto) {
        this.transporteCusto = transporteCusto;
    }

    public Double getTransporteTarifa() {
        return transporteTarifa;
    }

    public void setTransporteTarifa(Double transporteTarifa) {
        this.transporteTarifa = transporteTarifa;
    }

    public Integer getTransporteKm() {
        return transporteKm;
    }

    public void setTransporteKm(Integer transporteKm) {
        this.transporteKm = transporteKm;
    }

    public Date getTransporteAno() {
        return transporteAno;
    }

    public void setTransporteAno(Date transporteAno) {
        this.transporteAno = transporteAno;
    }

    public String getTransporteCor() {
        return transporteCor;
    }

    public void setTransporteCor(String transporteCor) {
        this.transporteCor = transporteCor;
    }

    public String getTransporteDescricao() {
        return transporteDescricao;
    }

    public void setTransporteDescricao(String transporteDescricao) {
        this.transporteDescricao = transporteDescricao;
    }

    public String getTransporteImagem() {
        return transporteImagem;
    }

    public void setTransporteImagem(String transporteImagem) {
        this.transporteImagem = transporteImagem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transporteId != null ? transporteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporte)) {
            return false;
        }
        Transporte other = (Transporte) object;
        if ((this.transporteId == null && other.transporteId != null) || (this.transporteId != null && !this.transporteId.equals(other.transporteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Transporte[ transporteId=" + transporteId + " ]";
    }
    
}
