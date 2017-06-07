/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "endereco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e")
    , @NamedQuery(name = "Endereco.findByEnderecoId", query = "SELECT e FROM Endereco e WHERE e.enderecoId = :enderecoId")
    , @NamedQuery(name = "Endereco.findByEnderecoCep", query = "SELECT e FROM Endereco e WHERE e.enderecoCep = :enderecoCep")
    , @NamedQuery(name = "Endereco.findByEnderecoLogradouro", query = "SELECT e FROM Endereco e WHERE e.enderecoLogradouro = :enderecoLogradouro")
    , @NamedQuery(name = "Endereco.findByEnderecoPais", query = "SELECT e FROM Endereco e WHERE e.enderecoPais = :enderecoPais")
    , @NamedQuery(name = "Endereco.findByEnderecoCidade", query = "SELECT e FROM Endereco e WHERE e.enderecoCidade = :enderecoCidade")
    , @NamedQuery(name = "Endereco.findByEnderecoBairro", query = "SELECT e FROM Endereco e WHERE e.enderecoBairro = :enderecoBairro")
    , @NamedQuery(name = "Endereco.findByEnderecoComplemento", query = "SELECT e FROM Endereco e WHERE e.enderecoComplemento = :enderecoComplemento")
    , @NamedQuery(name = "Endereco.findByEnderecoNumero", query = "SELECT e FROM Endereco e WHERE e.enderecoNumero = :enderecoNumero")
    , @NamedQuery(name = "Endereco.findByEnderecoDescricao", query = "SELECT e FROM Endereco e WHERE e.enderecoDescricao = :enderecoDescricao")
    , @NamedQuery(name = "Endereco.findByEnderecoTipo", query = "SELECT e FROM Endereco e WHERE e.enderecoTipo = :enderecoTipo")
    , @NamedQuery(name = "Endereco.findByEnderecoUf", query = "SELECT e FROM Endereco e WHERE e.enderecoUf = :enderecoUf")
    , @NamedQuery(name = "Endereco.findByEnderecoContinente", query = "SELECT e FROM Endereco e WHERE e.enderecoContinente = :enderecoContinente")
    , @NamedQuery(name = "Endereco.findByEnderecoLatitude", query = "SELECT e FROM Endereco e WHERE e.enderecoLatitude = :enderecoLatitude")
    , @NamedQuery(name = "Endereco.findByEnderecoLongetude", query = "SELECT e FROM Endereco e WHERE e.enderecoLongetude = :enderecoLongetude")
    , @NamedQuery(name = "Endereco.findByEnderecoStatus", query = "SELECT e FROM Endereco e WHERE e.enderecoStatus = :enderecoStatus")
    , @NamedQuery(name = "Endereco.findByEnderecoFlag", query = "SELECT e FROM Endereco e WHERE e.enderecoFlag = :enderecoFlag")
    , @NamedQuery(name = "Endereco.findByEnderecoUpdate", query = "SELECT e FROM Endereco e WHERE e.enderecoUpdate = :enderecoUpdate")})
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "endereco_id")
    private Integer enderecoId;
    @Size(max = 45)
    @Column(name = "endereco_cep")
    private String enderecoCep;
    @Size(max = 45)
    @Column(name = "endereco_logradouro")
    private String enderecoLogradouro;
    @Size(max = 45)
    @Column(name = "endereco_pais")
    private String enderecoPais;
    @Size(max = 45)
    @Column(name = "endereco_cidade")
    private String enderecoCidade;
    @Size(max = 45)
    @Column(name = "endereco_bairro")
    private String enderecoBairro;
    @Size(max = 45)
    @Column(name = "endereco_complemento")
    private String enderecoComplemento;
    @Size(max = 45)
    @Column(name = "endereco_numero")
    private String enderecoNumero;
    @Size(max = 45)
    @Column(name = "endereco_descricao")
    private String enderecoDescricao;
    @Size(max = 45)
    @Column(name = "endereco_tipo")
    private String enderecoTipo;
    @Size(max = 45)
    @Column(name = "endereco_uf")
    private String enderecoUf;
    @Size(max = 45)
    @Column(name = "endereco_continente")
    private String enderecoContinente;
    @Size(max = 45)
    @Column(name = "endereco_latitude")
    private String enderecoLatitude;
    @Size(max = 45)
    @Column(name = "endereco_longetude")
    private String enderecoLongetude;
    @Size(max = 45)
    @Column(name = "endereco_status")
    private String enderecoStatus;
    @Size(max = 45)
    @Column(name = "endereco_flag")
    private String enderecoFlag;
    @Size(max = 45)
    @Column(name = "endereco_update")
    private String enderecoUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enderecoEnderecoId")
    private List<Tarefa> tarefaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enderecoEnderecoId")
    private List<Hospedagem> hospedagemList;

    public Endereco() {
    }

    public Endereco(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String getEnderecoCep() {
        return enderecoCep;
    }

    public void setEnderecoCep(String enderecoCep) {
        this.enderecoCep = enderecoCep;
    }

    public String getEnderecoLogradouro() {
        return enderecoLogradouro;
    }

    public void setEnderecoLogradouro(String enderecoLogradouro) {
        this.enderecoLogradouro = enderecoLogradouro;
    }

    public String getEnderecoPais() {
        return enderecoPais;
    }

    public void setEnderecoPais(String enderecoPais) {
        this.enderecoPais = enderecoPais;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoDescricao() {
        return enderecoDescricao;
    }

    public void setEnderecoDescricao(String enderecoDescricao) {
        this.enderecoDescricao = enderecoDescricao;
    }

    public String getEnderecoTipo() {
        return enderecoTipo;
    }

    public void setEnderecoTipo(String enderecoTipo) {
        this.enderecoTipo = enderecoTipo;
    }

    public String getEnderecoUf() {
        return enderecoUf;
    }

    public void setEnderecoUf(String enderecoUf) {
        this.enderecoUf = enderecoUf;
    }

    public String getEnderecoContinente() {
        return enderecoContinente;
    }

    public void setEnderecoContinente(String enderecoContinente) {
        this.enderecoContinente = enderecoContinente;
    }

    public String getEnderecoLatitude() {
        return enderecoLatitude;
    }

    public void setEnderecoLatitude(String enderecoLatitude) {
        this.enderecoLatitude = enderecoLatitude;
    }

    public String getEnderecoLongetude() {
        return enderecoLongetude;
    }

    public void setEnderecoLongetude(String enderecoLongetude) {
        this.enderecoLongetude = enderecoLongetude;
    }

    public String getEnderecoStatus() {
        return enderecoStatus;
    }

    public void setEnderecoStatus(String enderecoStatus) {
        this.enderecoStatus = enderecoStatus;
    }

    public String getEnderecoFlag() {
        return enderecoFlag;
    }

    public void setEnderecoFlag(String enderecoFlag) {
        this.enderecoFlag = enderecoFlag;
    }

    public String getEnderecoUpdate() {
        return enderecoUpdate;
    }

    public void setEnderecoUpdate(String enderecoUpdate) {
        this.enderecoUpdate = enderecoUpdate;
    }

    @XmlTransient
    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    @XmlTransient
    public List<Hospedagem> getHospedagemList() {
        return hospedagemList;
    }

    public void setHospedagemList(List<Hospedagem> hospedagemList) {
        this.hospedagemList = hospedagemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enderecoId != null ? enderecoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.enderecoId == null && other.enderecoId != null) || (this.enderecoId != null && !this.enderecoId.equals(other.enderecoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Endereco[ enderecoId=" + enderecoId + " ]";
    }
    
}
