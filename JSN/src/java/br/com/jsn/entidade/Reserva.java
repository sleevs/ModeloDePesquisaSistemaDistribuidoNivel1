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
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")
    , @NamedQuery(name = "Reserva.findByReservaId", query = "SELECT r FROM Reserva r WHERE r.reservaId = :reservaId")
    , @NamedQuery(name = "Reserva.findByReservaNome", query = "SELECT r FROM Reserva r WHERE r.reservaNome = :reservaNome")
    , @NamedQuery(name = "Reserva.findByReservaTipo", query = "SELECT r FROM Reserva r WHERE r.reservaTipo = :reservaTipo")
    , @NamedQuery(name = "Reserva.findByReservaData", query = "SELECT r FROM Reserva r WHERE r.reservaData = :reservaData")
    , @NamedQuery(name = "Reserva.findByReservaUpdate", query = "SELECT r FROM Reserva r WHERE r.reservaUpdate = :reservaUpdate")
    , @NamedQuery(name = "Reserva.findByReservaCategoria", query = "SELECT r FROM Reserva r WHERE r.reservaCategoria = :reservaCategoria")
    , @NamedQuery(name = "Reserva.findByReservaDescricao", query = "SELECT r FROM Reserva r WHERE r.reservaDescricao = :reservaDescricao")
    , @NamedQuery(name = "Reserva.findByReservaValor", query = "SELECT r FROM Reserva r WHERE r.reservaValor = :reservaValor")
    , @NamedQuery(name = "Reserva.findByReservaStatus", query = "SELECT r FROM Reserva r WHERE r.reservaStatus = :reservaStatus")
    , @NamedQuery(name = "Reserva.findByReservaFlag", query = "SELECT r FROM Reserva r WHERE r.reservaFlag = :reservaFlag")
    , @NamedQuery(name = "Reserva.findByReservaQuantidade", query = "SELECT r FROM Reserva r WHERE r.reservaQuantidade = :reservaQuantidade")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "reserva_id")
    private Integer reservaId;
    @Size(max = 200)
    @Column(name = "reserva_nome")
    private String reservaNome;
    @Size(max = 45)
    @Column(name = "reserva_tipo")
    private String reservaTipo;
    @Column(name = "reserva_data")
    @Temporal(TemporalType.DATE)
    private Date reservaData;
    @Column(name = "reserva_update")
    @Temporal(TemporalType.DATE)
    private Date reservaUpdate;
    @Size(max = 45)
    @Column(name = "reserva_categoria")
    private String reservaCategoria;
    @Size(max = 255)
    @Column(name = "reserva_descricao")
    private String reservaDescricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "reserva_valor")
    private Double reservaValor;
    @Size(max = 45)
    @Column(name = "reserva_status")
    private String reservaStatus;
    @Column(name = "reserva_flag")
    private Integer reservaFlag;
    @Column(name = "reserva_quantidade")
    private Integer reservaQuantidade;
    @JoinColumn(name = "hospedagem_hospedagem_id", referencedColumnName = "hospedagem_id")
    @ManyToOne(optional = false)
    private Hospedagem hospedagemHospedagemId;

    public Reserva() {
    }

    public Reserva(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public Integer getReservaId() {
        return reservaId;
    }

    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public String getReservaNome() {
        return reservaNome;
    }

    public void setReservaNome(String reservaNome) {
        this.reservaNome = reservaNome;
    }

    public String getReservaTipo() {
        return reservaTipo;
    }

    public void setReservaTipo(String reservaTipo) {
        this.reservaTipo = reservaTipo;
    }

    public Date getReservaData() {
        return reservaData;
    }

    public void setReservaData(Date reservaData) {
        this.reservaData = reservaData;
    }

    public Date getReservaUpdate() {
        return reservaUpdate;
    }

    public void setReservaUpdate(Date reservaUpdate) {
        this.reservaUpdate = reservaUpdate;
    }

    public String getReservaCategoria() {
        return reservaCategoria;
    }

    public void setReservaCategoria(String reservaCategoria) {
        this.reservaCategoria = reservaCategoria;
    }

    public String getReservaDescricao() {
        return reservaDescricao;
    }

    public void setReservaDescricao(String reservaDescricao) {
        this.reservaDescricao = reservaDescricao;
    }

    public Double getReservaValor() {
        return reservaValor;
    }

    public void setReservaValor(Double reservaValor) {
        this.reservaValor = reservaValor;
    }

    public String getReservaStatus() {
        return reservaStatus;
    }

    public void setReservaStatus(String reservaStatus) {
        this.reservaStatus = reservaStatus;
    }

    public Integer getReservaFlag() {
        return reservaFlag;
    }

    public void setReservaFlag(Integer reservaFlag) {
        this.reservaFlag = reservaFlag;
    }

    public Integer getReservaQuantidade() {
        return reservaQuantidade;
    }

    public void setReservaQuantidade(Integer reservaQuantidade) {
        this.reservaQuantidade = reservaQuantidade;
    }

    public Hospedagem getHospedagemHospedagemId() {
        return hospedagemHospedagemId;
    }

    public void setHospedagemHospedagemId(Hospedagem hospedagemHospedagemId) {
        this.hospedagemHospedagemId = hospedagemHospedagemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservaId != null ? reservaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.reservaId == null && other.reservaId != null) || (this.reservaId != null && !this.reservaId.equals(other.reservaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Reserva[ reservaId=" + reservaId + " ]";
    }
    
}
