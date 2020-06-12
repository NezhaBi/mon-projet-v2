/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.fstg.uml.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ma.fstg.uml.bean.Retard;

/**
 *
 * @author pc
 */
@Stateless
public class RetardFacade extends AbstractFacade<Retard> {

    @PersistenceContext(unitName = "projet-uml-v1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RetardFacade() {
        super(Retard.class);
    }
    
}
