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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "qualificar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Qualificar.findAll", query = "SELECT q FROM Qualificar q")
    , @NamedQuery(name = "Qualificar.findByQualificarId", query = "SELECT q FROM Qualificar q WHERE q.qualificarId = :qualificarId")
    , @NamedQuery(name = "Qualificar.findByQualificarTipo", query = "SELECT q FROM Qualificar q WHERE q.qualificarTipo = :qualificarTipo")
    , @NamedQuery(name = "Qualificar.findByQualificarCategoria", query = "SELECT q FROM Qualificar q WHERE q.qualificarCategoria = :qualificarCategoria")
    , @NamedQuery(name = "Qualificar.findByQualificarValor", query = "SELECT q FROM Qualificar q WHERE q.qualificarValor = :qualificarValor")
    , @NamedQuery(name = "Qualificar.findByQualificarAtendimento", query = "SELECT q FROM Qualificar q WHERE q.qualificarAtendimento = :qualificarAtendimento")
    , @NamedQuery(name = "Qualificar.findByQualificarPontualidade", query = "SELECT q FROM Qualificar q WHERE q.qualificarPontualidade = :qualificarPontualidade")
    , @NamedQuery(name = "Qualificar.findByQualificarServico", query = "SELECT q FROM Qualificar q WHERE q.qualificarServico = :qualificarServico")
    , @NamedQuery(name = "Qualificar.findByQualificarProfissional", query = "SELECT q FROM Qualificar q WHERE q.qualificarProfissional = :qualificarProfissional")
    , @NamedQuery(name = "Qualificar.findByQualificarDescricao", query = "SELECT q FROM Qualificar q WHERE q.qualificarDescricao = :qualificarDescricao")})
public class Qualificar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "qualificar_id")
    private Integer qualificarId;
    @Size(max = 45)
    @Column(name = "qualificar_tipo")
    private String qualificarTipo;
    @Size(max = 45)
    @Column(name = "qualificar_categoria")
    private String qualificarCategoria;
    @Column(name = "qualificar_valor")
    private Integer qualificarValor;
    @Column(name = "qualificar_atendimento")
    private Integer qualificarAtendimento;
    @Column(name = "qualificar_pontualidade")
    private Integer qualificarPontualidade;
    @Column(name = "qualificar_servico")
    private Integer qualificarServico;
    @Column(name = "qualificar_profissional")
    private Integer qualificarProfissional;
    @Size(max = 255)
    @Column(name = "qualificar_descricao")
    private String qualificarDescricao;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;

    public Qualificar() {
    }

    public Qualificar(Integer qualificarId) {
        this.qualificarId = qualificarId;
    }

    public Integer getQualificarId() {
        return qualificarId;
    }

    public void setQualificarId(Integer qualificarId) {
        this.qualificarId = qualificarId;
    }

    public String getQualificarTipo() {
        return qualificarTipo;
    }

    public void setQualificarTipo(String qualificarTipo) {
        this.qualificarTipo = qualificarTipo;
    }

    public String getQualificarCategoria() {
        return qualificarCategoria;
    }

    public void setQualificarCategoria(String qualificarCategoria) {
        this.qualificarCategoria = qualificarCategoria;
    }

    public Integer getQualificarValor() {
        return qualificarValor;
    }

    public void setQualificarValor(Integer qualificarValor) {
        this.qualificarValor = qualificarValor;
    }

    public Integer getQualificarAtendimento() {
        return qualificarAtendimento;
    }

    public void setQualificarAtendimento(Integer qualificarAtendimento) {
        this.qualificarAtendimento = qualificarAtendimento;
    }

    public Integer getQualificarPontualidade() {
        return qualificarPontualidade;
    }

    public void setQualificarPontualidade(Integer qualificarPontualidade) {
        this.qualificarPontualidade = qualificarPontualidade;
    }

    public Integer getQualificarServico() {
        return qualificarServico;
    }

    public void setQualificarServico(Integer qualificarServico) {
        this.qualificarServico = qualificarServico;
    }

    public Integer getQualificarProfissional() {
        return qualificarProfissional;
    }

    public void setQualificarProfissional(Integer qualificarProfissional) {
        this.qualificarProfissional = qualificarProfissional;
    }

    public String getQualificarDescricao() {
        return qualificarDescricao;
    }

    public void setQualificarDescricao(String qualificarDescricao) {
        this.qualificarDescricao = qualificarDescricao;
    }

    public Conta getContaConta() {
        return contaConta;
    }

    public void setContaConta(Conta contaConta) {
        this.contaConta = contaConta;
    }

    public Servico getServicoServicoId() {
        return servicoServicoId;
    }

    public void setServicoServicoId(Servico servicoServicoId) {
        this.servicoServicoId = servicoServicoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qualificarId != null ? qualificarId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Qualificar)) {
            return false;
        }
        Qualificar other = (Qualificar) object;
        if ((this.qualificarId == null && other.qualificarId != null) || (this.qualificarId != null && !this.qualificarId.equals(other.qualificarId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Qualificar[ qualificarId=" + qualificarId + " ]";
    }
    
}
