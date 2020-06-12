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
public class Absence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long minuteAbsence;

    @ManyToOne
    private TypeAbsence typeAbsence;

    @ManyToOne
    private MotifAbsence motifAbsence;

    @ManyToOne
    private Personne personne;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeAbsence getTypeAbsence() {
        return typeAbsence;
    }

    public void setTypeAbsence(TypeAbsence typeAbsence) {
        this.typeAbsence = typeAbsence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMinuteAbsence() {
        return minuteAbsence;
    }

    public void setMinuteAbsence(long minuteAbsence) {
        this.minuteAbsence = minuteAbsence;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public MotifAbsence getMotifAbsence() {
        return motifAbsence;
    }

    public void setMotifAbsence(MotifAbsence motifAbsence) {
        this.motifAbsence = motifAbsence;
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
        if (!(object instanceof Absence)) {
            return false;
        }
        Absence other = (Absence) object;
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
