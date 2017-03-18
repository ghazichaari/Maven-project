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
@Table(name = "specialite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialite.findAll", query = "SELECT s FROM Specialite s"),
    @NamedQuery(name = "Specialite.findByCodSpec", query = "SELECT s FROM Specialite s WHERE s.codSpec = :codSpec"),
    @NamedQuery(name = "Specialite.findByLibSpec", query = "SELECT s FROM Specialite s WHERE s.libSpec = :libSpec")})
public class Specialite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CodSpec")
    private Integer codSpec;
    @Size(max = 10)
    @Column(name = "LibSpec")
    private String libSpec;

    public Specialite() {
    }

    public Specialite(Integer codSpec) {
        this.codSpec = codSpec;
    }

    public Integer getCodSpec() {
        return codSpec;
    }

    public void setCodSpec(Integer codSpec) {
        this.codSpec = codSpec;
    }

    public String getLibSpec() {
        return libSpec;
    }

    public void setLibSpec(String libSpec) {
        this.libSpec = libSpec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSpec != null ? codSpec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialite)) {
            return false;
        }
        Specialite other = (Specialite) object;
        if ((this.codSpec == null && other.codSpec != null) || (this.codSpec != null && !this.codSpec.equals(other.codSpec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.dmi.model.gclinique.Specialite[ codSpec=" + codSpec + " ]";
    }
    
}
