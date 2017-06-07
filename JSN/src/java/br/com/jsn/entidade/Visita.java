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
@Table(name = "visita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visita.findAll", query = "SELECT v FROM Visita v")
    , @NamedQuery(name = "Visita.findByVisita", query = "SELECT v FROM Visita v WHERE v.visita = :visita")
    , @NamedQuery(name = "Visita.findByVisitaTipo", query = "SELECT v FROM Visita v WHERE v.visitaTipo = :visitaTipo")
    , @NamedQuery(name = "Visita.findByVisitaSaida", query = "SELECT v FROM Visita v WHERE v.visitaSaida = :visitaSaida")
    , @NamedQuery(name = "Visita.findByVisitaEntrada", query = "SELECT v FROM Visita v WHERE v.visitaEntrada = :visitaEntrada")
    , @NamedQuery(name = "Visita.findByVisitaFlag", query = "SELECT v FROM Visita v WHERE v.visitaFlag = :visitaFlag")
    , @NamedQuery(name = "Visita.findByVisitaTempo", query = "SELECT v FROM Visita v WHERE v.visitaTempo = :visitaTempo")
    , @NamedQuery(name = "Visita.findByVisitaCategoria", query = "SELECT v FROM Visita v WHERE v.visitaCategoria = :visitaCategoria")})
public class Visita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "visita")
    private Integer visita;
    @Size(max = 45)
    @Column(name = "visita_tipo")
    private String visitaTipo;
    @Column(name = "visita_saida")
    @Temporal(TemporalType.DATE)
    private Date visitaSaida;
    @Column(name = "visita_entrada")
    @Temporal(TemporalType.DATE)
    private Date visitaEntrada;
    @Column(name = "visita_flag")
    private Integer visitaFlag;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "visita_tempo")
    private Double visitaTempo;
    @Size(max = 45)
    @Column(name = "visita_categoria")
    private String visitaCategoria;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;
    @JoinColumn(name = "visita_status_visita_status_id", referencedColumnName = "visita_status_id")
    @ManyToOne(optional = false)
    private VisitaStatus visitaStatusVisitaStatusId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visitaVisita")
    private List<VisitaPagina> visitaPaginaList;

    public Visita() {
    }

    public Visita(Integer visita) {
        this.visita = visita;
    }

    public Integer getVisita() {
        return visita;
    }

    public void setVisita(Integer visita) {
        this.visita = visita;
    }

    public String getVisitaTipo() {
        return visitaTipo;
    }

    public void setVisitaTipo(String visitaTipo) {
        this.visitaTipo = visitaTipo;
    }

    public Date getVisitaSaida() {
        return visitaSaida;
    }

    public void setVisitaSaida(Date visitaSaida) {
        this.visitaSaida = visitaSaida;
    }

    public Date getVisitaEntrada() {
        return visitaEntrada;
    }

    public void setVisitaEntrada(Date visitaEntrada) {
        this.visitaEntrada = visitaEntrada;
    }

    public Integer getVisitaFlag() {
        return visitaFlag;
    }

    public void setVisitaFlag(Integer visitaFlag) {
        this.visitaFlag = visitaFlag;
    }

    public Double getVisitaTempo() {
        return visitaTempo;
    }

    public void setVisitaTempo(Double visitaTempo) {
        this.visitaTempo = visitaTempo;
    }

    public String getVisitaCategoria() {
        return visitaCategoria;
    }

    public void setVisitaCategoria(String visitaCategoria) {
        this.visitaCategoria = visitaCategoria;
    }

    public Conta getContaConta() {
        return contaConta;
    }

    public void setContaConta(Conta contaConta) {
        this.contaConta = contaConta;
    }

    public VisitaStatus getVisitaStatusVisitaStatusId() {
        return visitaStatusVisitaStatusId;
    }

    public void setVisitaStatusVisitaStatusId(VisitaStatus visitaStatusVisitaStatusId) {
        this.visitaStatusVisitaStatusId = visitaStatusVisitaStatusId;
    }

    @XmlTransient
    public List<VisitaPagina> getVisitaPaginaList() {
        return visitaPaginaList;
    }

    public void setVisitaPaginaList(List<VisitaPagina> visitaPaginaList) {
        this.visitaPaginaList = visitaPaginaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visita != null ? visita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visita)) {
            return false;
        }
        Visita other = (Visita) object;
        if ((this.visita == null && other.visita != null) || (this.visita != null && !this.visita.equals(other.visita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Visita[ visita=" + visita + " ]";
    }
    
}
