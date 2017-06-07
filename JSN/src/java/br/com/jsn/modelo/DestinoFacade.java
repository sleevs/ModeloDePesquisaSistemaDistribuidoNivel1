/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.modelo;

import br.com.jsn.entidade.Destino;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ADMINIBM
 */
@Stateless
public class DestinoFacade extends AbstractFacade<Destino> {

    @PersistenceContext(unitName = "JSNPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DestinoFacade() {
        super(Destino.class);
    }
    
}
