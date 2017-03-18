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
@Table(name = "medecin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medecin.findAll", query = "SELECT m FROM Medecin m"),
    @NamedQuery(name = "Medecin.findByNum", query = "SELECT m FROM Medecin m WHERE m.num = :num"),
    @NamedQuery(name = "Medecin.findByNom", query = "SELECT m FROM Medecin m WHERE m.nom = :nom"),
    @NamedQuery(name = "Medecin.findByPrenom", query = "SELECT m FROM Medecin m WHERE m.prenom = :prenom")})
public class Medecin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "num")
    private Integer num;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "prenom")
    private String prenom;
//    @JoinColumn(name="CodSpec", referencedColumnName="CodSpec",insertable=false ,updatable=false)
//    @OneToOne(optional=false)
//    private Specialite spec;
    public Medecin() {
    }

    public Medecin(Integer num) {
        this.num = num;
    }

    public Medecin(Integer num, String nom, String prenom) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (num != null ? num.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medecin)) {
            return false;
        }
        Medecin other = (Medecin) object;
        if ((this.num == null && other.num != null) || (this.num != null && !this.num.equals(other.num))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.dmi.model.gclinique.Medecin[ num=" + num + " ]";
    }
    
}
