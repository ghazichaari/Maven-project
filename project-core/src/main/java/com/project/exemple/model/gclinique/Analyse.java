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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "analyse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Analyse.findAll", query = "SELECT a FROM Analyse a"),
    @NamedQuery(name = "Analyse.findByCode", query = "SELECT a FROM Analyse a WHERE a.code = :code"),
    @NamedQuery(name = "Analyse.findByExam", query = "SELECT a FROM Analyse a WHERE a.exam = :exam")})
public class Analyse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "code")
    private String code;
    @Size(max = 50)
    @Column(name = "exam")
    private String exam;

    public Analyse() {
    }

    public Analyse(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Analyse)) {
            return false;
        }
        Analyse other = (Analyse) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.dmi.model.gclinique.Analyse[ code=" + code + " ]";
    }
    
}
