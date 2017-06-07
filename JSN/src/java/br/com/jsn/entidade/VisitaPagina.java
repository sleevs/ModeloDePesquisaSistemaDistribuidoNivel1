/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "visita_pagina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VisitaPagina.findAll", query = "SELECT v FROM VisitaPagina v")
    , @NamedQuery(name = "VisitaPagina.findByVisitaPaginaId", query = "SELECT v FROM VisitaPagina v WHERE v.visitaPaginaId = :visitaPaginaId")})
public class VisitaPagina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "visita_pagina_id")
    private Integer visitaPaginaId;
    @JoinColumn(name = "pagina_pagina_id", referencedColumnName = "pagina_id")
    @ManyToOne(optional = false)
    private Pagina paginaPaginaId;
    @JoinColumn(name = "visita_visita", referencedColumnName = "visita")
    @ManyToOne(optional = false)
    private Visita visitaVisita;

    public VisitaPagina() {
    }

    public VisitaPagina(Integer visitaPaginaId) {
        this.visitaPaginaId = visitaPaginaId;
    }

    public Integer getVisitaPaginaId() {
        return visitaPaginaId;
    }

    public void setVisitaPaginaId(Integer visitaPaginaId) {
        this.visitaPaginaId = visitaPaginaId;
    }

    public Pagina getPaginaPaginaId() {
        return paginaPaginaId;
    }

    public void setPaginaPaginaId(Pagina paginaPaginaId) {
        this.paginaPaginaId = paginaPaginaId;
    }

    public Visita getVisitaVisita() {
        return visitaVisita;
    }

    public void setVisitaVisita(Visita visitaVisita) {
        this.visitaVisita = visitaVisita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitaPaginaId != null ? visitaPaginaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitaPagina)) {
            return false;
        }
        VisitaPagina other = (VisitaPagina) object;
        if ((this.visitaPaginaId == null && other.visitaPaginaId != null) || (this.visitaPaginaId != null && !this.visitaPaginaId.equals(other.visitaPaginaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.VisitaPagina[ visitaPaginaId=" + visitaPaginaId + " ]";
    }
    
}
