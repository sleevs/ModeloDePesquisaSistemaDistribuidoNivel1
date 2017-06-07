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
@Table(name = "registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r")
    , @NamedQuery(name = "Registro.findByRegistroId", query = "SELECT r FROM Registro r WHERE r.registroId = :registroId")
    , @NamedQuery(name = "Registro.findByRegistroNome", query = "SELECT r FROM Registro r WHERE r.registroNome = :registroNome")
    , @NamedQuery(name = "Registro.findByRegistroEmail", query = "SELECT r FROM Registro r WHERE r.registroEmail = :registroEmail")
    , @NamedQuery(name = "Registro.findByRegistroToken", query = "SELECT r FROM Registro r WHERE r.registroToken = :registroToken")
    , @NamedQuery(name = "Registro.findByRegistroStatus", query = "SELECT r FROM Registro r WHERE r.registroStatus = :registroStatus")
    , @NamedQuery(name = "Registro.findByRegistroOrigem", query = "SELECT r FROM Registro r WHERE r.registroOrigem = :registroOrigem")
    , @NamedQuery(name = "Registro.findByRegistroTipo", query = "SELECT r FROM Registro r WHERE r.registroTipo = :registroTipo")
    , @NamedQuery(name = "Registro.findByRegistroSenha", query = "SELECT r FROM Registro r WHERE r.registroSenha = :registroSenha")
    , @NamedQuery(name = "Registro.findByRegistroData", query = "SELECT r FROM Registro r WHERE r.registroData = :registroData")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "registro_id")
    private Integer registroId;
    @Size(max = 45)
    @Column(name = "registro_nome")
    private String registroNome;
    @Size(max = 100)
    @Column(name = "registro_email")
    private String registroEmail;
    @Size(max = 200)
    @Column(name = "registro_token")
    private String registroToken;
    @Size(max = 45)
    @Column(name = "registro_status")
    private String registroStatus;
    @Size(max = 45)
    @Column(name = "registro_origem")
    private String registroOrigem;
    @Size(max = 45)
    @Column(name = "registro_tipo")
    private String registroTipo;
    @Size(max = 45)
    @Column(name = "registro_senha")
    private String registroSenha;
    @Column(name = "registro_data")
    @Temporal(TemporalType.DATE)
    private Date registroData;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;

    public Registro() {
    }

    public Registro(Integer registroId) {
        this.registroId = registroId;
    }

    public Integer getRegistroId() {
        return registroId;
    }

    public void setRegistroId(Integer registroId) {
        this.registroId = registroId;
    }

    public String getRegistroNome() {
        return registroNome;
    }

    public void setRegistroNome(String registroNome) {
        this.registroNome = registroNome;
    }

    public String getRegistroEmail() {
        return registroEmail;
    }

    public void setRegistroEmail(String registroEmail) {
        this.registroEmail = registroEmail;
    }

    public String getRegistroToken() {
        return registroToken;
    }

    public void setRegistroToken(String registroToken) {
        this.registroToken = registroToken;
    }

    public String getRegistroStatus() {
        return registroStatus;
    }

    public void setRegistroStatus(String registroStatus) {
        this.registroStatus = registroStatus;
    }

    public String getRegistroOrigem() {
        return registroOrigem;
    }

    public void setRegistroOrigem(String registroOrigem) {
        this.registroOrigem = registroOrigem;
    }

    public String getRegistroTipo() {
        return registroTipo;
    }

    public void setRegistroTipo(String registroTipo) {
        this.registroTipo = registroTipo;
    }

    public String getRegistroSenha() {
        return registroSenha;
    }

    public void setRegistroSenha(String registroSenha) {
        this.registroSenha = registroSenha;
    }

    public Date getRegistroData() {
        return registroData;
    }

    public void setRegistroData(Date registroData) {
        this.registroData = registroData;
    }

    public Conta getContaConta() {
        return contaConta;
    }

    public void setContaConta(Conta contaConta) {
        this.contaConta = contaConta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registroId != null ? registroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.registroId == null && other.registroId != null) || (this.registroId != null && !this.registroId.equals(other.registroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Registro[ registroId=" + registroId + " ]";
    }
    
}
