/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.exemple.dao;

import com.project.exemple.model.gclinique.Analyse;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
public class AnalyseDao {
    EntityManager em = FactoriesRepository.GetEntityManager(FactoriesRepository.getDmiPU());
    
    public List<Analyse> GetListanalyse() {
    
       Query query= em.createNamedQuery("Analyse.findAll", Analyse.class);
       return query.setFirstResult(0).setMaxResults(50).getResultList();
    }
}
