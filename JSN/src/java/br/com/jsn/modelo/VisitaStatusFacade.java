/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.modelo;

import br.com.jsn.entidade.VisitaStatus;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ADMINIBM
 */
@Stateless
public class VisitaStatusFacade extends AbstractFacade<VisitaStatus> {

    @PersistenceContext(unitName = "JSNPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VisitaStatusFacade() {
        super(VisitaStatus.class);
    }
    
}
