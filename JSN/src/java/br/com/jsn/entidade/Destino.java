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
@Table(name = "destino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destino.findAll", query = "SELECT d FROM Destino d")
    , @NamedQuery(name = "Destino.findByDestinoId", query = "SELECT d FROM Destino d WHERE d.destinoId = :destinoId")
    , @NamedQuery(name = "Destino.findByDestinoPartidaCep", query = "SELECT d FROM Destino d WHERE d.destinoPartidaCep = :destinoPartidaCep")
    , @NamedQuery(name = "Destino.findByDestinoPartidaNome", query = "SELECT d FROM Destino d WHERE d.destinoPartidaNome = :destinoPartidaNome")
    , @NamedQuery(name = "Destino.findByDestinoPartidaCidade", query = "SELECT d FROM Destino d WHERE d.destinoPartidaCidade = :destinoPartidaCidade")
    , @NamedQuery(name = "Destino.findByDestinoPartidaUf", query = "SELECT d FROM Destino d WHERE d.destinoPartidaUf = :destinoPartidaUf")
    , @NamedQuery(name = "Destino.findByDestinoPartidaLogradouro", query = "SELECT d FROM Destino d WHERE d.destinoPartidaLogradouro = :destinoPartidaLogradouro")
    , @NamedQuery(name = "Destino.findByDestinoPartidaBairro", query = "SELECT d FROM Destino d WHERE d.destinoPartidaBairro = :destinoPartidaBairro")
    , @NamedQuery(name = "Destino.findByDestinoPartidaComplemento", query = "SELECT d FROM Destino d WHERE d.destinoPartidaComplemento = :destinoPartidaComplemento")
    , @NamedQuery(name = "Destino.findByDestinoPartidaPais", query = "SELECT d FROM Destino d WHERE d.destinoPartidaPais = :destinoPartidaPais")
    , @NamedQuery(name = "Destino.findByDestinoDistancia", query = "SELECT d FROM Destino d WHERE d.destinoDistancia = :destinoDistancia")
    , @NamedQuery(name = "Destino.findByDestinoTempo", query = "SELECT d FROM Destino d WHERE d.destinoTempo = :destinoTempo")
    , @NamedQuery(name = "Destino.findByDestinoData", query = "SELECT d FROM Destino d WHERE d.destinoData = :destinoData")
    , @NamedQuery(name = "Destino.findByDestinoFinalCep", query = "SELECT d FROM Destino d WHERE d.destinoFinalCep = :destinoFinalCep")
    , @NamedQuery(name = "Destino.findByDestinoFinalPais", query = "SELECT d FROM Destino d WHERE d.destinoFinalPais = :destinoFinalPais")
    , @NamedQuery(name = "Destino.findByDestinoFinalComplemento", query = "SELECT d FROM Destino d WHERE d.destinoFinalComplemento = :destinoFinalComplemento")
    , @NamedQuery(name = "Destino.findByDestinoFinalBairro", query = "SELECT d FROM Destino d WHERE d.destinoFinalBairro = :destinoFinalBairro")
    , @NamedQuery(name = "Destino.findByDestinoFinalCidade", query = "SELECT d FROM Destino d WHERE d.destinoFinalCidade = :destinoFinalCidade")
    , @NamedQuery(name = "Destino.findByDestinoFinalUf", query = "SELECT d FROM Destino d WHERE d.destinoFinalUf = :destinoFinalUf")})
public class Destino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "destino_id")
    private Integer destinoId;
    @Size(max = 45)
    @Column(name = "destino_partida_cep")
    private String destinoPartidaCep;
    @Size(max = 45)
    @Column(name = "destino_partida_nome")
    private String destinoPartidaNome;
    @Size(max = 45)
    @Column(name = "destino_partida_cidade")
    private String destinoPartidaCidade;
    @Size(max = 45)
    @Column(name = "destino_partida_uf")
    private String destinoPartidaUf;
    @Size(max = 45)
    @Column(name = "destino_partida_logradouro")
    private String destinoPartidaLogradouro;
    @Size(max = 45)
    @Column(name = "destino_partida_bairro")
    private String destinoPartidaBairro;
    @Size(max = 45)
    @Column(name = "destino_partida_complemento")
    private String destinoPartidaComplemento;
    @Size(max = 45)
    @Column(name = "destino_partida_pais")
    private String destinoPartidaPais;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "destino_distancia")
    private Double destinoDistancia;
    @Column(name = "destino_tempo")
    private Double destinoTempo;
    @Column(name = "destino_data")
    @Temporal(TemporalType.DATE)
    private Date destinoData;
    @Size(max = 45)
    @Column(name = "destino_final_cep")
    private String destinoFinalCep;
    @Size(max = 45)
    @Column(name = "destino_final_pais")
    private String destinoFinalPais;
    @Size(max = 45)
    @Column(name = "destino_final_complemento")
    private String destinoFinalComplemento;
    @Size(max = 45)
    @Column(name = "destino_final_bairro")
    private String destinoFinalBairro;
    @Size(max = 45)
    @Column(name = "destino_final_cidade")
    private String destinoFinalCidade;
    @Size(max = 45)
    @Column(name = "destino_final_uf")
    private String destinoFinalUf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destinoDestinoId")
    private List<Corrida> corridaList;

    public Destino() {
    }

    public Destino(Integer destinoId) {
        this.destinoId = destinoId;
    }

    public Integer getDestinoId() {
        return destinoId;
    }

    public void setDestinoId(Integer destinoId) {
        this.destinoId = destinoId;
    }

    public String getDestinoPartidaCep() {
        return destinoPartidaCep;
    }

    public void setDestinoPartidaCep(String destinoPartidaCep) {
        this.destinoPartidaCep = destinoPartidaCep;
    }

    public String getDestinoPartidaNome() {
        return destinoPartidaNome;
    }

    public void setDestinoPartidaNome(String destinoPartidaNome) {
        this.destinoPartidaNome = destinoPartidaNome;
    }

    public String getDestinoPartidaCidade() {
        return destinoPartidaCidade;
    }

    public void setDestinoPartidaCidade(String destinoPartidaCidade) {
        this.destinoPartidaCidade = destinoPartidaCidade;
    }

    public String getDestinoPartidaUf() {
        return destinoPartidaUf;
    }

    public void setDestinoPartidaUf(String destinoPartidaUf) {
        this.destinoPartidaUf = destinoPartidaUf;
    }

    public String getDestinoPartidaLogradouro() {
        return destinoPartidaLogradouro;
    }

    public void setDestinoPartidaLogradouro(String destinoPartidaLogradouro) {
        this.destinoPartidaLogradouro = destinoPartidaLogradouro;
    }

    public String getDestinoPartidaBairro() {
        return destinoPartidaBairro;
    }

    public void setDestinoPartidaBairro(String destinoPartidaBairro) {
        this.destinoPartidaBairro = destinoPartidaBairro;
    }

    public String getDestinoPartidaComplemento() {
        return destinoPartidaComplemento;
    }

    public void setDestinoPartidaComplemento(String destinoPartidaComplemento) {
        this.destinoPartidaComplemento = destinoPartidaComplemento;
    }

    public String getDestinoPartidaPais() {
        return destinoPartidaPais;
    }

    public void setDestinoPartidaPais(String destinoPartidaPais) {
        this.destinoPartidaPais = destinoPartidaPais;
    }

    public Double getDestinoDistancia() {
        return destinoDistancia;
    }

    public void setDestinoDistancia(Double destinoDistancia) {
        this.destinoDistancia = destinoDistancia;
    }

    public Double getDestinoTempo() {
        return destinoTempo;
    }

    public void setDestinoTempo(Double destinoTempo) {
        this.destinoTempo = destinoTempo;
    }

    public Date getDestinoData() {
        return destinoData;
    }

    public void setDestinoData(Date destinoData) {
        this.destinoData = destinoData;
    }

    public String getDestinoFinalCep() {
        return destinoFinalCep;
    }

    public void setDestinoFinalCep(String destinoFinalCep) {
        this.destinoFinalCep = destinoFinalCep;
    }

    public String getDestinoFinalPais() {
        return destinoFinalPais;
    }

    public void setDestinoFinalPais(String destinoFinalPais) {
        this.destinoFinalPais = destinoFinalPais;
    }

    public String getDestinoFinalComplemento() {
        return destinoFinalComplemento;
    }

    public void setDestinoFinalComplemento(String destinoFinalComplemento) {
        this.destinoFinalComplemento = destinoFinalComplemento;
    }

    public String getDestinoFinalBairro() {
        return destinoFinalBairro;
    }

    public void setDestinoFinalBairro(String destinoFinalBairro) {
        this.destinoFinalBairro = destinoFinalBairro;
    }

    public String getDestinoFinalCidade() {
        return destinoFinalCidade;
    }

    public void setDestinoFinalCidade(String destinoFinalCidade) {
        this.destinoFinalCidade = destinoFinalCidade;
    }

    public String getDestinoFinalUf() {
        return destinoFinalUf;
    }

    public void setDestinoFinalUf(String destinoFinalUf) {
        this.destinoFinalUf = destinoFinalUf;
    }

    @XmlTransient
    public List<Corrida> getCorridaList() {
        return corridaList;
    }

    public void setCorridaList(List<Corrida> corridaList) {
        this.corridaList = corridaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destinoId != null ? destinoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destino)) {
            return false;
        }
        Destino other = (Destino) object;
        if ((this.destinoId == null && other.destinoId != null) || (this.destinoId != null && !this.destinoId.equals(other.destinoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Destino[ destinoId=" + destinoId + " ]";
    }
    
}
