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
public class Tache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String note;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebutEstime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebutReel;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFinEstime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFintReel;

    @ManyToOne
    private Personne personne;

    public Date getDateDebutEstime() {
        return dateDebutEstime;
    }

    public void setDateDebutEstime(Date dateDebutEstime) {
        this.dateDebutEstime = dateDebutEstime;
    }

    public Date getDateDebutReel() {
        return dateDebutReel;
    }

    public void setDateDebutReel(Date dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    public Date getDateFinEstime() {
        return dateFinEstime;
    }

    public void setDateFinEstime(Date dateFinEstime) {
        this.dateFinEstime = dateFinEstime;
    }

    public Date getDateFintReel() {
        return dateFintReel;
    }

    public void setDateFintReel(Date dateFintReel) {
        this.dateFintReel = dateFintReel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        if (!(object instanceof Tache)) {
            return false;
        }
        Tache other = (Tache) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return note;
    }

}
