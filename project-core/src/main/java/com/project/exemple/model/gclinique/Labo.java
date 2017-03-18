/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.exemple.model.gclinique;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "labo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Labo.findAll", query = "SELECT l FROM Labo l"),
    @NamedQuery(name = "Labo.findByCodeLab", query = "SELECT l FROM Labo l WHERE l.codeLab = :codeLab"),
    @NamedQuery(name = "Labo.findByNomLab", query = "SELECT l FROM Labo l WHERE l.nomLab = :nomLab"),
    @NamedQuery(name = "Labo.findByExam", query = "SELECT l FROM Labo l WHERE l.code.exam =:exam")
})
public class Labo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "code_lab")
    private String codeLab;
    @Size(max = 50)
    @Column(name = "nom_lab")
    private String nomLab;
    
    @JoinColumn(name= "exam",referencedColumnName="code",insertable=false,updatable=false)
    @OneToOne(optional=false)
    private Analyse code;
    public Labo() {
    }

    public Labo(String codeLab) {
        this.codeLab = codeLab;
    }

    public String getCodeLab() {
        return codeLab;
    }

    public void setCodeLab(String codeLab) {
        this.codeLab = codeLab;
    }

    public String getNomLab() {
        return nomLab;
    }

    public void setNomLab(String nomLab) {
        this.nomLab = nomLab;
    }
 
    public Analyse getCode() {
        return code;
    }

    public void setCode(Analyse code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeLab != null ? codeLab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Labo)) {
            return false;
        }
        Labo other = (Labo) object;
        if ((this.codeLab == null && other.codeLab != null) || (this.codeLab != null && !this.codeLab.equals(other.codeLab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.dmi.model.gclinique.Labo[ codeLab=" + codeLab + " ]";
    }
    
}
