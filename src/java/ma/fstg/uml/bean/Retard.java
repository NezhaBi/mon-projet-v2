/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.fstg.uml.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author asus
 */
@Entity
public class Retard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;

    private float nombreHeure;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRetard;

    @ManyToOne
    private MotifRetard motifRetard;

    @ManyToOne
    private Personne personne;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getNombreHeure() {
        return nombreHeure;
    }

    public void setNombreHeure(float nombreHeure) {
        this.nombreHeure = nombreHeure;
    }

    public Date getDateRetard() {
        return dateRetard;
    }

    public void setDateRetard(Date dateRetard) {
        this.dateRetard = dateRetard;
    }

    public MotifRetard getMotifRetard() {
        return motifRetard;
    }

    public void setMotifRetard(MotifRetard motifRetard) {
        this.motifRetard = motifRetard;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retard)) {
            return false;
        }
        Retard other = (Retard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return description;
    }

}
